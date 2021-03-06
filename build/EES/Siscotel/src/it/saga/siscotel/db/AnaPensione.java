package it.saga.siscotel.db;

import java.util.*;




/**
 * AnaPensione generated by hbm2java
 */
public class AnaPensione  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private AnaSoggetto anaSoggetto;
     private String desPensione;
     private String codEnte;
     private String desEnte;
     private Date dtAss;
     private String numPensione;
     private Integer idEnte;
     private Date dtIni;
     private Date dtFin;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public AnaPensione() {
    }
    
    /** constructor with id */
    public AnaPensione(java.math.BigDecimal pkid) {
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
    public AnaSoggetto getAnaSoggetto() {
        return this.anaSoggetto;
    }
    
    public void setAnaSoggetto(AnaSoggetto anaSoggetto) {
        this.anaSoggetto = anaSoggetto;
    }

    /**
     * 
     */
    public String getDesPensione() {
        return this.desPensione;
    }
    
    public void setDesPensione(String desPensione) {
        this.desPensione = desPensione;
    }

    /**
     * 
     */
    public String getCodEnte() {
        return this.codEnte;
    }
    
    public void setCodEnte(String codEnte) {
        this.codEnte = codEnte;
    }

    /**
     * 
     */
    public String getDesEnte() {
        return this.desEnte;
    }
    
    public void setDesEnte(String desEnte) {
        this.desEnte = desEnte;
    }

    /**
     * 
     */
    public Date getDtAss() {
        return this.dtAss;
    }
    
    public void setDtAss(Date dtAss) {
        this.dtAss = dtAss;
    }

    /**
     * 
     */
    public String getNumPensione() {
        return this.numPensione;
    }
    
    public void setNumPensione(String numPensione) {
        this.numPensione = numPensione;
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
    public Date getDtMod() {
        return this.dtMod;
    }
    
    public void setDtMod(Date dtMod) {
        this.dtMod = dtMod;
    }



}