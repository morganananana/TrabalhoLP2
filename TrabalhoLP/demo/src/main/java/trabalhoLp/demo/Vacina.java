package trabalhoLp.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Vacina {
    @Id
    @Column
    private Integer idVacina;
    @Column(length = 100)
    private String nome;
    @Column
    private LocalDate validade;
    @Column(length = 100)
    private  String doencasAplicaveis;
    @ManyToOne
    private Mamifero mamifero;

    public Integer getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(Integer idVacina) {
        this.idVacina = idVacina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getDoencasAplicaveis() {
        return doencasAplicaveis;
    }

    public void setDoencasAplicaveis(String doencasAplicaveis) {
        this.doencasAplicaveis = doencasAplicaveis;
    }

    public Mamifero getMamifero() {
        return mamifero;
    }

    public void setMamifero(Mamifero mamifero) {
        this.mamifero = mamifero;
    }
}
