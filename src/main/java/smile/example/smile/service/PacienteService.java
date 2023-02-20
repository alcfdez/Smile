package smile.example.smile.service;

import java.util.List;

import org.springframework.stereotype.Service;

import smile.example.smile.models.java.Paciente;
import smile.example.smile.repositories.PacienteRepository;
import smile.example.smile.repositories.PerfilRepository;
import smile.example.smile.repositories.TratamientoRepository;

@Service
public class PacienteService {
    private PacienteRepository repository;
    private PerfilRepository perfilRepository;
    private TratamientoRepository tratamientoRepository;
   
    public PacienteService(PacienteRepository repository, PerfilRepository perfilRepository,
            TratamientoRepository tratamientoRepository) {
        this.repository = repository;
        this.perfilRepository = perfilRepository;
        this.tratamientoRepository = tratamientoRepository;
    }

    public List<Paciente> getAll (){
        return repository.findAll();
    }
    
    public Paciente getOne (Long id){
        return repository.findById(id).get();

    }
    
    // public void save(PacientePayLoads paciente) {
    //     Paciente pacienteToAdd = new Paciente(null, paciente.getDni(), paciente.getNombre() perfilRepository.findAll(paciente.getAll))

    
        
    }


