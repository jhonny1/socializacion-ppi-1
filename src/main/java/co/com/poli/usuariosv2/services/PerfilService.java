package co.com.poli.usuariosv2.services;


import co.com.poli.usuariosv2.persistence.entity.Perfil;

import java.util.List;

public interface PerfilService {

    Perfil save(Perfil perfil);
    List<Perfil> findAll();



}