package it.saga.siscotel.db;

import java.util.*;




/**
 * PraRecapito generated by hbm2java
 */
public class PraRecapito  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private PraPraticaTesta praPraticaTesta;
     private String specieArea;
     private String desArea;
     private Integer numCiv;
     private String letCiv;
     private String scala;
     private String interno;
     private String cap;
     private String presso;
     private String telefono;
     private String fax;
     private String email;
     private Integer codIstatComune;
     private String desComune;
     private String desProvincia;
     private Integer codIstatStato;
     private String desStato;
     private String desLocalita;
     private String desContea;
     private Integer idEnte;
     private Integer idEnteDestinatario;
     private Date dtIni;
     private Date dtFin;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public PraRecapito() {
    }
    
    /** constructor with id */
    public PraRecapito(java.math.BigDecimal pkid) {
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
    public PraPraticaTesta getPraPraticaTesta() {
        return this.praPraticaTesta;
    }
    
    public void setPraPraticaTesta(PraPraticaTesta praPraticaTesta) {
        this.praPraticaTesta = praPraticaTesta;
    }

    /**
     * 
     */
    public String getSpecieArea() {
        return this.specieArea;
    }
    
    public void setSpecieArea(String specieArea) {
        this.specieArea = specieArea;
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
    public String getCap() {
        return this.cap;
    }
    
    public void setCap(String cap) {
        this.cap = cap;
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
    public Integer getCodIstatComune() {
        return this.codIstatComune;
    }
    
    public void setCodIstatComune(Integer codIstatComune) {
        this.codIstatComune = codIstatComune;
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
    public Integer getCodIstatStato() {
        return this.codIstatStato;
    }
    
    public void setCodIstatStato(Integer codIstatStato) {
        this.codIstatStato = codIstatStato;
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
    public String getDesContea() {
        return this.desContea;
    }
    
    public void setDesContea(String desContea) {
        this.desContea = desContea;
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
    public Integer getIdEnteDestinatario() {
        return this.idEnteDestinatario;
    }
    
    public void setIdEnteDestinatario(Integer idEnteDestinatario) {
        this.idEnteDestinatario = idEnteDestinatario;
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