package it.saga.siscotel.db;

import java.util.*;




/**
 * Entealbo generated by hbm2java
 */
public class Entealbo  implements java.io.Serializable {

    // Fields    

     private Integer idEnte;
     private String desEnte;
     private Integer codIstat;


    // Constructors

    /** default constructor */
    public Entealbo() {
    }
    
    /** constructor with id */
    public Entealbo(Integer idEnte) {
        this.idEnte = idEnte;
    }
   
    
    

    // Property accessors

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
    public String getDesEnte() {
        return this.desEnte;
    }
    
    public void setDesEnte(String desEnte) {
        this.desEnte = desEnte;
    }

    /**
     * 
     */
    public Integer getCodIstat() {
        return this.codIstat;
    }
    
    public void setCodIstat(Integer codIstat) {
        this.codIstat = codIstat;
    }



}