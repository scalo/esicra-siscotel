package it.saga.siscotel.db;

import java.util.*;




/**
 * PraTipoAllegato generated by hbm2java
 */
public class PraTipoAllegato  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private String codTipo;
     private String desTipo;
     private Integer idEnte;
     private Integer idEnteDestinatario;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public PraTipoAllegato() {
    }
    
    /** constructor with id */
    public PraTipoAllegato(java.math.BigDecimal pkid) {
        this.pkid = pkid;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public java.math.BigDecimal getPkid() {
        return this.pkid;
    }
    
    public void setPkid(java.math.BigDecimal pkid) {
        this.pkid = pkid;
    }

    /**
     * 
     */
    public String getCodTipo() {
        return this.codTipo;
    }
    
    public void setCodTipo(String codTipo) {
        this.codTipo = codTipo;
    }

    /**
     * 
     */
    public String getDesTipo() {
        return this.desTipo;
    }
    
    public void setDesTipo(String desTipo) {
        this.desTipo = desTipo;
    }

    /**
     * 
     */
    public Integer getIdEnte() {
        return this.idEnte;
    }
    
    public void setIdEnte(Integer idEnte) {
        this.idEnte = idEnte;
    }

    /**
     * 
     */
    public Integer getIdEnteDestinatario() {
        return this.idEnteDestinatario;
    }
    
    public void setIdEnteDestinatario(Integer idEnteDestinatario) {
        this.idEnteDestinatario = idEnteDestinatario;
    }

    /**
     * 
     */
    public Date getDtMod() {
        return this.dtMod;
    }
    
    public void setDtMod(Date dtMod) {
        this.dtMod = dtMod;
    }



}