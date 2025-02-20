package med.voll.api.medicos;

import med.voll.api.endereco.Endereco;

/**
 * DadosMedicos
 */
public record DadosMedicos(String nome, String email, String crm, Especialidade especialidade, Endereco endereco) {
}
