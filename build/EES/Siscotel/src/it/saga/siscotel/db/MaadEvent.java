package it.saga.siscotel.db;

import java.util.*;




/**
 * MaadEvent generated by hbm2java
 */
public class MaadEvent  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private MaadReport maadReport;
     private Integer idEvento;
     private String desEvento;
     private java.math.BigDecimal idEsito;
     private String desEsito;
     private Date dtEvent;


    // Constructors

    /** default constructor */
    public MaadEvent() {
    }
    
    /** constructor with id */
    public MaadEvent(java.math.BigDecimal pkid) {
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
    public MaadReport getMaadReport() {
        return this.maadReport;
    }
    
    public void setMaadReport(MaadReport maadReport) {
        this.maadReport = maadReport;
    }

    /**
     * 
     */
    public Integer getIdEvento() {
        return this.idEvento;
    }
    
    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    /**
     * 
     */
    public String getDesEvento() {
        return this.desEvento;
    }
    
    public void setDesEvento(String desEvento) {
        this.desEvento = desEvento;
    }

    /**
     * 
     */
    public java.math.BigDecimal getIdEsito() {
        return this.idEsito;
    }
    
    public void setIdEsito(java.math.BigDecimal idEsito) {
        this.idEsito = idEsito;
    }

    /**
     * 
     */
    public String getDesEsito() {
        return this.desEsito;
    }
    
    public void setDesEsito(String desEsito) {
        this.desEsito = desEsito;
    }

    /**
     * 
     */
    public Date getDtEvent() {
        return this.dtEvent;
    }
    
    public void setDtEvent(Date dtEvent) {
        this.dtEvent = dtEvent;
    }



}