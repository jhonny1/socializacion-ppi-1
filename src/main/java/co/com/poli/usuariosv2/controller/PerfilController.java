package co.com.poli.usuariosv2.controller;


import co.com.poli.usuariosv2.persistence.entity.Perfil;
import co.com.poli.usuariosv2.services.PerfilService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/perfil")
@RequiredArgsConstructor
public class PerfilController {

    private final PerfilService perfilService;

    @PostMapping
    public Perfil save(@RequestBody Perfil perfil) {
        return perfilService.save(perfil);
    }

    @GetMapping
    public List<Perfil> findAll() {
        return perfilService.findAll();
    }


}