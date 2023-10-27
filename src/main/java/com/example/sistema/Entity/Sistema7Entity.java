package com.example.sistema.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sistema_7")
public class Sistema7Entity {
    @Id
    private Integer id;
    private Integer gestion;
    private Integer mes;
    private Integer dia;
    @Column(name = "Dato T")
    private String datoT;

    @Column(name = "Dato H")
    private String datoH;

    @Column(name = "Dato P")
    private Integer datoP;

    @Column(name = "Dato FPF")
    private String datoFPF;

    private String estado;

    public Sistema7Entity(Integer id, Integer gestion, Integer mes, Integer dia, String datoT, String datoH,
            Integer datoP, String datoFPF, String estado) {
        this.id = id;
        this.gestion = gestion;
        this.mes = mes;
        this.dia = dia;
        this.datoT = datoT;
        this.datoH = datoH;
        this.datoP = datoP;
        this.datoFPF = datoFPF;
        this.estado = estado;
    }

    public Sistema7Entity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGestion() {
        return gestion;
    }

    public void setGestion(Integer gestion) {
        this.gestion = gestion;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public String getDatoT() {
        return datoT;
    }

    public void setDatoT(String datoT) {
        this.datoT = datoT;
    }

    public String getDatoH() {
        return datoH;
    }

    public void setDatoH(String datoH) {
        this.datoH = datoH;
    }

    public Integer getDatoP() {
        return datoP;
    }

    public void setDatoP(Integer datoP) {
        this.datoP = datoP;
    }

    public String getDatoFPF() {
        return datoFPF;
    }

    public void setDatoFPF(String datoFPF) {
        this.datoFPF = datoFPF;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Sistema7Entity [id=" + id + ", gestion=" + gestion + ", mes=" + mes + ", dia=" + dia + ", datoT="
                + datoT + ", datoH=" + datoH + ", datoP=" + datoP + ", datoFPF=" + datoFPF + ", estado=" + estado + "]";
    }

}
