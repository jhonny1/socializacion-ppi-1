package co.com.poli.usuariosv2.controller;

import co.com.poli.usuariosv2.persistence.entity.Dependencia;
import co.com.poli.usuariosv2.services.DependenciaService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dependencias")
@RequiredArgsConstructor

public class DependenciaController {


        private final DependenciaService dependenciaService;

        @PostMapping
    public Dependencia save(@RequestBody Dependencia dependencia) {
            return dependenciaService.save(dependencia);
        }

        @GetMapping
        public List<Dependencia> findAll() {
            return dependenciaService.findAll();
        }
    }
