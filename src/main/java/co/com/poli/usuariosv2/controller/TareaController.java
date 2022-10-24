package co.com.poli.usuariosv2.controller;

import co.com.poli.usuariosv2.persistence.entity.Tarea;
import co.com.poli.usuariosv2.services.TareaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tareas")
@RequiredArgsConstructor
@RestController
public class TareaController {

    private final TareaService tareaService;

    @PostMapping
    public Tarea save(@RequestBody Tarea tarea) {
        return tareaService.save(tarea);
    }

    @GetMapping
    public List<Tarea> findAll() {
        return tareaService.findAll();
    }
}
