package com.TallerMecanico.Besysoft.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "MECANICO")
@AllArgsConstructor
@NoArgsConstructor
public class Mecanico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MECANICO")
    private Long idMecanico;
    @Column(name = "ACTIVO")
    private char activo;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "CELULAR",length = 15)
    private String celular;
    @Column(name = "CALLE")
    private String calle;
    @Column(name = "CODIGO_POSTAL")
    private String codigoPostal;
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Column(name = "LOCALIDAD")
    private String localidad;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "PISO")
    private String piso;
    @Column(name = "ESPECIALIDAD")
    private String especialidad;

}
