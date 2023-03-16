package com.TallerMecanico.Besysoft.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DETALLE_ORDEN_TRABAJO")
@AllArgsConstructor
@NoArgsConstructor
public class DetalleOrdenTrabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DETALLE_ORDEN_TRABAJO")
    private Long idDetalleOrdenTrabajo;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private OrdenDeTrabajo ordenDeTrabajoAsociada;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Repuesto> repuestosAsociados;

}
