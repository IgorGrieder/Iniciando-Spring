package med.voll.api.medicos;

import med.voll.api.models.Endereco;
import med.voll.api.models.Medico;

public record MedicoAdicionado(Long id, String nome, String email, String crm, String telefone,
    Especialidade especialidade, Endereco endereco) {

  public MedicoAdicionado(Medico medico) {
    this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(),
        medico.getEspecialidade(), medico.getEndereco());
  }

}
