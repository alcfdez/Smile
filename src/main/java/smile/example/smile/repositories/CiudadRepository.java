package smile.example.smile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import smile.example.smile.models.java.Ciudad;

public interface CiudadRepository extends JpaRepository <Ciudad, Long>{
    
}
