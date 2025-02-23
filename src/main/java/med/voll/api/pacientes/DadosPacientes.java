package med.voll.api.pacientes;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import med.voll.api.informacao.EnderecoPessoas;

/**
 * DadosPacientes
 */
public record DadosPacientes(
    @NotBlank String nome,

    @Email @NotBlank String email,

    @Valid EnderecoPessoas endereco,

    @NotBlank @Pattern(regexp = "\\d{11}") String cpf,

    @NotBlank String telefone) {
}
