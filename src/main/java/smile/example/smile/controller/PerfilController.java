package smile.example.smile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import smile.example.smile.service.CiudadService;
import smile.example.smile.service.PerfilService;
import smile.example.smile.service.TratamientoService;

@RestController
@RequestMapping(path = "/api/perfil")

public class PerfilController {
    private PerfilService service;
    private CiudadService ciudadService;

    
    public PerfilController(PerfilService service, CiudadService ciudadService) {
        this.service = service;
        this.ciudadService = ciudadService;
    }

    
}
