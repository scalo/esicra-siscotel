package it.saga.siscotel.db;

import java.util.*;




/**
 * EdiSoggetto generated by hbm2java
 */
public class EdiSoggetto  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private AnaSoggetto anaSoggetto;
     private EdiPratica ediPratica;
     private String codTipoSoggetto;
     private String desTipoSoggetto;
     private String desSoggetto;
     private String codTipoRuolo;
     private String desTipoRuolo;
     private String note;
     private Integer idEnte;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public EdiSoggetto() {
    }
    
    /** constructor with id */
    public EdiSoggetto(java.math.BigDecimal pkid) {
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
    public EdiPratica getEdiPratica() {
        return this.ediPratica;
    }
    
    public void setEdiPratica(EdiPratica ediPratica) {
        this.ediPratica = ediPratica;
    }

    /**
     * 
     */
    public String getCodTipoSoggetto() {
        return this.codTipoSoggetto;
    }
    
    public void setCodTipoSoggetto(String codTipoSoggetto) {
        this.codTipoSoggetto = codTipoSoggetto;
    }

    /**
     * 
     */
    public String getDesTipoSoggetto() {
        return this.desTipoSoggetto;
    }
    
    public void setDesTipoSoggetto(String desTipoSoggetto) {
        this.desTipoSoggetto = desTipoSoggetto;
    }

    /**
     * 
     */
    public String getDesSoggetto() {
        return this.desSoggetto;
    }
    
    public void setDesSoggetto(String desSoggetto) {
        this.desSoggetto = desSoggetto;
    }

    /**
     * 
     */
    public String getCodTipoRuolo() {
        return this.codTipoRuolo;
    }
    
    public void setCodTipoRuolo(String codTipoRuolo) {
        this.codTipoRuolo = codTipoRuolo;
    }

    /**
     * 
     */
    public String getDesTipoRuolo() {
        return this.desTipoRuolo;
    }
    
    public void setDesTipoRuolo(String desTipoRuolo) {
        this.desTipoRuolo = desTipoRuolo;
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