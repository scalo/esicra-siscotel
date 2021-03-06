package it.saga.siscotel.db;

import java.util.*;




/**
 * AnaStciv generated by hbm2java
 */
public class AnaStciv  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private TerStato terStato;
     private TerConsolato terConsolato;
     private AnaSoggetto anaSoggetto;
     private AnaSoggetto anaSoggetto_1;
     private TerLocalita terLocalita;
     private TerComune terComune;
     private String codStciv;
     private String desStciv;
     private Date dtStciv;
     private String cfConiuge;
     private String cognomeCg;
     private String nomeCg;
     private String desComune;
     private String desProvincia;
     private String desStato;
     private String desLocalita;
     private String desConsolato;
     private Integer idEnte;
     private Date dtIni;
     private Date dtFin;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public AnaStciv() {
    }
    
    /** constructor with id */
    public AnaStciv(java.math.BigDecimal pkid) {
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
    public TerConsolato getTerConsolato() {
        return this.terConsolato;
    }
    
    public void setTerConsolato(TerConsolato terConsolato) {
        this.terConsolato = terConsolato;
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
    public AnaSoggetto getAnaSoggetto_1() {
        return this.anaSoggetto_1;
    }
    
    public void setAnaSoggetto_1(AnaSoggetto anaSoggetto_1) {
        this.anaSoggetto_1 = anaSoggetto_1;
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
    public String getCodStciv() {
        return this.codStciv;
    }
    
    public void setCodStciv(String codStciv) {
        this.codStciv = codStciv;
    }

    /**
     * 
     */
    public String getDesStciv() {
        return this.desStciv;
    }
    
    public void setDesStciv(String desStciv) {
        this.desStciv = desStciv;
    }

    /**
     * 
     */
    public Date getDtStciv() {
        return this.dtStciv;
    }
    
    public void setDtStciv(Date dtStciv) {
        this.dtStciv = dtStciv;
    }

    /**
     * 
     */
    public String getCfConiuge() {
        return this.cfConiuge;
    }
    
    public void setCfConiuge(String cfConiuge) {
        this.cfConiuge = cfConiuge;
    }

    /**
     * 
     */
    public String getCognomeCg() {
        return this.cognomeCg;
    }
    
    public void setCognomeCg(String cognomeCg) {
        this.cognomeCg = cognomeCg;
    }

    /**
     * 
     */
    public String getNomeCg() {
        return this.nomeCg;
    }
    
    public void setNomeCg(String nomeCg) {
        this.nomeCg = nomeCg;
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
    public String getDesConsolato() {
        return this.desConsolato;
    }
    
    public void setDesConsolato(String desConsolato) {
        this.desConsolato = desConsolato;
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