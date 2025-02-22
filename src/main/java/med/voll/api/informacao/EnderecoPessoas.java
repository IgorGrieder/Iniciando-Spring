package med.voll.api.informacao;

import jakarta.validation.constraints.NotBlank;

/**
 * Endereco
 */
public record EnderecoPessoas(
    @NotBlank String logradouro,

    @NotBlank String cep,

    String numero,

    String complemento,

    @NotBlank String bairro,

    @NotBlank String uf,

    @NotBlank String cidade) {
}
