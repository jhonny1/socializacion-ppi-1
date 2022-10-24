package co.com.poli.usuariosv2.services;

import co.com.poli.usuariosv2.persistence.entity.Tarea;
import co.com.poli.usuariosv2.persistence.repository.TareaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service


public class TareaServiceImpl implements TareaService{


    private final TareaRepository repository;

    @Override
    public Tarea save(Tarea tarea) {
        return repository.save(tarea);
    }

    @Override
    public List<Tarea> findAll() {
        return repository.findAll();
    }
}
