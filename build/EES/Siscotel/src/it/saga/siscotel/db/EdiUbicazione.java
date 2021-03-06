package it.saga.siscotel.db;

import java.util.*;




/**
 * EdiUbicazione generated by hbm2java
 */
public class EdiUbicazione  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private TerArea terArea;
     private EdiPratica ediPratica;
     private String desArea;
     private Integer numCiv;
     private String letCiv;
     private Integer idEnte;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public EdiUbicazione() {
    }
    
    /** constructor with id */
    public EdiUbicazione(java.math.BigDecimal pkid) {
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
    public TerArea getTerArea() {
        return this.terArea;
    }
    
    public void setTerArea(TerArea terArea) {
        this.terArea = terArea;
    }

    /**
     * 
     */
    public EdiPratica getEdiPratica() {
        return this.ediPratica;
    }
    
    public void setEdiPratica(EdiPratica ediPratica) {
        this.ediPratica = ediPratica;
    }

    /**
     * 
     */
    public String getDesArea() {
        return this.desArea;
    }
    
    public void setDesArea(String desArea) {
        this.desArea = desArea;
    }

    /**
     * 
     */
    public Integer getNumCiv() {
        return this.numCiv;
    }
    
    public void setNumCiv(Integer numCiv) {
        this.numCiv = numCiv;
    }

    /**
     * 
     */
    public String getLetCiv() {
        return this.letCiv;
    }
    
    public void setLetCiv(String letCiv) {
        this.letCiv = letCiv;
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