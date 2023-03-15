package com.TallerMecanico.Besysoft.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "EMPLEADO")
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EMPLEADO")
    private Long idEmpleado;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "CELULAR")
    @Size(max = 15)
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
    @Column(name = "TIPO_EMPLEADO")
    private String tipoEmpleado;




}
