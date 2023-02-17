package smile.example.smile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import smile.example.smile.models.java.Tratamiento;

public interface TratamientoRepository extends JpaRepository <Tratamiento, Long> {
    
}
