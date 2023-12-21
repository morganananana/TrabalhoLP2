package trabalhoLp.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Peixe extends TipoAnimal{
    @Column(length = 100)
    private String tipoAgua;

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}
