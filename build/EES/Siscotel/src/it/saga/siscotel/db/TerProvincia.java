package it.saga.siscotel.db;

import java.util.*;




/**
 * TerProvincia generated by hbm2java
 */
public class TerProvincia  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private TerRegione terRegione;
     private String codProvincia;
     private String desProvincia;
     private String sigla;
     private Integer codIstatProvincia;
     private Integer idEnte;
     private Set terComunes;


    // Constructors

    /** default constructor */
    public TerProvincia() {
    }
    
    /** constructor with id */
    public TerProvincia(java.math.BigDecimal pkid) {
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
    public TerRegione getTerRegione() {
        return this.terRegione;
    }
    
    public void setTerRegione(TerRegione terRegione) {
        this.terRegione = terRegione;
    }

    /**
     * 
     */
    public String getCodProvincia() {
        return this.codProvincia;
    }
    
    public void setCodProvincia(String codProvincia) {
        this.codProvincia = codProvincia;
    }

    /**
     * 
     */
    public String getDesProvincia() {
        return this.desProvincia;
    }
    
    public void setDesProvincia(String desProvincia) {
        this.desProvincia = desProvincia;
    }

    /**
     * 
     */
    public String getSigla() {
        return this.sigla;
    }
    
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * 
     */
    public Integer getCodIstatProvincia() {
        return this.codIstatProvincia;
    }
    
    public void setCodIstatProvincia(Integer codIstatProvincia) {
        this.codIstatProvincia = codIstatProvincia;
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
    public Set getTerComunes() {
        return this.terComunes;
    }
    
    public void setTerComunes(Set terComunes) {
        this.terComunes = terComunes;
    }



}