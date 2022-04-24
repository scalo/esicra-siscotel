package it.saga.siscotel.db;

import java.util.*;




/**
 * ProValore generated by hbm2java
 */
public class ProValore  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private ProTipo proTipo;
     private String descrizione;
     private Integer ordinale;
     private Integer idEnte;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public ProValore() {
    }
    
    /** constructor with id */
    public ProValore(java.math.BigDecimal pkid) {
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
    public ProTipo getProTipo() {
        return this.proTipo;
    }
    
    public void setProTipo(ProTipo proTipo) {
        this.proTipo = proTipo;
    }

    /**
     * 
     */
    public String getDescrizione() {
        return this.descrizione;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * 
     */
    public Integer getOrdinale() {
        return this.ordinale;
    }
    
    public void setOrdinale(Integer ordinale) {
        this.ordinale = ordinale;
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
    public Date getDtMod() {
        return this.dtMod;
    }
    
    public void setDtMod(Date dtMod) {
        this.dtMod = dtMod;
    }



}