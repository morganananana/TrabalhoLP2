package trabalhoLp.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class TipoAnimal {
    @Id
    @Column
    private Integer idTipoAnimal;
    @Column(length = 100)
    private String especie;
    @OneToMany
    private List<Pet> pets;

    public Integer getIdTipoAnimal() {
        return idTipoAnimal;
    }

    public void setIdTipoAnimal(Integer idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
