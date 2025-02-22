package med.voll.api.informacao;

/**
 * Endereco
 */
public record EnderecoPessoas(String logradouro, String cep, String numero, String complemento, String bairro,
    String uf,
    String cidade) {
}
