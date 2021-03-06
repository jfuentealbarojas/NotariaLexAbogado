package com.lexAbogado.notaria.dato.entity;
// Generated 10-11-2018 16:57:46 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * NotariaValor generated by hbm2java
 */
@Entity
@Table(name="NOTARIA_VALOR"
    ,schema="DUOC_USER2"
)
public class NotariaValor  implements java.io.Serializable {


     private BigDecimal idVlr;
     private BigDecimal idTrmt;
     private BigDecimal valorVlr;
     private Set notariaTramites = new HashSet(0);

    public NotariaValor() {
    }

	
    public NotariaValor(BigDecimal idVlr) {
        this.idVlr = idVlr;
    }
    public NotariaValor(BigDecimal idVlr, BigDecimal idTrmt, BigDecimal valorVlr, Set notariaTramites) {
       this.idVlr = idVlr;
       this.idTrmt = idTrmt;
       this.valorVlr = valorVlr;
       this.notariaTramites = notariaTramites;
    }
   
     @Id 

    
    @Column(name="ID_VLR", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdVlr() {
        return this.idVlr;
    }
    
    public void setIdVlr(BigDecimal idVlr) {
        this.idVlr = idVlr;
    }

    
    @Column(name="ID_TRMT", precision=22, scale=0)
    public BigDecimal getIdTrmt() {
        return this.idTrmt;
    }
    
    public void setIdTrmt(BigDecimal idTrmt) {
        this.idTrmt = idTrmt;
    }

    
    @Column(name="VALOR_VLR", precision=22, scale=0)
    public BigDecimal getValorVlr() {
        return this.valorVlr;
    }
    
    public void setValorVlr(BigDecimal valorVlr) {
        this.valorVlr = valorVlr;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="notariaValor")
    public Set getNotariaTramites() {
        return this.notariaTramites;
    }
    
    public void setNotariaTramites(Set notariaTramites) {
        this.notariaTramites = notariaTramites;
    }




}


