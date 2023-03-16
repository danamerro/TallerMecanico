package com.TallerMecanico.Besysoft.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "VEHICULO")
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_VEHICULO")
    private Long idVehiculo;
    @Column(name="ANiO")
    private Integer anio;
    @Column(name="COLOR")
    private String color;
    @Column(name="MODELO")
    private String modelo;
    @Column(name = "PATENTE", unique = true)
    private String patente;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Cliente> clienteAsociado;
}
