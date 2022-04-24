package it.saga.siscotel.db;

import java.util.*;




/**
 * TerConsolato generated by hbm2java
 */
public class TerConsolato  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private String codConsolato;
     private String desConsolato;
     private Integer codIstat;
     private Integer tipo;
     private Set anaStcivs;
     private Set anaIndirizzos;
     private Set terLocalitas;


    // Constructors

    /** default constructor */
    public TerConsolato() {
    }
    
    /** constructor with id */
    public TerConsolato(java.math.BigDecimal pkid) {
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
    public String getCodConsolato() {
        return this.codConsolato;
    }
    
    public void setCodConsolato(String codConsolato) {
        this.codConsolato = codConsolato;
    }

    /**
     * 
     */
    public String getDesConsolato() {
        return this.desConsolato;
    }
    
    public void setDesConsolato(String desConsolato) {
        this.desConsolato = desConsolato;
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

    /**
     * 
     */
    public Integer getTipo() {
        return this.tipo;
    }
    
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    /**
     * 
     */
    public Set getAnaStcivs() {
        return this.anaStcivs;
    }
    
    public void setAnaStcivs(Set anaStcivs) {
        this.anaStcivs = anaStcivs;
    }

    /**
     * 
     */
    public Set getAnaIndirizzos() {
        return this.anaIndirizzos;
    }
    
    public void setAnaIndirizzos(Set anaIndirizzos) {
        this.anaIndirizzos = anaIndirizzos;
    }

    /**
     * 
     */
    public Set getTerLocalitas() {
        return this.terLocalitas;
    }
    
    public void setTerLocalitas(Set terLocalitas) {
        this.terLocalitas = terLocalitas;
    }



}