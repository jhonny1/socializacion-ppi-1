package co.com.poli.usuariosv2.services;

import co.com.poli.usuariosv2.persistence.entity.Usuario;
import co.com.poli.usuariosv2.persistence.entity.UsuarioStatus;
import co.com.poli.usuariosv2.persistence.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
        private final UsuarioRepository repository;

        @Override
        public Usuario save(Usuario usuario) {
            return repository.save(usuario);
        }

        @Override
        public List<Usuario> findAll() {
            return repository.findAll();
        }


    @Transactional
    public Usuario deleteUsuarioById(Integer id_us){
        Optional<Usuario> usuario =this.usuarioRepository.findById(id_us);
        if(usuario.isEmpty()){
            return null;
        }
        this.usuarioRepository.deleteById(id_us);
        return usuario.orElse(null);
    }


}


