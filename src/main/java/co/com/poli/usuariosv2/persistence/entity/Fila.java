package co.com.poli.usuariosv2.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name="fila")

public class Fila {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_fila")
    private Integer id_fila;
    @Column(name = "duracion")
    private Integer duracion;



 @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    @JsonBackReference
    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "id")
    private Tarea tareas;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fila fila = (Fila) o;
        return Objects.equals(id_fila, fila.id_fila);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_fila);
    }

}
