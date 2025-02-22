package med.voll.api.pacientes;

import med.voll.api.endereco.Endereco;

/**
 * DadosPacientes
 */
public record DadosPacientes(String nome, String email, Endereco endereco, String cpf, String telefone) {
}
