package it.saga.siscotel.db;

import java.util.*;




/**
 * ComEsercizio generated by hbm2java
 */
public class ComEsercizio  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private AnaSoggetto anaSoggetto;
     private TerComune terComune;
     private ComDenuncia comDenuncia;
     private String codFiscaleTitolare;
     private String nomeTitolare;
     private String cognomeTitolare;
     private Integer flgAccorpato;
     private Integer flgCentrocom;
     private Integer flgStagionale;
     private Date dtIniStagione;
     private Date dtFinStagione;
     private String numAutorizzazione;
     private Date dtAutorizzazione;
     private String superficie;
     private String volume;
     private String desCentrocom;
     private String numProvCentrocom;
     private Date dtProvCentrocom;
     private String desCertCentrocom;
     private java.math.BigDecimal fkidArea;
     private String desArea;
     private Integer numCiv;
     private String letCiv;
     private String cap;
     private String desComune;
     private String desProvincia;
     private Integer idEnte;
     private Date dtMod;
     private Set comMerceologicos;


    // Constructors

    /** default constructor */
    public ComEsercizio() {
    }
    
    /** constructor with id */
    public ComEsercizio(java.math.BigDecimal pkid) {
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
    public TerComune getTerComune() {
        return this.terComune;
    }
    
    public void setTerComune(TerComune terComune) {
        this.terComune = terComune;
    }

    /**
     * 
     */
    public ComDenuncia getComDenuncia() {
        return this.comDenuncia;
    }
    
    public void setComDenuncia(ComDenuncia comDenuncia) {
        this.comDenuncia = comDenuncia;
    }

    /**
     * 
     */
    public String getCodFiscaleTitolare() {
        return this.codFiscaleTitolare;
    }
    
    public void setCodFiscaleTitolare(String codFiscaleTitolare) {
        this.codFiscaleTitolare = codFiscaleTitolare;
    }

    /**
     * 
     */
    public String getNomeTitolare() {
        return this.nomeTitolare;
    }
    
    public void setNomeTitolare(String nomeTitolare) {
        this.nomeTitolare = nomeTitolare;
    }

    /**
     * 
     */
    public String getCognomeTitolare() {
        return this.cognomeTitolare;
    }
    
    public void setCognomeTitolare(String cognomeTitolare) {
        this.cognomeTitolare = cognomeTitolare;
    }

    /**
     * 
     */
    public Integer getFlgAccorpato() {
        return this.flgAccorpato;
    }
    
    public void setFlgAccorpato(Integer flgAccorpato) {
        this.flgAccorpato = flgAccorpato;
    }

    /**
     * 
     */
    public Integer getFlgCentrocom() {
        return this.flgCentrocom;
    }
    
    public void setFlgCentrocom(Integer flgCentrocom) {
        this.flgCentrocom = flgCentrocom;
    }

    /**
     * 
     */
    public Integer getFlgStagionale() {
        return this.flgStagionale;
    }
    
    public void setFlgStagionale(Integer flgStagionale) {
        this.flgStagionale = flgStagionale;
    }

    /**
     * 
     */
    public Date getDtIniStagione() {
        return this.dtIniStagione;
    }
    
    public void setDtIniStagione(Date dtIniStagione) {
        this.dtIniStagione = dtIniStagione;
    }

    /**
     * 
     */
    public Date getDtFinStagione() {
        return this.dtFinStagione;
    }
    
    public void setDtFinStagione(Date dtFinStagione) {
        this.dtFinStagione = dtFinStagione;
    }

    /**
     * 
     */
    public String getNumAutorizzazione() {
        return this.numAutorizzazione;
    }
    
    public void setNumAutorizzazione(String numAutorizzazione) {
        this.numAutorizzazione = numAutorizzazione;
    }

    /**
     * 
     */
    public Date getDtAutorizzazione() {
        return this.dtAutorizzazione;
    }
    
    public void setDtAutorizzazione(Date dtAutorizzazione) {
        this.dtAutorizzazione = dtAutorizzazione;
    }

    /**
     * 
     */
    public String getSuperficie() {
        return this.superficie;
    }
    
    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    /**
     * 
     */
    public String getVolume() {
        return this.volume;
    }
    
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * 
     */
    public String getDesCentrocom() {
        return this.desCentrocom;
    }
    
    public void setDesCentrocom(String desCentrocom) {
        this.desCentrocom = desCentrocom;
    }

    /**
     * 
     */
    public String getNumProvCentrocom() {
        return this.numProvCentrocom;
    }
    
    public void setNumProvCentrocom(String numProvCentrocom) {
        this.numProvCentrocom = numProvCentrocom;
    }

    /**
     * 
     */
    public Date getDtProvCentrocom() {
        return this.dtProvCentrocom;
    }
    
    public void setDtProvCentrocom(Date dtProvCentrocom) {
        this.dtProvCentrocom = dtProvCentrocom;
    }

    /**
     * 
     */
    public String getDesCertCentrocom() {
        return this.desCertCentrocom;
    }
    
    public void setDesCertCentrocom(String desCertCentrocom) {
        this.desCertCentrocom = desCertCentrocom;
    }

    /**
     * 
     */
    public java.math.BigDecimal getFkidArea() {
        return this.fkidArea;
    }
    
    public void setFkidArea(java.math.BigDecimal fkidArea) {
        this.fkidArea = fkidArea;
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
    public Set getComMerceologicos() {
        return this.comMerceologicos;
    }
    
    public void setComMerceologicos(Set comMerceologicos) {
        this.comMerceologicos = comMerceologicos;
    }



}