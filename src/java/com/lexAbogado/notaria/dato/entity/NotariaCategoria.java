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
 * NotariaCategoria generated by hbm2java
 */
@Entity
@Table(name="NOTARIA_CATEGORIA"
    ,schema="DUOC_USER2"
)
public class NotariaCategoria  implements java.io.Serializable {


     private BigDecimal idCategoria;
     private String nomCategoria;
     private Set notariaTramites = new HashSet(0);

    public NotariaCategoria() {
    }

	
    public NotariaCategoria(BigDecimal idCategoria) {
        this.idCategoria = idCategoria;
    }
    public NotariaCategoria(BigDecimal idCategoria, String nomCategoria, Set notariaTramites) {
       this.idCategoria = idCategoria;
       this.nomCategoria = nomCategoria;
       this.notariaTramites = notariaTramites;
    }
   
     @Id 

    
    @Column(name="ID_CATEGORIA", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(BigDecimal idCategoria) {
        this.idCategoria = idCategoria;
    }

    
    @Column(name="NOM_CATEGORIA", length=4000)
    public String getNomCategoria() {
        return this.nomCategoria;
    }
    
    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="notariaCategoria")
    public Set getNotariaTramites() {
        return this.notariaTramites;
    }
    
    public void setNotariaTramites(Set notariaTramites) {
        this.notariaTramites = notariaTramites;
    }




}


