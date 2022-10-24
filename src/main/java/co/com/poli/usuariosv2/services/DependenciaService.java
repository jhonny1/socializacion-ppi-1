package co.com.poli.usuariosv2.services;


import co.com.poli.usuariosv2.persistence.entity.Dependencia;
import java.util.List;

public interface DependenciaService {

    Dependencia save(Dependencia dependencia);
    List<Dependencia> findAll();
}
