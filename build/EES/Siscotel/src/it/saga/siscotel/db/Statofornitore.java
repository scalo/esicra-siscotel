package it.saga.siscotel.db;

import java.util.*;




/**
 * Statofornitore generated by hbm2java
 */
public class Statofornitore  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkstatofornitore;
     private String codStato;
     private String desStato;
     private java.math.BigDecimal idEnte;
     private Set alboForCatStatos;


    // Constructors

    /** default constructor */
    public Statofornitore() {
    }
    
    /** constructor with id */
    public Statofornitore(java.math.BigDecimal pkstatofornitore) {
        this.pkstatofornitore = pkstatofornitore;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public java.math.BigDecimal getPkstatofornitore() {
        return this.pkstatofornitore;
    }
    
    public void setPkstatofornitore(java.math.BigDecimal pkstatofornitore) {
        this.pkstatofornitore = pkstatofornitore;
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
    public java.math.BigDecimal getIdEnte() {
        return this.idEnte;
    }
    
    public void setIdEnte(java.math.BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    /**
     * 
     */
    public Set getAlboForCatStatos() {
        return this.alboForCatStatos;
    }
    
    public void setAlboForCatStatos(Set alboForCatStatos) {
        this.alboForCatStatos = alboForCatStatos;
    }



}