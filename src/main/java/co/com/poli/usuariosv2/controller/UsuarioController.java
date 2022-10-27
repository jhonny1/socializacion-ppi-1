package co.com.poli.usuariosv2.controller;


import co.com.poli.usuariosv2.exception.UsuarioException;
import co.com.poli.usuariosv2.persistence.entity.Usuario;
import co.com.poli.usuariosv2.persistence.repository.UsuarioRepository;
import co.com.poli.usuariosv2.services.UsuarioService;
import co.com.poli.usuariosv2.services.UsuarioServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor

public class UsuarioController {
    private final UsuarioService usuarioService;
    private final UsuarioServiceImpl usuarioServiceImpl;
    @PostMapping
    public Usuario save(@RequestBody Usuario usuario) {

              usuario.setActivo(equals(false));



        return usuarioService.save(usuario);
    }



    @GetMapping
    public List<Usuario> findAll() {

        return usuarioService.findAll();
    }

    @DeleteMapping("/{id_us}")
    public ResponseEntity<?> deleteUsuarioById(@PathVariable("id_us")Integer id_us){
       Usuario usuario = this.usuarioServiceImpl.deleteUsuarioById(id_us);
        if(Objects.isNull(usuario)){
                throw new UsuarioException("Usuario eliminado ok ", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.noContent().build();
    }









}
