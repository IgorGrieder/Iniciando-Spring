package med.voll.api.informacao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

/**
 * Endereco
 */
public record EnderecoPessoas(
    @NotBlank String logradouro,

    @NotBlank @Pattern(regexp = "\\d{11}") String cep,

    @NotBlank @Pattern(regexp = "\\d{9}") String numero,

    String complemento,

    @NotBlank String bairro,

    @NotBlank String uf,

    @NotBlank String cidade) {
}
