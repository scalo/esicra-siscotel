package it.saga.siscotel.db;

import java.util.*;




/**
 * RsuInsediamento generated by hbm2java
 */
public class RsuInsediamento  implements java.io.Serializable {

    // Fields    

     private Integer pkid;
     private AnaSoggetto anaSoggetto;
     private TerArea terArea;
     private String codInsediamento;
     private Integer flgStato;
     private Double superficie;
     private String desArea;
     private Integer numCiv;
     private String letCiv;
     private String colore;
     private String corte;
     private String scala;
     private String interno;
     private String piano;
     private String edificio;
     private String codEcografico;
     private Date dtDenuncia;
     private String numRicevuta;
     private Date dtRicevuta;
     private String desTariffa;
     private String desTariffa1;
     private Integer numAccertamento;
     private Date dtAccertamento;
     private String desTipoDenuncia;
     private String note;
     private Integer idEnte;
     private Date dtIni;
     private Date dtFin;
     private Date dtMod;
     private Set rsuInsAgevolaziones;
     private Set rsuInsComponentes;
     private Set rsuInsCalcolos;


    // Constructors

    /** default constructor */
    public RsuInsediamento() {
    }
    
    /** constructor with id */
    public RsuInsediamento(Integer pkid) {
        this.pkid = pkid;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public Integer getPkid() {
        return this.pkid;
    }
    
    public void setPkid(Integer pkid) {
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
    public TerArea getTerArea() {
        return this.terArea;
    }
    
    public void setTerArea(TerArea terArea) {
        this.terArea = terArea;
    }

    /**
     * 
     */
    public String getCodInsediamento() {
        return this.codInsediamento;
    }
    
    public void setCodInsediamento(String codInsediamento) {
        this.codInsediamento = codInsediamento;
    }

    /**
     * 
     */
    public Integer getFlgStato() {
        return this.flgStato;
    }
    
    public void setFlgStato(Integer flgStato) {
        this.flgStato = flgStato;
    }

    /**
     * 
     */
    public Double getSuperficie() {
        return this.superficie;
    }
    
    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
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
    public String getCodEcografico() {
        return this.codEcografico;
    }
    
    public void setCodEcografico(String codEcografico) {
        this.codEcografico = codEcografico;
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
    public String getNumRicevuta() {
        return this.numRicevuta;
    }
    
    public void setNumRicevuta(String numRicevuta) {
        this.numRicevuta = numRicevuta;
    }

    /**
     * 
     */
    public Date getDtRicevuta() {
        return this.dtRicevuta;
    }
    
    public void setDtRicevuta(Date dtRicevuta) {
        this.dtRicevuta = dtRicevuta;
    }

    /**
     * 
     */
    public String getDesTariffa() {
        return this.desTariffa;
    }
    
    public void setDesTariffa(String desTariffa) {
        this.desTariffa = desTariffa;
    }

    /**
     * 
     */
    public String getDesTariffa1() {
        return this.desTariffa1;
    }
    
    public void setDesTariffa1(String desTariffa1) {
        this.desTariffa1 = desTariffa1;
    }

    /**
     * 
     */
    public Integer getNumAccertamento() {
        return this.numAccertamento;
    }
    
    public void setNumAccertamento(Integer numAccertamento) {
        this.numAccertamento = numAccertamento;
    }

    /**
     * 
     */
    public Date getDtAccertamento() {
        return this.dtAccertamento;
    }
    
    public void setDtAccertamento(Date dtAccertamento) {
        this.dtAccertamento = dtAccertamento;
    }

    /**
     * 
     */
    public String getDesTipoDenuncia() {
        return this.desTipoDenuncia;
    }
    
    public void setDesTipoDenuncia(String desTipoDenuncia) {
        this.desTipoDenuncia = desTipoDenuncia;
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

    /**
     * 
     */
    public Set getRsuInsAgevolaziones() {
        return this.rsuInsAgevolaziones;
    }
    
    public void setRsuInsAgevolaziones(Set rsuInsAgevolaziones) {
        this.rsuInsAgevolaziones = rsuInsAgevolaziones;
    }

    /**
     * 
     */
    public Set getRsuInsComponentes() {
        return this.rsuInsComponentes;
    }
    
    public void setRsuInsComponentes(Set rsuInsComponentes) {
        this.rsuInsComponentes = rsuInsComponentes;
    }

    /**
     * 
     */
    public Set getRsuInsCalcolos() {
        return this.rsuInsCalcolos;
    }
    
    public void setRsuInsCalcolos(Set rsuInsCalcolos) {
        this.rsuInsCalcolos = rsuInsCalcolos;
    }



}