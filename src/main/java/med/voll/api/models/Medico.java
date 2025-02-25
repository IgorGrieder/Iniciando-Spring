package med.voll.api.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.medicos.DadosMedicos;
import med.voll.api.medicos.Especialidade;
import med.voll.api.medicos.MedicoModificar;

/**
 * Medico
 */
@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String email;
  private String crm;
  private String telefone;

  @Enumerated(EnumType.STRING)
  private Especialidade especialidade;

  @Embedded
  private Endereco endereco;

  public Medico(DadosMedicos dadosMedicos) {
    this.email = dadosMedicos.email();
    this.nome = dadosMedicos.nome();
    this.crm = dadosMedicos.crm();
    this.especialidade = dadosMedicos.especialidade();
    this.endereco = new Endereco(dadosMedicos.endereco());
    this.telefone = dadosMedicos.telefone();
  }

  public void atualizarInformacoes(MedicoModificar medico) {
    if (medico.nome() != null) {
      this.nome = medico.nome();
    }
    if (medico.telefone() != null) {
      this.telefone = medico.telefone();
    }
    if (medico.email() != null) {
      this.email = medico.email();
    }
    if (medico.endereco() != null) {
      this.endereco.atualizarInformacoes(medico.endereco());
    }
  }
}
