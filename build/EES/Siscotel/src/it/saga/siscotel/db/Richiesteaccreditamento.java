package it.saga.siscotel.db;

import java.util.*;




/**
 * Richiesteaccreditamento generated by hbm2java
 */
public class Richiesteaccreditamento  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkrichiesteaccreditamento;
     private Fornitori fornitori;
     private Albo albo;
     private Date datapresentazione;
     private String codfiscalerichiedente;
     private String denominazione;
     private String partiva;
     private String note;
     private java.math.BigDecimal idEnteRichiedente;
     private java.math.BigDecimal idEnteDestinatario;
     private Date dtMod;
     private Set richiesteaccreditamentoiters;
     private Set categorierics;
     private Set fornitures;


    // Constructors

    /** default constructor */
    public Richiesteaccreditamento() {
    }
    
    /** constructor with id */
    public Richiesteaccreditamento(java.math.BigDecimal pkrichiesteaccreditamento) {
        this.pkrichiesteaccreditamento = pkrichiesteaccreditamento;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public java.math.BigDecimal getPkrichiesteaccreditamento() {
        return this.pkrichiesteaccreditamento;
    }
    
    public void setPkrichiesteaccreditamento(java.math.BigDecimal pkrichiesteaccreditamento) {
        this.pkrichiesteaccreditamento = pkrichiesteaccreditamento;
    }

    /**
     * 
     */
    public Fornitori getFornitori() {
        return this.fornitori;
    }
    
    public void setFornitori(Fornitori fornitori) {
        this.fornitori = fornitori;
    }

    /**
     * 
     */
    public Albo getAlbo() {
        return this.albo;
    }
    
    public void setAlbo(Albo albo) {
        this.albo = albo;
    }

    /**
     * 
     */
    public Date getDatapresentazione() {
        return this.datapresentazione;
    }
    
    public void setDatapresentazione(Date datapresentazione) {
        this.datapresentazione = datapresentazione;
    }

    /**
     * 
     */
    public String getCodfiscalerichiedente() {
        return this.codfiscalerichiedente;
    }
    
    public void setCodfiscalerichiedente(String codfiscalerichiedente) {
        this.codfiscalerichiedente = codfiscalerichiedente;
    }

    /**
     * 
     */
    public String getDenominazione() {
        return this.denominazione;
    }
    
    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    /**
     * 
     */
    public String getPartiva() {
        return this.partiva;
    }
    
    public void setPartiva(String partiva) {
        this.partiva = partiva;
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
    public java.math.BigDecimal getIdEnteRichiedente() {
        return this.idEnteRichiedente;
    }
    
    public void setIdEnteRichiedente(java.math.BigDecimal idEnteRichiedente) {
        this.idEnteRichiedente = idEnteRichiedente;
    }

    /**
     * 
     */
    public java.math.BigDecimal getIdEnteDestinatario() {
        return this.idEnteDestinatario;
    }
    
    public void setIdEnteDestinatario(java.math.BigDecimal idEnteDestinatario) {
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

    /**
     * 
     */
    public Set getRichiesteaccreditamentoiters() {
        return this.richiesteaccreditamentoiters;
    }
    
    public void setRichiesteaccreditamentoiters(Set richiesteaccreditamentoiters) {
        this.richiesteaccreditamentoiters = richiesteaccreditamentoiters;
    }

    /**
     * 
     */
    public Set getCategorierics() {
        return this.categorierics;
    }
    
    public void setCategorierics(Set categorierics) {
        this.categorierics = categorierics;
    }

    /**
     * 
     */
    public Set getFornitures() {
        return this.fornitures;
    }
    
    public void setFornitures(Set fornitures) {
        this.fornitures = fornitures;
    }



}