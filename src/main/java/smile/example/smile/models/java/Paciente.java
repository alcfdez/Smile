package smile.example.smile.models.java;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import smile.example.smile.models.Tratamiento;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id @Column (name = "dni")
    private String dni;
    @Column(nullable = false)
    private String nombre;

    @OneToOne
    private Perfil perfil;

    @ManyToMany
    private Tratamiento tratamiento;
    
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
