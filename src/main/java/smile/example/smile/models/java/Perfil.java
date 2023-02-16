package smile.example.smile.models.java;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "perfil")
public class Perfil {
    @Id @GeneratedValue (strategy = GerenationType.IDENTITY) @Column (name = "id_perfil" , nullable = false)    
    private String apellido;
    private int edad;
    private int telefono;
    private String direccion;


    @OneToOne
    public Paciente paciente;
    @ManyToOne
    public Ciudad ciudad;
    
    public Perfil(String apellido, int edad, int telefono, String direccion) {
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Int getEdad() {
        return edad;
    }

    public void setEdad(Int edad) {
        this.edad = edad;
    }

    public Int getTelefono() {
        return telefono;
    }

    public void setTelefono(Int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
    
}
