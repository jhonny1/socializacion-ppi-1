package co.com.poli.usuariosv2.persistence.repository;


import co.com.poli.usuariosv2.persistence.entity.Dependencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DependenciaRepository extends JpaRepository<Dependencia,Integer> {
}
