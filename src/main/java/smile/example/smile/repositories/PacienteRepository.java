package smile.example.smile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import smile.example.smile.models.java.Paciente;


public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}

