package it.saga.siscotel.db;

import java.util.*;




/**
 * TriConDenuncia generated by hbm2java
 */
public class TriConDenuncia  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private TriConcessione triConcessione;
     private AnaSoggetto anaSoggetto;
     private java.math.BigDecimal idServizio;
     private String cognome;
     private String nome;
     private String codiceFiscale;
     private Date dtNascita;
     private String locNascita;
     private String recapito;
     private Date dtDenuncia;
     private Date dtIniCon;
     private Date dtFineCon;
     private String codDenuncia;
     private java.math.BigDecimal idPratica;
     private String codTipo;
     private String desTipo;
     private Integer idEnte;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public TriConDenuncia() {
    }
    
    /** constructor with id */
    public TriConDenuncia(java.math.BigDecimal pkid) {
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
    public TriConcessione getTriConcessione() {
        return this.triConcessione;
    }
    
    public void setTriConcessione(TriConcessione triConcessione) {
        this.triConcessione = triConcessione;
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
    public java.math.BigDecimal getIdServizio() {
        return this.idServizio;
    }
    
    public void setIdServizio(java.math.BigDecimal idServizio) {
        this.idServizio = idServizio;
    }

    /**
     * 
     */
    public String getCognome() {
        return this.cognome;
    }
    
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * 
     */
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
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
    public Date getDtNascita() {
        return this.dtNascita;
    }
    
    public void setDtNascita(Date dtNascita) {
        this.dtNascita = dtNascita;
    }

    /**
     * 
     */
    public String getLocNascita() {
        return this.locNascita;
    }
    
    public void setLocNascita(String locNascita) {
        this.locNascita = locNascita;
    }

    /**
     * 
     */
    public String getRecapito() {
        return this.recapito;
    }
    
    public void setRecapito(String recapito) {
        this.recapito = recapito;
    }

    /**
     * 
     */
    public Date getDtDenuncia() {
        return this.dtDenuncia;
    }
    
    public void setDtDenuncia(Date dtDenuncia) {
        this.dtDenuncia = dtDenuncia;
    }

    /**
     * 
     */
    public Date getDtIniCon() {
        return this.dtIniCon;
    }
    
    public void setDtIniCon(Date dtIniCon) {
        this.dtIniCon = dtIniCon;
    }

    /**
     * 
     */
    public Date getDtFineCon() {
        return this.dtFineCon;
    }
    
    public void setDtFineCon(Date dtFineCon) {
        this.dtFineCon = dtFineCon;
    }

    /**
     * 
     */
    public String getCodDenuncia() {
        return this.codDenuncia;
    }
    
    public void setCodDenuncia(String codDenuncia) {
        this.codDenuncia = codDenuncia;
    }

    /**
     * 
     */
    public java.math.BigDecimal getIdPratica() {
        return this.idPratica;
    }
    
    public void setIdPratica(java.math.BigDecimal idPratica) {
        this.idPratica = idPratica;
    }

    /**
     * 
     */
    public String getCodTipo() {
        return this.codTipo;
    }
    
    public void setCodTipo(String codTipo) {
        this.codTipo = codTipo;
    }

    /**
     * 
     */
    public String getDesTipo() {
        return this.desTipo;
    }
    
    public void setDesTipo(String desTipo) {
        this.desTipo = desTipo;
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