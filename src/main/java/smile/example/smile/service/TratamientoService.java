package smile.example.smile.service;

import java.util.List;

import org.springframework.stereotype.Service;

import smile.example.smile.models.java.Tratamiento;
import smile.example.smile.repositories.TratamientoRepository;


@Service
public class TratamientoService {
    private TratamientoRepository repository;

    public TratamientoService(TratamientoRepository repository) {
        this.repository = repository;
    }

    public List<Tratamiento> getAll(){
        return repository.findAll();

    }


    

}
