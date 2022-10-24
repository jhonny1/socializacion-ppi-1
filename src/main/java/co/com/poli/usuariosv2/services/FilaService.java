package co.com.poli.usuariosv2.services;

import co.com.poli.usuariosv2.persistence.entity.Fila;

import java.util.List;

public interface FilaService {


    Fila save(Fila fila);
    List<Fila> findAll();
}
