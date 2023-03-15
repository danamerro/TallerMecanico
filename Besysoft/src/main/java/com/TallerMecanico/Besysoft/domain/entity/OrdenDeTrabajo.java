package com.TallerMecanico.Besysoft.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ORDEN_DE_TRABAJO")
@AllArgsConstructor
@NoArgsConstructor
public class OrdenDeTrabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDEN_DE_TRABAJO")
    private Long idOrdenDeTrabajo;
    private Integer cantidadCuotas;
    private String detalleFalla;
    private String estado;
    private LocalDate fechaFinReparacion;
    private LocalDate fechaIngreso;
    private LocalDate fechaPago;
    private String formaDePago;
    private Double importeTotal;
    private Long kilometraje;
    private String nivelCombustible;
    private String tipoTarjeta;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Empleado> empleadoId;
    //una orden de trabajo para un vehiculo
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Vehiculo vehiculoAsociado;
}
