package smile.example.smile.models.java;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id @Column (name = "dni" , nullable = false)
    private String dni;
    @Column( length=30 , nullable = false)
    private String nombre;

    @OneToOne
    private Perfil perfil;

    @ManyToMany
    private List< Tratamiento > tratamiento;
    
    public Paciente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
}
