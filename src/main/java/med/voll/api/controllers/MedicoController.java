package med.voll.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.medicos.DadosMedicos;
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
  public void cadastrar(@RequestBody DadosMedicos dadosMedicos) {
    repository.save(new Medico(dadosMedicos));
  }
}
