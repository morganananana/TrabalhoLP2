package trabalhoLp.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Repitil extends TipoAnimal{
    @Column
    private boolean peconhento;

    public boolean isPeconhento() {
        return peconhento;
    }

    public void setPeconhento(boolean peconhento) {
        this.peconhento = peconhento;
    }
}
