package co.com.poli.usuariosv2.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "usuario")


public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_us")
    private Integer id_us;
    @Column(name = "fecha_nacimiento")
    private Date fechanacimiento;
    @Column(name = "activo")
    private Boolean activo;

    @JsonManagedReference
    @OneToMany(mappedBy = "usuario",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Perfil> perfiles;

    @JsonManagedReference
    @OneToOne(mappedBy = "usuario",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Dependencia dependencias;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id_us, usuario.id_us);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_us);
    }
}
