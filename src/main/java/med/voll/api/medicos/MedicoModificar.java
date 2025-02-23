package med.voll.api.medicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import med.voll.api.informacao.EnderecoPessoas;

public record MedicoModificar(
    @NotBlank Long id,

    String nome,

    String email,

    @Pattern(regexp = "\\d{9}") String telefone,

    EnderecoPessoas endereco) {
}
