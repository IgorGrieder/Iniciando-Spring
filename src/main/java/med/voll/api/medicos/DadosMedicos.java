package med.voll.api.medicos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.informacao.EnderecoPessoas;

/**
 * DadosMedicos
 */
public record DadosMedicos(
    @NotBlank String nome,

    @Email @NotBlank String email,

    @NotBlank @Pattern(regexp = "\\d{4,6}") String crm,

    @NotNull Especialidade especialidade,

    @NotNull @Valid EnderecoPessoas endereco) {
}
