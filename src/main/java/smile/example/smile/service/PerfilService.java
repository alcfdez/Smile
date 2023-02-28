package smile.example.smile.service;

import java.util.List;

import smile.example.smile.models.java.Perfil;
import smile.example.smile.repositories.PerfilRepository;

public class PerfilService {
    private PerfilRepository repository;

    public PerfilService(PerfilRepository repository) {
        this.repository = repository;
    }

   
    public List<Perfil> getAll(){
        return repository.findAll();
    }

    public void save( Perfil perfil){
        repository.save(perfil);
    }

}
