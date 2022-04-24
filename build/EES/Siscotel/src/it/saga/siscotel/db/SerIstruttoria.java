package it.saga.siscotel.db;

import java.util.*;




/**
 * SerIstruttoria generated by hbm2java
 */
public class SerIstruttoria  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private java.math.BigDecimal idServizio;
     private String desServizio;
     private String codIter;
     private String desIterBreve;
     private String desIterLunga;
     private Integer numProgr;
     private Integer idEnte;
     private String note;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public SerIstruttoria() {
    }
    
    /** constructor with id */
    public SerIstruttoria(java.math.BigDecimal pkid) {
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
    public java.math.BigDecimal getIdServizio() {
        return this.idServizio;
    }
    
    public void setIdServizio(java.math.BigDecimal idServizio) {
        this.idServizio = idServizio;
    }

    /**
     * 
     */
    public String getDesServizio() {
        return this.desServizio;
    }
    
    public void setDesServizio(String desServizio) {
        this.desServizio = desServizio;
    }

    /**
     * 
     */
    public String getCodIter() {
        return this.codIter;
    }
    
    public void setCodIter(String codIter) {
        this.codIter = codIter;
    }

    /**
     * 
     */
    public String getDesIterBreve() {
        return this.desIterBreve;
    }
    
    public void setDesIterBreve(String desIterBreve) {
        this.desIterBreve = desIterBreve;
    }

    /**
     * 
     */
    public String getDesIterLunga() {
        return this.desIterLunga;
    }
    
    public void setDesIterLunga(String desIterLunga) {
        this.desIterLunga = desIterLunga;
    }

    /**
     * 
     */
    public Integer getNumProgr() {
        return this.numProgr;
    }
    
    public void setNumProgr(Integer numProgr) {
        this.numProgr = numProgr;
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
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
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