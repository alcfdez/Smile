package smile.example.smile.service;

import java.util.List;

import smile.example.smile.models.java.Ciudad;
import smile.example.smile.repositories.CiudadRepository;

public class CiudadService {
    private CiudadRepository repository;

    public CiudadService(CiudadRepository repository) {
        this.repository = repository;
    }

    public List<Ciudad> getll(){
        return repository.findAll();

    }
    
    public void save (Ciudad ciudad){
        repository.save(ciudad);
    }

}
