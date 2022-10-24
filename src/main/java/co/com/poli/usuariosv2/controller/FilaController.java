package co.com.poli.usuariosv2.controller;

import co.com.poli.usuariosv2.persistence.entity.Fila;
import co.com.poli.usuariosv2.services.FilaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping ("/fila")
@RequiredArgsConstructor



public class FilaController {
    private final FilaService filaService;

    @PostMapping
    public Fila save(@RequestBody Fila fila) {
        return filaService.save(fila);
    }

    @GetMapping
    public List<Fila> findAll() {
        return filaService.findAll();
    }

}
