package co.com.poli.usuariosv2.services;

import co.com.poli.usuariosv2.persistence.entity.Tarea;

import java.util.List;

public interface TareaService {


    Tarea save(Tarea tarea);
    List<Tarea> findAll();
}
