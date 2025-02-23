package med.voll.api.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import med.voll.api.pacientes.DadosPacientes;

/**
 * Paciente
 */
@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String email;
  private String cpf;
  private String telefone;

  @Embedded
  private Endereco endereco;

  public Paciente() {
  }

  public Paciente(DadosPacientes dadosPacientes) {
    this.cpf = dadosPacientes.cpf();
    this.nome = dadosPacientes.nome();
    this.email = dadosPacientes.email();
    this.telefone = dadosPacientes.telefone();
    this.endereco = new Endereco(dadosPacientes.endereco());
  }
}
