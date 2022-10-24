package co.com.poli.usuariosv2.services;


import co.com.poli.usuariosv2.persistence.entity.Fila;
import co.com.poli.usuariosv2.persistence.repository.FilaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class FilaServiceImpl implements FilaService{

    private final FilaRepository repository;

    @Override
    public Fila save(Fila fila) {
        return repository.save(fila);
    }

    @Override
    public List<Fila> findAll() {
        return repository.findAll();
    }
}
