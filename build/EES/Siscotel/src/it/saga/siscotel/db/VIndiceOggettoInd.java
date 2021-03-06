package it.saga.siscotel.db;

import java.util.*;

/**
 * VIndiceOggettoIndId generated by hbm2java
 */
public class VIndiceOggettoInd  implements java.io.Serializable {

    // Fields    

     private VIndiceOggettoIndId cid;
     private String codiceEcografico;
     private String codAot;
     private String codCatasto;
     private Date aotDtmod;
     private String aotCodIstat;
     private String areaIndirizzo;
     private Integer numeroCivico;
     private String letteraCivico;
     private String coloreCivico;
     private String corteCivico;
     private String scalaCivico;
     private String internoCivico;
     private String pianoCivico;
     private String edificioCivico;
     private Date dtIni;
     private Date dtFin;
     private Integer idEnte;


    // Constructors

    /** default constructor */
    public VIndiceOggettoInd() {
    }
    
   
    
    

    // Property accessors

    /**
     * 
     */
    public VIndiceOggettoIndId getCid() {
        return this.cid;
    }
    
    public void setCid(VIndiceOggettoIndId cid) {
        this.cid = cid;
    }

    /**
     * 
     */
    public String getCodiceEcografico() {
        return this.codiceEcografico;
    }
    
    public void setCodiceEcografico(String codiceEcografico) {
        this.codiceEcografico = codiceEcografico;
    }

    /**
     * 
     */
    public String getCodAot() {
        return this.codAot;
    }
    
    public void setCodAot(String codAot) {
        this.codAot = codAot;
    }

    /**
     * 
     */
    public String getCodCatasto() {
        return this.codCatasto;
    }
    
    public void setCodCatasto(String codCatasto) {
        this.codCatasto = codCatasto;
    }

    /**
     * 
     */
    public Date getAotDtmod() {
        return this.aotDtmod;
    }
    
    public void setAotDtmod(Date aotDtmod) {
        this.aotDtmod = aotDtmod;
    }

    /**
     * 
     */
    public String getAotCodIstat() {
        return this.aotCodIstat;
    }
    
    public void setAotCodIstat(String aotCodIstat) {
        this.aotCodIstat = aotCodIstat;
    }

    /**
     * 
     */
    public String getAreaIndirizzo() {
        return this.areaIndirizzo;
    }
    
    public void setAreaIndirizzo(String areaIndirizzo) {
        this.areaIndirizzo = areaIndirizzo;
    }

    /**
     * 
     */
    public Integer getNumeroCivico() {
        return this.numeroCivico;
    }
    
    public void setNumeroCivico(Integer numeroCivico) {
        this.numeroCivico = numeroCivico;
    }

    /**
     * 
     */
    public String getLetteraCivico() {
        return this.letteraCivico;
    }
    
    public void setLetteraCivico(String letteraCivico) {
        this.letteraCivico = letteraCivico;
    }

    /**
     * 
     */
    public String getColoreCivico() {
        return this.coloreCivico;
    }
    
    public void setColoreCivico(String coloreCivico) {
        this.coloreCivico = coloreCivico;
    }

    /**
     * 
     */
    public String getCorteCivico() {
        return this.corteCivico;
    }
    
    public void setCorteCivico(String corteCivico) {
        this.corteCivico = corteCivico;
    }

    /**
     * 
     */
    public String getScalaCivico() {
        return this.scalaCivico;
    }
    
    public void setScalaCivico(String scalaCivico) {
        this.scalaCivico = scalaCivico;
    }

    /**
     * 
     */
    public String getInternoCivico() {
        return this.internoCivico;
    }
    
    public void setInternoCivico(String internoCivico) {
        this.internoCivico = internoCivico;
    }

    /**
     * 
     */
    public String getPianoCivico() {
        return this.pianoCivico;
    }
    
    public void setPianoCivico(String pianoCivico) {
        this.pianoCivico = pianoCivico;
    }

    /**
     * 
     */
    public String getEdificioCivico() {
        return this.edificioCivico;
    }
    
    public void setEdificioCivico(String edificioCivico) {
        this.edificioCivico = edificioCivico;
    }

