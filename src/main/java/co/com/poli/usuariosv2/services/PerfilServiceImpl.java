package co.com.poli.usuariosv2.services;

import co.com.poli.usuariosv2.persistence.entity.Perfil;
import co.com.poli.usuariosv2.persistence.repository.PerfilRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
public class PerfilServiceImpl implements  PerfilService{

    private final PerfilRepository repository;

    @Override
    public Perfil save(Perfil perfil) {
        return repository.save(perfil);
    }

    @Override
    public List<Perfil> findAll() {
        return repository.findAll();
    }
}