package med.voll.api.endereco;

/**
 * Endereco
 */
public record Endereco(String logradouro, String cep, String numero, String complemento, String bairro, String uf,
    String cidade) {
}
