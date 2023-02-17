package smile.example.smile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import smile.example.smile.models.java.Perfil;

public interface PerfilRepository extends JpaRepository <Perfil, Long> {
    
}
