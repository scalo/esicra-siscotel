package it.saga.siscotel.db;

import java.util.*;




/**
 * IciInsediamento generated by hbm2java
 */
public class IciInsediamento  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private TerArea terArea;
     private java.math.BigDecimal fkidContribuente;
     private java.math.BigDecimal fkidDenunciante;
     private String codDenuncia;
     private Integer annoDenuncia;
     private Date dtDenuncia;
     private String progressivoDenuncia;
     private Date dtNasContribuente;
     private String luogoNasContribuente;
     private String indContribuente;
     private String indDenunciante;
     private String noteDenuncia;
     private String codImmobile;
     private String codEcografico;
     private Integer caratteristiche;
     private String desArea;
     private Integer numCiv;
     private String letCiv;
     private String colore;
     private String corte;
     private String scala;
     private String interno;
     private String piano;
     private String edificio;
     private String codComune;
     private String desComune;
     private String sezione;
     private String foglio;
     private String numero;
     private Integer sub;
     private String protocollo;
     private Integer annoProtocollo;
     private String categoria;
     private String classe;
     private Integer flgProvvisorio;
     private java.math.BigDecimal valore;
     private Integer flgStorico;
     private Integer flgAbPrincipale;
     private java.math.BigDecimal alqRidotta;
     private java.math.BigDecimal aliquota;
     private java.math.BigDecimal percPossesso;
     private Integer mesiPossesso;
     private Integer mesiEsenzione;
     private java.math.BigDecimal impEsenzione;
     private Integer mesiRiduzione;
     private java.math.BigDecimal percRiduzione;
     private Integer mesiAlqRidotta;
     private java.math.BigDecimal impDetrazione;
     private String noteInsediamento;
     private Date dtIni;
     private Date dtFin;
     private Integer idEnte;
     private Date dtMod;
     private Set iciInsDetts;


    // Constructors

    /** default constructor */
    public IciInsediamento() {
    }
    
    /** constructor with id */
    public IciInsediamento(java.math.BigDecimal pkid) {
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
    public TerArea getTerArea() {
        return this.terArea;
    }
    
    public void setTerArea(TerArea terArea) {
        this.terArea = terArea;
    }

    /**
     * 
     */
    public java.math.BigDecimal getFkidContribuente() {
        return this.fkidContribuente;
    }
    
    public void setFkidContribuente(java.math.BigDecimal fkidContribuente) {
        this.fkidContribuente = fkidContribuente;
    }

    /**
     * 
     */
    public java.math.BigDecimal getFkidDenunciante() {
        return this.fkidDenunciante;
    }
    
    public void setFkidDenunciante(java.math.BigDecimal fkidDenunciante) {
        this.fkidDenunciante = fkidDenunciante;
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
    public Integer getAnnoDenuncia() {
        return this.annoDenuncia;
    }
    
    public void setAnnoDenuncia(Integer annoDenuncia) {
        this.annoDenuncia = annoDenuncia;
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
    public String getProgressivoDenuncia() {
        return this.progressivoDenuncia;
    }
    
    public void setProgressivoDenuncia(String progressivoDenuncia) {
        this.progressivoDenuncia = progressivoDenuncia;
    }

    /**
     * 
     */
    public Date getDtNasContribuente() {
        return this.dtNasContribuente;
    }
    
    public void setDtNasContribuente(Date dtNasContribuente) {
        this.dtNasContribuente = dtNasContribuente;
    }

    /**
     * 
     */
    public String getLuogoNasContribuente() {
        return this.luogoNasContribuente;
    }
    
    public void setLuogoNasContribuente(String luogoNasContribuente) {
        this.luogoNasContribuente = luogoNasContribuente;
    }

    /**
     * 
     */
    public String getIndContribuente() {
        return this.indContribuente;
    }
    
    public void setIndContribuente(String indContribuente) {
        this.indContribuente = indContribuente;
    }

    /**
     * 
     */
    public String getIndDenunciante() {
        return this.indDenunciante;
    }
    
    public void setIndDenunciante(String indDenunciante) {
        this.indDenunciante = indDenunciante;
    }

    /**
     * 
     */
    public String getNoteDenuncia() {
        return this.noteDenuncia;
    }
    
    public void setNoteDenuncia(String noteDenuncia) {
        this.noteDenuncia = noteDenuncia;
    }

    /**
     * 
     */
    public String getCodImmobile() {
        return this.codImmobile;
    }
    
    public void setCodImmobile(String codImmobile) {
        this.codImmobile = codImmobile;
    }

    /**
     * 
     */
    public String getCodEcografico() {
        return this.codEcografico;
    }
    
    public void setCodEcografico(String codEcografico) {
        this.codEcografico = codEcografico;
    }

    /**
     * 
     */
    public Integer getCaratteristiche() {
        return this.caratteristiche;
    }
    
    public void setCaratteristiche(Integer caratteristiche) {
        this.caratteristiche = caratteristiche;
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
    public String getCodComune() {
        return this.codComune;
    }
    
    public void setCodComune(String codComune) {
        this.codComune = codComune;
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
    public String getSezione() {
        return this.sezione;
    }
    
    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    /**
     * 
     */
    public String getFoglio() {
        return this.foglio;
    }
    
    public void setFoglio(String foglio) {
        this.foglio = foglio;
    }

    /**
     * 
     */
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * 
     */
    public Integer getSub() {
        return this.sub;
    }
    
    public void setSub(Integer sub) {
        this.sub = sub;
    }

    /**
     * 
     */
    public String getProtocollo() {
        return this.protocollo;
    }
    
    public void setProtocollo(String protocollo) {
        this.protocollo = protocollo;
    }

    /**
     * 
     */
    public Integer getAnnoProtocollo() {
        return this.annoProtocollo;
    }
    
    public void setAnnoProtocollo(Integer annoProtocollo) {
        this.annoProtocollo = annoProtocollo;
    }

    /**
     * 
     */
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
    public Integer getFlgProvvisorio() {
        return this.flgProvvisorio;
    }
    
    public void setFlgProvvisorio(Integer flgProvvisorio) {
        this.flgProvvisorio = flgProvvisorio;
    }

    /**
     * 
     */
    public java.math.BigDecimal getValore() {
        return this.valore;
    }
    
    public void setValore(java.math.BigDecimal valore) {
        this.valore = valore;
    }

    /**
     * 
     */
    public Integer getFlgStorico() {
        return this.flgStorico;
    }
    
    public void setFlgStorico(Integer flgStorico) {
        this.flgStorico = flgStorico;
    }

    /**
     * 
     */
    public Integer getFlgAbPrincipale() {
        return this.flgAbPrincipale;
    }
    
    public void setFlgAbPrincipale(Integer flgAbPrincipale) {
        this.flgAbPrincipale = flgAbPrincipale;
    }

    /**
     * 
     */
    public java.math.BigDecimal getAlqRidotta() {
        return this.alqRidotta;
    }
    
    public void setAlqRidotta(java.math.BigDecimal alqRidotta) {
        this.alqRidotta = alqRidotta;
    }

    /**
     * 
     */
    public java.math.BigDecimal getAliquota() {
        return this.aliquota;
    }
    
    public void setAliquota(java.math.BigDecimal aliquota) {
        this.aliquota = aliquota;
    }

    /**
     * 
     */
    public java.math.BigDecimal getPercPossesso() {
        return this.percPossesso;
    }
    
    public void setPercPossesso(java.math.BigDecimal percPossesso) {
        this.percPossesso = percPossesso;
    }

    /**
     * 
     */
    public Integer getMesiPossesso() {
        return this.mesiPossesso;
    }
    
    public void setMesiPossesso(Integer mesiPossesso) {
        this.mesiPossesso = mesiPossesso;
    }

    /**
     * 
     */
    public Integer getMesiEsenzione() {
        return this.mesiEsenzione;
    }
    
    public void setMesiEsenzione(Integer mesiEsenzione) {
        this.mesiEsenzione = mesiEsenzione;
    }

    /**
     * 
     */
    public java.math.BigDecimal getImpEsenzione() {
        return this.impEsenzione;
    }
    
    public void setImpEsenzione(java.math.BigDecimal impEsenzione) {
        this.impEsenzione = impEsenzione;
    }

    /**
     * 
     */
    public Integer getMesiRiduzione() {
        return this.mesiRiduzione;
    }
    
    public void setMesiRiduzione(Integer mesiRiduzione) {
        this.mesiRiduzione = mesiRiduzione;
    }

    /**
     * 
     */
    public java.math.BigDecimal getPercRiduzione() {
        return this.percRiduzione;
    }
    
    public void setPercRiduzione(java.math.BigDecimal percRiduzione) {
        this.percRiduzione = percRiduzione;
    }

    /**
     * 
     */
    public Integer getMesiAlqRidotta() {
        return this.mesiAlqRidotta;
    }
    
    public void setMesiAlqRidotta(Integer mesiAlqRidotta) {
        this.mesiAlqRidotta = mesiAlqRidotta;
    }

    /**
     * 
     */
    public java.math.BigDecimal getImpDetrazione() {
        return this.impDetrazione;
    }
    
    public void setImpDetrazione(java.math.BigDecimal impDetrazione) {
        this.impDetrazione = impDetrazione;
    }

    /**
     * 
     */
    public String getNoteInsediamento() {
        return this.noteInsediamento;
    }
    
    public void setNoteInsediamento(String noteInsediamento) {
        this.noteInsediamento = noteInsediamento;
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
    public Set getIciInsDetts() {
        return this.iciInsDetts;
    }
    
    public void setIciInsDetts(Set iciInsDetts) {
        this.iciInsDetts = iciInsDetts;
    }



}