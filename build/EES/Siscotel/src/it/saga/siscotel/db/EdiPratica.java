package it.saga.siscotel.db;

import java.util.*;




/**
 * EdiPratica generated by hbm2java
 */
public class EdiPratica  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private java.math.BigDecimal idServizio;
     private String codPratica;
     private String desPratica;
     private String codTipoPratica;
     private String desTipoPratica;
     private String codStato;
     private String desStato;
     private String numPratica;
     private Date dtPratica;
     private String numProtocollo;
     private Date dtProtocollo;
     private String numProvvedimento;
     private Date dtProvvedimento;
     private Date dtIniLavori;
     private Date dtFinLavori;
     private String numRegistro;
     private String oggetto;
     private Date dtDecadimento;
     private String desDecadimento;
     private Date dtAgibilita;
     private String numAgibilita;
     private String volume;
     private String superficie;
     private java.math.BigDecimal idPratica;
     private Integer idEnte;
     private Date dtMod;
     private java.math.BigDecimal fkidPratica;
     private Set ediSoggettos;
     private Set ediInterventos;
     private Set ediIdentificativos;
     private Set ediPraticaDetts;
     private Set ediCollegatas;
     private Set ediAllegatos;
     private Set ediUbicaziones;
     private Set ediCollegatas_1;
     private Set ediPagamentos;


    // Constructors

    /** default constructor */
    public EdiPratica() {
    }
    
    /** constructor with id */
    public EdiPratica(java.math.BigDecimal pkid) {
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
    public String getCodPratica() {
        return this.codPratica;
    }
    
    public void setCodPratica(String codPratica) {
        this.codPratica = codPratica;
    }

    /**
     * 
     */
    public String getDesPratica() {
        return this.desPratica;
    }
    
    public void setDesPratica(String desPratica) {
        this.desPratica = desPratica;
    }

    /**
     * 
     */
    public String getCodTipoPratica() {
        return this.codTipoPratica;
    }
    
    public void setCodTipoPratica(String codTipoPratica) {
        this.codTipoPratica = codTipoPratica;
    }

    /**
     * 
     */
    public String getDesTipoPratica() {
        return this.desTipoPratica;
    }
    
    public void setDesTipoPratica(String desTipoPratica) {
        this.desTipoPratica = desTipoPratica;
    }

    /**
     * 
     */
    public String getCodStato() {
        return this.codStato;
    }
    
    public void setCodStato(String codStato) {
        this.codStato = codStato;
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
    public String getNumPratica() {
        return this.numPratica;
    }
    
    public void setNumPratica(String numPratica) {
        this.numPratica = numPratica;
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
    public String getNumProtocollo() {
        return this.numProtocollo;
    }
    
    public void setNumProtocollo(String numProtocollo) {
        this.numProtocollo = numProtocollo;
    }

    /**
     * 
     */
    public Date getDtProtocollo() {
        return this.dtProtocollo;
    }
    
    public void setDtProtocollo(Date dtProtocollo) {
        this.dtProtocollo = dtProtocollo;
    }

    /**
     * 
     */
    public String getNumProvvedimento() {
        return this.numProvvedimento;
    }
    
    public void setNumProvvedimento(String numProvvedimento) {
        this.numProvvedimento = numProvvedimento;
    }

    /**
     * 
     */
    public Date getDtProvvedimento() {
        return this.dtProvvedimento;
    }
    
    public void setDtProvvedimento(Date dtProvvedimento) {
        this.dtProvvedimento = dtProvvedimento;
    }

    /**
     * 
     */
    public Date getDtIniLavori() {
        return this.dtIniLavori;
    }
    
    public void setDtIniLavori(Date dtIniLavori) {
        this.dtIniLavori = dtIniLavori;
    }

    /**
     * 
     */
    public Date getDtFinLavori() {
        return this.dtFinLavori;
    }
    
    public void setDtFinLavori(Date dtFinLavori) {
        this.dtFinLavori = dtFinLavori;
    }

    /**
     * 
     */
    public String getNumRegistro() {
        return this.numRegistro;
    }
    
    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
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
    public Date getDtDecadimento() {
        return this.dtDecadimento;
    }
    
    public void setDtDecadimento(Date dtDecadimento) {
        this.dtDecadimento = dtDecadimento;
    }

    /**
     * 
     */
    public String getDesDecadimento() {
        return this.desDecadimento;
    }
    
    public void setDesDecadimento(String desDecadimento) {
        this.desDecadimento = desDecadimento;
    }

    /**
     * 
     */
    public Date getDtAgibilita() {
        return this.dtAgibilita;
    }
    
    public void setDtAgibilita(Date dtAgibilita) {
        this.dtAgibilita = dtAgibilita;
    }

    /**
     * 
     */
    public String getNumAgibilita() {
        return this.numAgibilita;
    }
    
    public void setNumAgibilita(String numAgibilita) {
        this.numAgibilita = numAgibilita;
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
    public String getSuperficie() {
        return this.superficie;
    }
    
    public void setSuperficie(String superficie) {
        this.superficie = superficie;
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
    public java.math.BigDecimal getFkidPratica() {
        return this.fkidPratica;
    }
    
    public void setFkidPratica(java.math.BigDecimal fkidPratica) {
        this.fkidPratica = fkidPratica;
    }

    /**
     * 
     */
    public Set getEdiSoggettos() {
        return this.ediSoggettos;
    }
    
    public void setEdiSoggettos(Set ediSoggettos) {
        this.ediSoggettos = ediSoggettos;
    }

    /**
     * 
     */
    public Set getEdiInterventos() {
        return this.ediInterventos;
    }
    
    public void setEdiInterventos(Set ediInterventos) {
        this.ediInterventos = ediInterventos;
    }

    /**
     * 
     */
    public Set getEdiIdentificativos() {
        return this.ediIdentificativos;
    }
    
    public void setEdiIdentificativos(Set ediIdentificativos) {
        this.ediIdentificativos = ediIdentificativos;
    }

    /**
     * 
     */
    public Set getEdiPraticaDetts() {
        return this.ediPraticaDetts;
    }
    
    public void setEdiPraticaDetts(Set ediPraticaDetts) {
        this.ediPraticaDetts = ediPraticaDetts;
    }

    /**
     * 
     */
    public Set getEdiCollegatas() {
        return this.ediCollegatas;
    }
    
    public void setEdiCollegatas(Set ediCollegatas) {
        this.ediCollegatas = ediCollegatas;
    }

    /**
     * 
     */
    public Set getEdiAllegatos() {
        return this.ediAllegatos;
    }
    
    public void setEdiAllegatos(Set ediAllegatos) {
        this.ediAllegatos = ediAllegatos;
    }

    /**
     * 
     */
    public Set getEdiUbicaziones() {
        return this.ediUbicaziones;
    }
    
    public void setEdiUbicaziones(Set ediUbicaziones) {
        this.ediUbicaziones = ediUbicaziones;
    }

    /**
     * 
     */
    public Set getEdiCollegatas_1() {
        return this.ediCollegatas_1;
    }
    
    public void setEdiCollegatas_1(Set ediCollegatas_1) {
        this.ediCollegatas_1 = ediCollegatas_1;
    }

    /**
     * 
     */
    public Set getEdiPagamentos() {
        return this.ediPagamentos;
    }
    
    public void setEdiPagamentos(Set ediPagamentos) {
        this.ediPagamentos = ediPagamentos;
    }



}