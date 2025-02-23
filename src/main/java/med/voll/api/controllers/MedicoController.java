package med.voll.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.medicos.DadosMedicoListagem;
import med.voll.api.medicos.DadosMedicos;
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
  public void cadastrar(@RequestBody @Valid DadosMedicos dadosMedicos) {
    repository.save(new Medico(dadosMedicos));
  }

  @GetMapping
  public List<DadosMedicoListagem> listar() {
    return repository.findAll().stream().map(DadosMedicoListagem::new).toList();
  }

  @DeleteMapping
  @Transactional
  public void deletar(@RequestBody @Valid MedicoDeletar medico) {
    repository.deleteById(medico.id());
  }

  @PutMapping
  @Transactional
  public void alterar(@RequestBody @Valid MedicoModificar medico) {
    var medicoEncontrado = repository.getReferenceById(medico.id());
    medicoEncontrado.atualizarInformacoes(medico);
  }
}
