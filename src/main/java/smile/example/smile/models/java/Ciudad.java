package smile.example.smile.models.java;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "ciudad")
public class Ciudad {
    @Id @GeneratedValue (strategy = GerenationType.IDENTITY) @Column (name = "id_ciudad")
    private Long id;
    @Column (nullable = false)
    private String ciudad;

    @ManyToOne
    public Perfil perfil;

    public Ciudad(Long id, String ciudad, Perfil perfil) {
        this.id = id;
        this.ciudad = ciudad;
        this.perfil = perfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }



    
}
