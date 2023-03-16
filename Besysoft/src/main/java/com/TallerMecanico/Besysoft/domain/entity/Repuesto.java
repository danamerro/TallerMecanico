package com.TallerMecanico.Besysoft.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="REPUESTO")
@AllArgsConstructor
@NoArgsConstructor
public class Repuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MECANICO")
    private Long idMecanico;
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "REPUESTO")
    private String repuesto;
    @Column(name = "VALOR")
    private Double valor;


}
