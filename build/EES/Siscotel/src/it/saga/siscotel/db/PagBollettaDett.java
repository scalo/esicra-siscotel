package it.saga.siscotel.db;

import java.util.*;




/**
 * PagBollettaDett generated by hbm2java
 */
public class PagBollettaDett  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private PagBolletta pagBolletta;
     private String codVoce;
     private String desVoce;
     private java.math.BigDecimal importo;
     private String valore;
     private Integer idEnte;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public PagBollettaDett() {
    }
    
    /** constructor with id */
    public PagBollettaDett(java.math.BigDecimal pkid) {
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
    public PagBolletta getPagBolletta() {
        return this.pagBolletta;
    }
    
    public void setPagBolletta(PagBolletta pagBolletta) {
        this.pagBolletta = pagBolletta;
    }

    /**
     * 
     */
    public String getCodVoce() {
        return this.codVoce;
    }
    
    public void setCodVoce(String codVoce) {
        this.codVoce = codVoce;
    }

    /**
     * 
     */
    public String getDesVoce() {
        return this.desVoce;
    }
    
    public void setDesVoce(String desVoce) {
        this.desVoce = desVoce;
    }

    /**
     * 
     */
    public java.math.BigDecimal getImporto() {
        return this.importo;
    }
    
    public void setImporto(java.math.BigDecimal importo) {
        this.importo = importo;
    }

    /**
     * 
     */
    public String getValore() {
        return this.valore;
    }
    
    public void setValore(String valore) {
        this.valore = valore;
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