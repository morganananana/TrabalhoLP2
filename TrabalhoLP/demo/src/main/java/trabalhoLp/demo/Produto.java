package trabalhoLp.demo;

import jakarta.persistence.*;

@Entity
public class Produto {
    @Id
    @Column
    private Integer idProduto;
    @Column
    private Number valor;
    @Column(length = 100)
    private String descricao;
    @ManyToOne
    private TipoAnimal tipoAnimal;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Number getValor() {
        return valor;
    }

    public void setValor(Number valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
