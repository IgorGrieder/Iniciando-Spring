package med.voll.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import jakarta.validation.Valid;
import med.voll.api.medicos.DadosMedicoListagem;
import med.voll.api.medicos.DadosMedicos;
import med.voll.api.medicos.MedicoAdicionado;
import med.voll.api.medicos.MedicoDeletar;
import med.voll.api.medicos.MedicoModificar;
import med.voll.api.models.Medico;
import med.voll.api.repository.MedicoRepository;

/**
 * MedicoController
 */
@RestController
@RequestMapping("/medicos")
public class MedicoController {

  @Autowired
  private MedicoRepository repository;

  @PostMapping
  @Transactional
  public ResponseEntity cadastrar(@RequestBody @Valid DadosMedicos dadosMedicos, UriComponentsBuilder uri) {
    var medico = new Medico(dadosMedicos);
    repository.save(medico);

    var uriCreated = uri.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri();
    return ResponseEntity.created(uriCreated).body(new MedicoAdicionado(medico));
  }

  @GetMapping
  public ResponseEntity<List<DadosMedicoListagem>> listar() {
    return ResponseEntity.ok(
        repository.findAll().stream().map(DadosMedicoListagem::new).toList());
  }

  @DeleteMapping
  @Transactional
  public ResponseEntity deletar(@RequestBody @Valid MedicoDeletar medico) {
    repository.deleteById(medico.id());
    return ResponseEntity.ok().build();
  }

  @PutMapping
  @Transactional
  public ResponseEntity alterar(@RequestBody @Valid MedicoModificar medico) {
    var medicoAlterado = repository.getReferenceById(medico.id());
    medicoAlterado.atualizarInformacoes(medico);

    // Apenas para exercitar irei retornar o novo medico criado
    return ResponseEntity.ok(new MedicoAdicionado(medicoAlterado));
  }
}
