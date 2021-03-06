package it.saga.siscotel.db;

import java.util.*;




/**
 * AnaStudio generated by hbm2java
 */
public class AnaStudio  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private TerStato terStato;
     private AnaSoggetto anaSoggetto;
     private TerLocalita terLocalita;
     private TerComune terComune;
     private Integer anno;
     private String desStudio;
     private String desIstituto;
     private String desComune;
     private String desProvincia;
     private String desStato;
     private String desLocalita;
     private Integer idEnte;
     private Date dtIni;
     private Date dtFin;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public AnaStudio() {
    }
    
    /** constructor with id */
    public AnaStudio(java.math.BigDecimal pkid) {
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
    public TerStato getTerStato() {
        return this.terStato;
    }
    
    public void setTerStato(TerStato terStato) {
        this.terStato = terStato;
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
    public TerLocalita getTerLocalita() {
        return this.terLocalita;
    }
    
    public void setTerLocalita(TerLocalita terLocalita) {
        this.terLocalita = terLocalita;
    }

    /**
     * 
     */
    public TerComune getTerComune() {
        return this.terComune;
    }
    
    public void setTerComune(TerComune terComune) {
        this.terComune = terComune;
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
    public String getDesStudio() {
        return this.desStudio;
    }
    
    public void setDesStudio(String desStudio) {
        this.desStudio = desStudio;
    }

    /**
     * 
     */
    public String getDesIstituto() {
        return this.desIstituto;
    }
    
    public void setDesIstituto(String desIstituto) {
        this.desIstituto = desIstituto;
    }

    /**
     * 
     */
    public String getDesComune() {
        return this.desComune;
    }
    
    public void setDesComune(String desComune) {
        this.desComune = desComune;
    }

    /**
     * 
     */
    public String getDesProvincia() {
        return this.desProvincia;
    }
    
    public void setDesProvincia(String desProvincia) {
        this.desProvincia = desProvincia;
    }

    /**
     * 
     */
    public String getDesStato() {
        return this.desStato;
    }
    
    public void setDesStato(String desStato) {
        this.desStato = desStato;
    }

    /**
     * 
     */
    public String getDesLocalita() {
        return this.desLocalita;
    }
    
    public void setDesLocalita(String desLocalita) {
        this.desLocalita = desLocalita;
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