package med.voll.api.pacientes;

import med.voll.api.informacao.EnderecoPessoas;

/**
 * DadosPacientes
 */
public record DadosPacientes(String nome, String email, EnderecoPessoas endereco, String cpf, String telefone) {
}
