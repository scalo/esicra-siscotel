package it.saga.siscotel.db;

import java.util.*;




/**
 * CatPrg generated by hbm2java
 */
public class CatPrg  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private String codPrg;
     private String desPrg;
     private Integer anno;
     private String note;
     private Date dtIni;
     private Date dtFin;
     private Integer idEnte;
     private Date dtMod;
     private Set ediPrgIdents;
     private Set catAotPrgs;


    // Constructors

    /** default constructor */
    public CatPrg() {
    }
    
    /** constructor with id */
    public CatPrg(java.math.BigDecimal pkid) {
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
    public String getCodPrg() {
        return this.codPrg;
    }
    
    public void setCodPrg(String codPrg) {
        this.codPrg = codPrg;
    }

    /**
     * 
     */
    public String getDesPrg() {
        return this.desPrg;
    }
    
    public void setDesPrg(String desPrg) {
        this.desPrg = desPrg;
    }

    /**
     * 
     */
    public Integer getAnno() {
        return this.anno;
    }
    
    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    /**
     * 
     */
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
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

    /**
     * 
     */
    public Set getEdiPrgIdents() {
        return this.ediPrgIdents;
    }
    
    public void setEdiPrgIdents(Set ediPrgIdents) {
        this.ediPrgIdents = ediPrgIdents;
    }

    /**
     * 
     */
    public Set getCatAotPrgs() {
        return this.catAotPrgs;
    }
    
    public void setCatAotPrgs(Set catAotPrgs) {
        this.catAotPrgs = catAotPrgs;
    }



}