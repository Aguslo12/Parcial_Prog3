package com.colmena.ejcolmenatec.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Domicilio extends Base{

    @Column (name = "calle")
    private String calle;

    @Column (name = "numero")
    private int numero;

    @ManyToOne (optional = false,fetch = FetchType.EAGER)
    //  optional = false: Este atributo indicamos que la localidad no puede ser nula a la hora de crear un domicilio
    @JoinColumn (name = "fk_localidad")
    private Localidad localidad;
}
