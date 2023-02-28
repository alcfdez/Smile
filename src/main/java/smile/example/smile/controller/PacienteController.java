package smile.example.smile.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import smile.example.smile.service.PacienteService;
import smile.example.smile.service.PerfilService;
import smile.example.smile.service.TratamientoService;

@RestController
@RequestMapping(path = "/api/paciente")

public class PacienteController{
    private PacienteService service;
    private PerfilService perfilService;
    private TratamientoService tratamientoService;
   
   
    public PacienteController(PacienteService service) {
        this.service = service;
    }


    
}