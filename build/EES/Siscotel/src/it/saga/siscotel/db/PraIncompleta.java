package it.saga.siscotel.db;

import java.util.*;




/**
 * PraIncompleta generated by hbm2java
 */
public class PraIncompleta  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private java.math.BigDecimal idServizio;
     private Date dtPratica;
     private String codiceFiscale;
     private String oggetto;
     private String classe;
     private String docXml;
     private Integer idEnte;
     private Integer idEnteDestinatario;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public PraIncompleta() {
    }
    
    /** constructor with id */
    public PraIncompleta(java.math.BigDecimal pkid) {
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
    public java.math.BigDecimal getIdServizio() {
        return this.idServizio;
    }
    
    public void setIdServizio(java.math.BigDecimal idServizio) {
        this.idServizio = idServizio;
    }

    /**
     * 
     */
    public Date getDtPratica() {
        return this.dtPratica;
    }
    
    public void setDtPratica(Date dtPratica) {
        this.dtPratica = dtPratica;
    }

    /**
     * 
     */
    public String getCodiceFiscale() {
        return this.codiceFiscale;
    }
    
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    /**
     * 
     */
    public String getOggetto() {
        return this.oggetto;
    }
    
    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    /**
     * 
     */
    public String getClasse() {
        return this.classe;
    }
    
    public void setClasse(String classe) {
        this.classe = classe;
    }

    /**
     * 
     */
    public String getDocXml() {
        return this.docXml;
    }
    
    public void setDocXml(String docXml) {
        this.docXml = docXml;
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
    public Date getDtMod() {
        return this.dtMod;
    }
    
    public void setDtMod(Date dtMod) {
        this.dtMod = dtMod;
    }



}