package it.saga.siscotel.db;

import java.util.*;




/**
 * EdiAllegato generated by hbm2java
 */
public class EdiAllegato  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private EdiPratica ediPratica;
     private String tipoAllegato;
     private Date dtAllegato;
     private Date dtProt;
     private String numProt;
     private String codAllegato;
     private String desAllegato;
     private String note;
     private Integer idEnte;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public EdiAllegato() {
    }
    
    /** constructor with id */
    public EdiAllegato(java.math.BigDecimal pkid) {
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
    public EdiPratica getEdiPratica() {
        return this.ediPratica;
    }
    
    public void setEdiPratica(EdiPratica ediPratica) {
        this.ediPratica = ediPratica;
    }

    /**
     * 
     */
    public String getTipoAllegato() {
        return this.tipoAllegato;
    }
    
    public void setTipoAllegato(String tipoAllegato) {
        this.tipoAllegato = tipoAllegato;
    }

    /**
     * 
     */
    public Date getDtAllegato() {
        return this.dtAllegato;
    }
    
    public void setDtAllegato(Date dtAllegato) {
        this.dtAllegato = dtAllegato;
    }

    /**
     * 
     */
    public Date getDtProt() {
        return this.dtProt;
    }
    
    public void setDtProt(Date dtProt) {
        this.dtProt = dtProt;
    }

    /**
     * 
     */
    public String getNumProt() {
        return this.numProt;
    }
    
    public void setNumProt(String numProt) {
        this.numProt = numProt;
    }

    /**
     * 
     */
    public String getCodAllegato() {
        return this.codAllegato;
    }
    
    public void setCodAllegato(String codAllegato) {
        this.codAllegato = codAllegato;
    }

    /**
     * 
     */
    public String getDesAllegato() {
        return this.desAllegato;
    }
    
    public void setDesAllegato(String desAllegato) {
        this.desAllegato = desAllegato;
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