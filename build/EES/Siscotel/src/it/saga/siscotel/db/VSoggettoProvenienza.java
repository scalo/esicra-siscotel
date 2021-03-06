package it.saga.siscotel.db;

import java.util.*;

/**
 * VSoggettoProvenienzaId generated by hbm2java
 */
public class VSoggettoProvenienza  implements java.io.Serializable {

    // Fields

     private java.math.BigDecimal soggPkid;
     private String codiceSoggetto;
     private Integer idEnte;
     private Date provDtmod;
     private String codProvenienza;
     private String desProvenienza;
     private VSoggettoProvenienzaId cid;
     
    // Constructors

    /** default constructor */
    public VSoggettoProvenienza() {
    }
   
    public VSoggettoProvenienzaId getCid() {
        return this.cid;
    }
    
    public void setCid(VSoggettoProvenienzaId cid) {
        this.cid = cid;
    }
   
    // Property accessors

    /**
     * 
     */
    public java.math.BigDecimal getSoggPkid() {
        return this.soggPkid;
    }
    
    public void setSoggPkid(java.math.BigDecimal soggPkid) {
        this.soggPkid = soggPkid;
    }

    /**
     * 
     */
    public String getCodiceSoggetto() {
        return this.codiceSoggetto;
    }
    
    public void setCodiceSoggetto(String codiceSoggetto) {
        this.codiceSoggetto = codiceSoggetto;
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
    public Date getProvDtmod() {
        return this.provDtmod;
    }
    
    public void setProvDtmod(Date provDtmod) {
        this.provDtmod = provDtmod;
    }

    /**
     * 
     */
    public String getCodProvenienza() {
        return this.codProvenienza;
    }
    
    public void setCodProvenienza(String codProvenienza) {
        this.codProvenienza = codProvenienza;
    }

    /**
     * 
     */
    public String getDesProvenienza() {
        return this.desProvenienza;
    }
    
    public void setDesProvenienza(String desProvenienza) {
        this.desProvenienza = desProvenienza;
    }

   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VSoggettoProvenienza) ) return false;
		 VSoggettoProvenienza castOther = ( VSoggettoProvenienza ) other; 
         
		 return (this.getSoggPkid()==castOther.getSoggPkid()) || ( this.getSoggPkid()!=null && castOther.getSoggPkid()!=null && this.getSoggPkid().equals(castOther.getSoggPkid()) )
 && (this.getCodiceSoggetto()==castOther.getCodiceSoggetto()) || ( this.getCodiceSoggetto()!=null && castOther.getCodiceSoggetto()!=null && this.getCodiceSoggetto().equals(castOther.getCodiceSoggetto()) )
 && (this.getIdEnte()==castOther.getIdEnte()) || ( this.getIdEnte()!=null && castOther.getIdEnte()!=null && this.getIdEnte().equals(castOther.getIdEnte()) )
 && (this.getProvDtmod()==castOther.getProvDtmod()) || ( this.getProvDtmod()!=null && castOther.getProvDtmod()!=null && this.getProvDtmod().equals(castOther.getProvDtmod()) )
 && (this.getCodProvenienza()==castOther.getCodProvenienza()) || ( this.getCodProvenienza()!=null && castOther.getCodProvenienza()!=null && this.getCodProvenienza().equals(castOther.getCodProvenienza()) )
 && (this.getDesProvenienza()==castOther.getDesProvenienza()) || ( this.getDesProvenienza()!=null && castOther.getDesProvenienza()!=null && this.getDesProvenienza().equals(castOther.getDesProvenienza()) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSoggPkid() == null ? 0 : this.getSoggPkid().hashCode() );
         result = 37 * result + ( getCodiceSoggetto() == null ? 0 : this.getCodiceSoggetto().hashCode() );
         result = 37 * result + ( getIdEnte() == null ? 0 : this.getIdEnte().hashCode() );
         result = 37 * result + ( getProvDtmod() == null ? 0 : this.getProvDtmod().hashCode() );
         result = 37 * result + ( getCodProvenienza() == null ? 0 : this.getCodProvenienza().hashCode() );
         result = 37 * result + ( getDesProvenienza() == null ? 0 : this.getDesProvenienza().hashCode() );
         return result;
   }   


}