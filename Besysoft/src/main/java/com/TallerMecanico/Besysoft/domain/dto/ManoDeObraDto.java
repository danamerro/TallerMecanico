package com.TallerMecanico.Besysoft.domain.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor

public class ManoDeObraDto {
    private String detalle;
    private Date duracionHs;

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getDuracionHs() {
        return duracionHs;
    }

    public void setDuracionHs(Date duracionHs) {
        this.duracionHs = duracionHs;
    }
}
