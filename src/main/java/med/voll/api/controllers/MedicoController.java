package med.voll.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.medicos.DadosMedicos;

/**
 * MedicoController
 */
@RestController
@RequestMapping("/medicos")
public class MedicoController {

  @PostMapping
  public DadosMedicos cadastrar(@RequestBody DadosMedicos dadosMedicos) {
    return dadosMedicos;
  }
}