    /**
     * 
     */
    public Date getDtIni() {
        return this.dtIni;
    }
    
    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }

    /**
     * 
     */
    public Date getDtFin() {
        return this.dtFin;
    }
    
    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
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

   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VIndiceOggettoInd) ) return false;
		 VIndiceOggettoInd castOther = ( VIndiceOggettoInd ) other; 
         
		 return (this.getCid()==castOther.getCid()) || ( this.getCid()!=null && castOther.getCid()!=null && this.getCid().equals(castOther.getCid()) )
 && (this.getCodiceEcografico()==castOther.getCodiceEcografico()) || ( this.getCodiceEcografico()!=null && castOther.getCodiceEcografico()!=null && this.getCodiceEcografico().equals(castOther.getCodiceEcografico()) )
 && (this.getCodAot()==castOther.getCodAot()) || ( this.getCodAot()!=null && castOther.getCodAot()!=null && this.getCodAot().equals(castOther.getCodAot()) )
 && (this.getCodCatasto()==castOther.getCodCatasto()) || ( this.getCodCatasto()!=null && castOther.getCodCatasto()!=null && this.getCodCatasto().equals(castOther.getCodCatasto()) )
 && (this.getAotDtmod()==castOther.getAotDtmod()) || ( this.getAotDtmod()!=null && castOther.getAotDtmod()!=null && this.getAotDtmod().equals(castOther.getAotDtmod()) )
 && (this.getAotCodIstat()==castOther.getAotCodIstat()) || ( this.getAotCodIstat()!=null && castOther.getAotCodIstat()!=null && this.getAotCodIstat().equals(castOther.getAotCodIstat()) )
 && (this.getAreaIndirizzo()==castOther.getAreaIndirizzo()) || ( this.getAreaIndirizzo()!=null && castOther.getAreaIndirizzo()!=null && this.getAreaIndirizzo().equals(castOther.getAreaIndirizzo()) )
 && (this.getNumeroCivico()==castOther.getNumeroCivico()) || ( this.getNumeroCivico()!=null && castOther.getNumeroCivico()!=null && this.getNumeroCivico().equals(castOther.getNumeroCivico()) )
 && (this.getLetteraCivico()==castOther.getLetteraCivico()) || ( this.getLetteraCivico()!=null && castOther.getLetteraCivico()!=null && this.getLetteraCivico().equals(castOther.getLetteraCivico()) )
 && (this.getColoreCivico()==castOther.getColoreCivico()) || ( this.getColoreCivico()!=null && castOther.getColoreCivico()!=null && this.getColoreCivico().equals(castOther.getColoreCivico()) )
 && (this.getCorteCivico()==castOther.getCorteCivico()) || ( this.getCorteCivico()!=null && castOther.getCorteCivico()!=null && this.getCorteCivico().equals(castOther.getCorteCivico()) )
 && (this.getScalaCivico()==castOther.getScalaCivico()) || ( this.getScalaCivico()!=null && castOther.getScalaCivico()!=null && this.getScalaCivico().equals(castOther.getScalaCivico()) )
 && (this.getInternoCivico()==castOther.getInternoCivico()) || ( this.getInternoCivico()!=null && castOther.getInternoCivico()!=null && this.getInternoCivico().equals(castOther.getInternoCivico()) )
 && (this.getPianoCivico()==castOther.getPianoCivico()) || ( this.getPianoCivico()!=null && castOther.getPianoCivico()!=null && this.getPianoCivico().equals(castOther.getPianoCivico()) )
 && (this.getEdificioCivico()==castOther.getEdificioCivico()) || ( this.getEdificioCivico()!=null && castOther.getEdificioCivico()!=null && this.getEdificioCivico().equals(castOther.getEdificioCivico()) )
 && (this.getDtIni()==castOther.getDtIni()) || ( this.getDtIni()!=null && castOther.getDtIni()!=null && this.getDtIni().equals(castOther.getDtIni()) )
 && (this.getDtFin()==castOther.getDtFin()) || ( this.getDtFin()!=null && castOther.getDtFin()!=null && this.getDtFin().equals(castOther.getDtFin()) )
 && (this.getIdEnte()==castOther.getIdEnte()) || ( this.getIdEnte()!=null && castOther.getIdEnte()!=null && this.getIdEnte().equals(castOther.getIdEnte()) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCid() == null ? 0 : this.getCid().hashCode() );
         result = 37 * result + ( getCodiceEcografico() == null ? 0 : this.getCodiceEcografico().hashCode() );
         result = 37 * result + ( getCodAot() == null ? 0 : this.getCodAot().hashCode() );
         result = 37 * result + ( getCodCatasto() == null ? 0 : this.getCodCatasto().hashCode() );
         result = 37 * result + ( getAotDtmod() == null ? 0 : this.getAotDtmod().hashCode() );
         result = 37 * result + ( getAotCodIstat() == null ? 0 : this.getAotCodIstat().hashCode() );
         result = 37 * result + ( getAreaIndirizzo() == null ? 0 : this.getAreaIndirizzo().hashCode() );
         result = 37 * result + ( getNumeroCivico() == null ? 0 : this.getNumeroCivico().hashCode() );
         result = 37 * result + ( getLetteraCivico() == null ? 0 : this.getLetteraCivico().hashCode() );
         result = 37 * result + ( getColoreCivico() == null ? 0 : this.getColoreCivico().hashCode() );
         result = 37 * result + ( getCorteCivico() == null ? 0 : this.getCorteCivico().hashCode() );
         result = 37 * result + ( getScalaCivico() == null ? 0 : this.getScalaCivico().hashCode() );
         result = 37 * result + ( getInternoCivico() == null ? 0 : this.getInternoCivico().hashCode() );
         result = 37 * result + ( getPianoCivico() == null ? 0 : this.getPianoCivico().hashCode() );
         result = 37 * result + ( getEdificioCivico() == null ? 0 : this.getEdificioCivico().hashCode() );
         result = 37 * result + ( getDtIni() == null ? 0 : this.getDtIni().hashCode() );
         result = 37 * result + ( getDtFin() == null ? 0 : this.getDtFin().hashCode() );
         result = 37 * result + ( getIdEnte() == null ? 0 : this.getIdEnte().hashCode() );
         return result;
   }   


}