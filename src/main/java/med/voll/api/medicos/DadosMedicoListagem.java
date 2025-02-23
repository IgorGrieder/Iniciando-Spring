package med.voll.api.medicos;

import med.voll.api.models.Medico;

/**
 * DadosMedicoListagem
 */
public record DadosMedicoListagem(String nome, String email, String crm, Especialidade especialidade) {

  public DadosMedicoListagem(Medico medico) {
    this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
  }
}
