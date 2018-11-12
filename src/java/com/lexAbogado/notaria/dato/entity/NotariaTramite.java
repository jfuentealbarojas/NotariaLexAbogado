package com.lexAbogado.notaria.dato.entity;
// Generated 10-11-2018 16:57:46 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * NotariaTramite generated by hbm2java
 */
@Entity
@Table(name="NOTARIA_TRAMITE"
    ,schema="DUOC_USER2"
)
public class NotariaTramite  implements java.io.Serializable {


     private BigDecimal idTrmt;
     private NotariaCategoria notariaCategoria;
     private NotariaValor notariaValor;
     private String nombreTrmt;
     private Set notariaHistorialTramites = new HashSet(0);

    public NotariaTramite() {
    }

	
    public NotariaTramite(BigDecimal idTrmt, NotariaValor notariaValor) {
        this.idTrmt = idTrmt;
        this.notariaValor = notariaValor;
    }
    public NotariaTramite(BigDecimal idTrmt, NotariaCategoria notariaCategoria, NotariaValor notariaValor, String nombreTrmt, Set notariaHistorialTramites) {
       this.idTrmt = idTrmt;
       this.notariaCategoria = notariaCategoria;
       this.notariaValor = notariaValor;
       this.nombreTrmt = nombreTrmt;
       this.notariaHistorialTramites = notariaHistorialTramites;
    }
   
     @Id 

    
    @Column(name="ID_TRMT", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdTrmt() {
        return this.idTrmt;
    }
    
    public void setIdTrmt(BigDecimal idTrmt) {
        this.idTrmt = idTrmt;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_CTGR")
    public NotariaCategoria getNotariaCategoria() {
        return this.notariaCategoria;
    }
    
    public void setNotariaCategoria(NotariaCategoria notariaCategoria) {
        this.notariaCategoria = notariaCategoria;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="VALOR_ID_VLR", nullable=false)
    public NotariaValor getNotariaValor() {
        return this.notariaValor;
    }
    
    public void setNotariaValor(NotariaValor notariaValor) {
        this.notariaValor = notariaValor;
    }

    
    @Column(name="NOMBRE_TRMT", length=4000)
    public String getNombreTrmt() {
        return this.nombreTrmt;
    }
    
    public void setNombreTrmt(String nombreTrmt) {
        this.nombreTrmt = nombreTrmt;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="notariaTramite")
    public Set getNotariaHistorialTramites() {
        return this.notariaHistorialTramites;
    }
    
    public void setNotariaHistorialTramites(Set notariaHistorialTramites) {
        this.notariaHistorialTramites = notariaHistorialTramites;
    }




}


