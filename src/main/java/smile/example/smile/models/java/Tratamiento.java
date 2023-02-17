package smile.example.smile.models.java;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="tratamiento")
public class Tratamiento {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY) @Column (name = "id_tratamiento")
    private Long id;
    @Column (nullable = false)
    private String tratamiento;

    
    public Tratamiento(Long id, String tratamiento) {
        this.id = id;
        this.tratamiento = tratamiento;
    }
    public Long genId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getTratamiento(){
        return tratamiento;
    }
    public void setTratamiento(String tratamiento){
        this.tratamiento = tratamiento;
    }
   
    }

