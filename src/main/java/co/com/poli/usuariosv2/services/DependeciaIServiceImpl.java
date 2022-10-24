package co.com.poli.usuariosv2.services;


import co.com.poli.usuariosv2.persistence.entity.Dependencia;
import co.com.poli.usuariosv2.persistence.repository.DependenciaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DependeciaIServiceImpl implements DependenciaService {


    private final DependenciaRepository repository;

    @Override
    public Dependencia save(Dependencia dependencia) {
        return repository.save(dependencia);
    }

    @Override
    public List<Dependencia> findAll() {
        return repository.findAll();
    }
}