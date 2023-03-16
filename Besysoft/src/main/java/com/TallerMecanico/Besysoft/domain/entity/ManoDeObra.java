package com.TallerMecanico.Besysoft.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MANO_DE_OBRA")
@AllArgsConstructor
@NoArgsConstructor
public class ManoDeObra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MANO_DE_OBRA")
    private Long IdManoDeObra;
    @Column(name = "DETALLE")
    private String detalle;
    @Column(name = "DURACION_HS")
    private Date duracionHs;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Mecanico mecanicoAsociado;
    //porque es una mano de obra a una orden de trabajo
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private OrdenDeTrabajo manoDeObraAsociada;

}
