package it.saga.siscotel.db;

import java.util.*;




/**
 * Statoiter generated by hbm2java
 */
public class Statoiter  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkstatoiter;
     private String codStato;
     private String desStato;
     private java.math.BigDecimal idEnte;
     private Set richiesteaccreditamentoiters;


    // Constructors

    /** default constructor */
    public Statoiter() {
    }
    
    /** constructor with id */
    public Statoiter(java.math.BigDecimal pkstatoiter) {
        this.pkstatoiter = pkstatoiter;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public java.math.BigDecimal getPkstatoiter() {
        return this.pkstatoiter;
    }
    
    public void setPkstatoiter(java.math.BigDecimal pkstatoiter) {
        this.pkstatoiter = pkstatoiter;
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
    public Set getRichiesteaccreditamentoiters() {
        return this.richiesteaccreditamentoiters;
    }
    
    public void setRichiesteaccreditamentoiters(Set richiesteaccreditamentoiters) {
        this.richiesteaccreditamentoiters = richiesteaccreditamentoiters;
    }



}