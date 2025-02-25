package med.voll.api.models;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.informacao.EnderecoPessoas;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

  public void atualizarInformacoes(EnderecoPessoas dados) {
    if (dados.numero() != null) {
      this.numero = dados.numero();
    }
    if (dados.uf() != null) {
      this.uf = dados.uf();
    }
    if (dados.cep() != null) {
      this.cep = dados.cep();
    }
    if (dados.logradouro() != null) {
      this.logradouro = dados.logradouro();
    }
    if (dados.bairro() != null) {
      this.bairro = dados.bairro();
    }
    if (dados.cidade() != null) {
      this.cidade = dados.cidade();
    }
    if (dados.bairro() != null) {
      this.bairro = dados.bairro();
    }
  }
}
