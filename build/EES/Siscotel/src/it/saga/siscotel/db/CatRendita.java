package it.saga.siscotel.db;

import java.util.*;




/**
 * CatRendita generated by hbm2java
 */
public class CatRendita  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private CatAot catAot;
     private java.math.BigDecimal rendita;
     private java.math.BigDecimal redditoAgrario;
     private Date dtIni;
     private Date dtFin;
     private Integer idEnte;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public CatRendita() {
    }
    
    /** constructor with id */
    public CatRendita(java.math.BigDecimal pkid) {
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
    public CatAot getCatAot() {
        return this.catAot;
    }
    
    public void setCatAot(CatAot catAot) {
        this.catAot = catAot;
    }

    /**
     * 
     */
    public java.math.BigDecimal getRendita() {
        return this.rendita;
    }
    
    public void setRendita(java.math.BigDecimal rendita) {
        this.rendita = rendita;
    }

    /**
     * 
     */
    public java.math.BigDecimal getRedditoAgrario() {
        return this.redditoAgrario;
    }
    
    public void setRedditoAgrario(java.math.BigDecimal redditoAgrario) {
        this.redditoAgrario = redditoAgrario;
    }

    /**
     * 
     */
    public Date getDtIni() {
        return this.dtIni;
    }
    
    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }

    /**
     * 
     */
    public Date getDtFin() {
        return this.dtFin;
    }
    
    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
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