package com.colmena.ejcolmenatec.entities;


import com.colmena.ejcolmenatec.entities.Base;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Persona extends Base {
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private int dni;

    // Establecer una relación One-to-One con la entidad Domicilio.
    @OneToOne(cascade = CascadeType.ALL)
    // Especificar la columna de unión en la base de datos como "fk_domicilio".
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    // Esta anotación define una tabla de unión personalizada llamada "persona_libro" para la relación One-to-Many con Libro.
    @OneToMany (cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    /*
        .orphanRemoval: Sirve para que cuando eliminemos a una persona, también eliminemos los libros que le pertenecen
        a esa persona en específico

        FetchType.EAGER: Esto significa que las entidades relacionadas se cargarán inmediatamente junto con la entidad
        principal cuando se recupere la entidad principal de la base de datos.
     */
    @JoinTable (
            name = "persona_libro",
            joinColumns = @JoinColumn (name = "persona_Id"),
            inverseJoinColumns = @JoinColumn (name = "libro_Id")
    )
    private List<Libro> libros = new ArrayList<>();
}
