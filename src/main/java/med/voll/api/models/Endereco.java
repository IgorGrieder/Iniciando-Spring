package med.voll.api.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import med.voll.api.informacao.EnderecoPessoas;

@Embeddable
@Getter
public class Endereco {

  private String logradouro;
  private String bairro;
  private String cep;
  private String numero;
  private String complemento;
  private String cidade;
  private String uf;

  public Endereco(EnderecoPessoas endereco) {
    this.logradouro = endereco.logradouro();
    this.uf = endereco.uf();
    this.bairro = endereco.bairro();
    this.cep = endereco.cep();
    this.numero = endereco.numero();
    this.complemento = endereco.complemento();
    this.cidade = endereco.cidade();
  }

  public Endereco() {
  }
}
