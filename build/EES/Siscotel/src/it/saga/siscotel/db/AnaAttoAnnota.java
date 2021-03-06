package it.saga.siscotel.db;

import java.util.*;




/**
 * AnaAttoAnnota generated by hbm2java
 */
public class AnaAttoAnnota  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private AnaAtto anaAtto;
     private Date dtNota;
     private String codifica;
     private String nota;
     private Integer flgStampa;
     private Integer idEnte;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public AnaAttoAnnota() {
    }
    
    /** constructor with id */
    public AnaAttoAnnota(java.math.BigDecimal pkid) {
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
    public AnaAtto getAnaAtto() {
        return this.anaAtto;
    }
    
    public void setAnaAtto(AnaAtto anaAtto) {
        this.anaAtto = anaAtto;
    }

    /**
     * 
     */
    public Date getDtNota() {
        return this.dtNota;
    }
    
    public void setDtNota(Date dtNota) {
        this.dtNota = dtNota;
    }

    /**
     * 
     */
    public String getCodifica() {
        return this.codifica;
    }
    
    public void setCodifica(String codifica) {
        this.codifica = codifica;
    }

    /**
     * 
     */
    public String getNota() {
        return this.nota;
    }
    
    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * 
     */
    public Integer getFlgStampa() {
        return this.flgStampa;
    }
    
    public void setFlgStampa(Integer flgStampa) {
        this.flgStampa = flgStampa;
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