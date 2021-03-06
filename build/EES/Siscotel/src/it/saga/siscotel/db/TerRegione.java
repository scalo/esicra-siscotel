package it.saga.siscotel.db;

import java.util.*;




/**
 * TerRegione generated by hbm2java
 */
public class TerRegione  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private String codRegione;
     private String desRegione;
     private Integer codIstatRegione;
     private Set terProvincias;


    // Constructors

    /** default constructor */
    public TerRegione() {
    }
    
    /** constructor with id */
    public TerRegione(java.math.BigDecimal pkid) {
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
    public String getCodRegione() {
        return this.codRegione;
    }
    
    public void setCodRegione(String codRegione) {
        this.codRegione = codRegione;
    }

    /**
     * 
     */
    public String getDesRegione() {
        return this.desRegione;
    }
    
    public void setDesRegione(String desRegione) {
        this.desRegione = desRegione;
    }

    /**
     * 
     */
    public Integer getCodIstatRegione() {
        return this.codIstatRegione;
    }
    
    public void setCodIstatRegione(Integer codIstatRegione) {
        this.codIstatRegione = codIstatRegione;
    }

    /**
     * 
     */
    public Set getTerProvincias() {
        return this.terProvincias;
    }
    
    public void setTerProvincias(Set terProvincias) {
        this.terProvincias = terProvincias;
    }



}