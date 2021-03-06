package it.saga.siscotel.db;

import java.util.*;




/**
 * TerAccesso generated by hbm2java
 */
public class TerAccesso  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private TerEnte terEnte;
     private TerEnte terEnte_1;
     private TerArea terArea;
     private TerEnte terEnte_2;
     private Integer civicoNum;
     private String civicoLet;
     private Integer flKm;
     private String zonaRsu;
     private String zonaOsap;
     private Integer sezCensimento;
     private Integer sezElettorale;
     private Integer codiceAcq;
     private Integer codiceGas;
     private String cap;
     private Integer idEnte;
     private Date dtMod;
     private Set anaEles;


    // Constructors

    /** default constructor */
    public TerAccesso() {
    }
    
    /** constructor with id */
    public TerAccesso(java.math.BigDecimal pkid) {
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
    public TerEnte getTerEnte() {
        return this.terEnte;
    }
    
    public void setTerEnte(TerEnte terEnte) {
        this.terEnte = terEnte;
    }

    /**
     * 
     */
    public TerEnte getTerEnte_1() {
        return this.terEnte_1;
    }
    
    public void setTerEnte_1(TerEnte terEnte_1) {
        this.terEnte_1 = terEnte_1;
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
    public TerEnte getTerEnte_2() {
        return this.terEnte_2;
    }
    
    public void setTerEnte_2(TerEnte terEnte_2) {
        this.terEnte_2 = terEnte_2;
    }

    /**
     * 
     */
    public Integer getCivicoNum() {
        return this.civicoNum;
    }
    
    public void setCivicoNum(Integer civicoNum) {
        this.civicoNum = civicoNum;
    }

    /**
     * 
     */
    public String getCivicoLet() {
        return this.civicoLet;
    }
    
    public void setCivicoLet(String civicoLet) {
        this.civicoLet = civicoLet;
    }

    /**
     * 
     */
    public Integer getFlKm() {
        return this.flKm;
    }
    
    public void setFlKm(Integer flKm) {
        this.flKm = flKm;
    }

    /**
     * 
     */
    public String getZonaRsu() {
        return this.zonaRsu;
    }
    
    public void setZonaRsu(String zonaRsu) {
        this.zonaRsu = zonaRsu;
    }

    /**
     * 
     */
    public String getZonaOsap() {
        return this.zonaOsap;
    }
    
    public void setZonaOsap(String zonaOsap) {
        this.zonaOsap = zonaOsap;
    }

    /**
     * 
     */
    public Integer getSezCensimento() {
        return this.sezCensimento;
    }
    
    public void setSezCensimento(Integer sezCensimento) {
        this.sezCensimento = sezCensimento;
    }

    /**
     * 
     */
    public Integer getSezElettorale() {
        return this.sezElettorale;
    }
    
    public void setSezElettorale(Integer sezElettorale) {
        this.sezElettorale = sezElettorale;
    }

    /**
     * 
     */
    public Integer getCodiceAcq() {
        return this.codiceAcq;
    }
    
    public void setCodiceAcq(Integer codiceAcq) {
        this.codiceAcq = codiceAcq;
    }

    /**
     * 
     */
    public Integer getCodiceGas() {
        return this.codiceGas;
    }
    
    public void setCodiceGas(Integer codiceGas) {
        this.codiceGas = codiceGas;
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
    public Set getAnaEles() {
        return this.anaEles;
    }
    
    public void setAnaEles(Set anaEles) {
        this.anaEles = anaEles;
    }



}