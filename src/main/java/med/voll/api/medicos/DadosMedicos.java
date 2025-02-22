package med.voll.api.medicos;

import med.voll.api.informacao.EnderecoPessoas;

/**
 * DadosMedicos
 */
public record DadosMedicos(String nome, String email, String crm, Especialidade especialidade,
    EnderecoPessoas endereco) {
}
