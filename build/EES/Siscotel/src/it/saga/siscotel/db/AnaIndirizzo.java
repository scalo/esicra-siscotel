package it.saga.siscotel.db;

import java.util.*;




/**
 * AnaIndirizzo generated by hbm2java
 */
public class AnaIndirizzo  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private TerStato terStato;
     private TerConsolato terConsolato;
     private AnaSoggetto anaSoggetto;
     private TerArea terArea;
     private TerLocalita terLocalita;
     private TerComune terComune;
     private String codIndirizzo;
     private String tipo;
     private String desArea;
     private Integer numCiv;
     private String letCiv;
     private String colore;
     private String corte;
     private String scala;
     private String interno;
     private String piano;
     private String edificio;
     private String presso;
     private String telefono;
     private String fax;
     private String email;
     private String desStato;
     private String contea;
     private String desLocalita;
     private String cap;
     private String desComune;
     private String desProvincia;
     private String desConsolato;
     private Integer idEnte;
     private Date dtIni;
     private Date dtFin;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public AnaIndirizzo() {
    }
    
    /** constructor with id */
    public AnaIndirizzo(java.math.BigDecimal pkid) {
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
    public TerArea getTerArea() {
        return this.terArea;
    }
    
    public void setTerArea(TerArea terArea) {
        this.terArea = terArea;
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
    public String getCodIndirizzo() {
        return this.codIndirizzo;
    }
    
    public void setCodIndirizzo(String codIndirizzo) {
        this.codIndirizzo = codIndirizzo;
    }

    /**
     * 
     */
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    public String getColore() {
        return this.colore;
    }
    
    public void setColore(String colore) {
        this.colore = colore;
    }

    /**
     * 
     */
    public String getCorte() {
        return this.corte;
    }
    
    public void setCorte(String corte) {
        this.corte = corte;
    }

    /**
     * 
     */
    public String getScala() {
        return this.scala;
    }
    
    public void setScala(String scala) {
        this.scala = scala;
    }

    /**
     * 
     */
    public String getInterno() {
        return this.interno;
    }
    
    public void setInterno(String interno) {
        this.interno = interno;
    }

    /**
     * 
     */
    public String getPiano() {
        return this.piano;
    }
    
    public void setPiano(String piano) {
        this.piano = piano;
    }

    /**
     * 
     */
    public String getEdificio() {
        return this.edificio;
    }
    
    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    /**
     * 
     */
    public String getPresso() {
        return this.presso;
    }
    
    public void setPresso(String presso) {
        this.presso = presso;
    }

    /**
     * 
     */
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     */
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 
     */
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
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
    public String getContea() {
        return this.contea;
    }
    
    public void setContea(String contea) {
        this.contea = contea;
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
    public String getCap() {
        return this.cap;
    }
    
    public void setCap(String cap) {
        this.cap = cap;
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