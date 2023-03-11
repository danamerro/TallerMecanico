package com.TallerMecanico.Besysoft.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "CLIENTE")
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "CALLE")
    private String calle;
    @Column(name = "CODIGO_POSTAL")
    private Integer codigoPostal;
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Column(name = "LOCALIDAD")
    private String localidad;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "PISO")
    private Integer piso;
    //correo no puede ser nulo.
    @Column(name = "CORREO_ELECTRONICO", nullable = false)
    private String correoElectronico;
    @Column(name = "TELEFONO_LINEA")
    private Long telefonoLinea;

}
