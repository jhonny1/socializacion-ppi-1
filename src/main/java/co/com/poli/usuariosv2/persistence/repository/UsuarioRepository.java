package co.com.poli.usuariosv2.persistence.repository;


import co.com.poli.usuariosv2.persistence.entity.Usuario;
import co.com.poli.usuariosv2.persistence.entity.UsuarioStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{




}
