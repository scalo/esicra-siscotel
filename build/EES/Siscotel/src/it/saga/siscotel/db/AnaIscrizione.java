package it.saga.siscotel.db;

import java.util.*;




/**
 * AnaIscrizione generated by hbm2java
 */
public class AnaIscrizione  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private TerStato terStato;
     private AnaSoggetto anaSoggetto;
     private TerLocalita terLocalita;
     private TerComune terComune;
     private String codIscrizione;
     private String desIscrizione;
     private Date dtIsc;
     private String desMotivo;
     private Date dtDec;
     private String desComune;
     private String desProvincia;
     private Integer numPratica;
     private Date dtDefPratica;
     private String desStato;
     private String desLocalita;
     private String desComAire;
     private Integer idEnte;
     private Date dtIni;
     private Date dtFin;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public AnaIscrizione() {
    }
    
    /** constructor with id */
    public AnaIscrizione(java.math.BigDecimal pkid) {
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
    public String getCodIscrizione() {
        return this.codIscrizione;
    }
    
    public void setCodIscrizione(String codIscrizione) {
        this.codIscrizione = codIscrizione;
    }

    /**
     * 
     */
    public String getDesIscrizione() {
        return this.desIscrizione;
    }
    
    public void setDesIscrizione(String desIscrizione) {
        this.desIscrizione = desIscrizione;
    }

    /**
     * 
     */
    public Date getDtIsc() {
        return this.dtIsc;
    }
    
    public void setDtIsc(Date dtIsc) {
        this.dtIsc = dtIsc;
    }

    /**
     * 
     */
    public String getDesMotivo() {
        return this.desMotivo;
    }
    
    public void setDesMotivo(String desMotivo) {
        this.desMotivo = desMotivo;
    }

    /**
     * 
     */
    public Date getDtDec() {
        return this.dtDec;
    }
    
    public void setDtDec(Date dtDec) {
        this.dtDec = dtDec;
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
    public Integer getNumPratica() {
        return this.numPratica;
    }
    
    public void setNumPratica(Integer numPratica) {
        this.numPratica = numPratica;
    }

    /**
     * 
     */
    public Date getDtDefPratica() {
        return this.dtDefPratica;
    }
    
    public void setDtDefPratica(Date dtDefPratica) {
        this.dtDefPratica = dtDefPratica;
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
    public String getDesComAire() {
        return this.desComAire;
    }
    
    public void setDesComAire(String desComAire) {
        this.desComAire = desComAire;
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