package co.com.poli.usuariosv2.services;

import co.com.poli.usuariosv2.persistence.entity.Usuario;
import java.util.List;
public interface UsuarioService {
        Usuario save(Usuario usuario);
        List<Usuario> findAll();



}


