package med.voll.api.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.pacientes.DadosPacientes;

/**
 * PacienteController
 */
@RestController
@RequestMapping("/pacientes")
public class PacienteController {

  public DadosPacientes cadastrar(@RequestBody DadosPacientes dadosPaciente) {
    return dadosPaciente;
  }
}
