package com.colmena.ejcolmenatec.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@Table(name = "libro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Libro extends Base {

    @Column (name = "fecha")
    private int fecha;

    @Column (name = "genero")
    private String genero;

    @Column (name = "paginas")
    private int paginas;

    @Column (name = "titulo")
    private String titulo;

    @ManyToMany(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    /*
        CascadeType.REFRESH: indica que se debe propagar la operación REFRESH a las entidades secundarias cuando se
        aplica a la entidad principal.
     */
    private List<Autor> autores;
}
