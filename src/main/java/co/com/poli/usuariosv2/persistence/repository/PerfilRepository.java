package co.com.poli.usuariosv2.persistence.repository;


import co.com.poli.usuariosv2.persistence.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface PerfilRepository  extends JpaRepository<Perfil,Integer> {

    }
