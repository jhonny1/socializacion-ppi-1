package co.com.poli.usuariosv2.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "tareas")

public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id_t;
    @Column(name = "nombre")
    private String nombre;

    @JsonBackReference
    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "id_t")
    private Fila fila;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarea tarea = (Tarea) o;
        return Objects.equals(id_t, tarea.id_t);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_t);
    }
}
