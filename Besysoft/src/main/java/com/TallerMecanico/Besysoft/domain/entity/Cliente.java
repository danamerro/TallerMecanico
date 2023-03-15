package com.TallerMecanico.Besysoft.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@Table(name = "CLIENTE")
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long idCliente;
    @Column(name = "NOMBRES")
    private String nombres;
    @Size(max = 80)
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
    //correo no puede ser nulo.
    @Column(name = "CORREO_ELECTRONICO", nullable = false)
    private String correoElectronico;
    @Column(name = "TELEFONO_LINEA")
    private String telefonoLinea;
    @ManyToMany(mappedBy = "clienteAsociado")
    @JoinTable(
            name="cliente_vehiculo",
            joinColumns = @JoinColumn(name = "clienteid"),
            inverseJoinColumns = @JoinColumn(name = "vehiculoid")
    )
    private List<Vehiculo> vehiculosAsociados;


}
