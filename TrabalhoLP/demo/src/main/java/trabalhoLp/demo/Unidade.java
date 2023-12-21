package trabalhoLp.demo;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Unidade {
    @Id
    @Column
    private Integer idUnidade;
    @Column(length = 100)
    private String nome;
    @OneToMany
    private List<Atendimento> atendimentos;
    @ManyToOne
    private Endereco endereco;

    public Integer getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(Integer idUnidade) {
        this.idUnidade = idUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(List<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
