package co.com.poli.usuariosv2.persistence.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "dependencias")


public class Dependencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id_d;
    @Column(name = "nombre")
    private String nombre;


    @JsonBackReference
    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "usuario_id")
    private Usuario usuario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dependencia that = (Dependencia) o;
        return Objects.equals(id_d, that.id_d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_d);
    }

}
