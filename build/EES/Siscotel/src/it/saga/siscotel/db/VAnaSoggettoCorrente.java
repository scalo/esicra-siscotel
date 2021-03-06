package it.saga.siscotel.db;

import java.util.*;




/**
 * VAnaSoggettoCorrenteId generated by hbm2java
 */
public class VAnaSoggettoCorrente  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal pkid;
     private Integer provenienza;
     private String codSoggetto;
     private String codiceFiscale;
     private Integer flgCfCalcolato;
     private Integer natura;
     private Integer tipoNatura;
     private String partitaIva;
     private String cognome;
     private String nome;
     private String altriNomi;
     private String denominazione;
     private Date dtNascita;
     private Integer precisioneDtNascita;
     private Integer sesso;
     private String note;
     private java.math.BigDecimal fkidComuneNascita;
     private String desComuneNascita;
     private String desProvinciaNascita;
     private java.math.BigDecimal fkidStatoNascita;
     private String desStatoNascita;
     private java.math.BigDecimal fkidLocalitaNascita;
     private String desLocalitaNascita;
     private Integer flgStato;
     private Integer fkidRappresentante;
     private java.math.BigDecimal idEnte;
     private Date dtIni;
     private Date dtFin;
     private Date dtMod;


    // Constructors

    /** default constructor */
    public VAnaSoggettoCorrente() {
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
    public Integer getProvenienza() {
        return this.provenienza;
    }
    
    public void setProvenienza(Integer provenienza) {
        this.provenienza = provenienza;
    }

    /**
     * 
     */
    public String getCodSoggetto() {
        return this.codSoggetto;
    }
    
    public void setCodSoggetto(String codSoggetto) {
        this.codSoggetto = codSoggetto;
    }

    /**
     * 
     */
    public String getCodiceFiscale() {
        return this.codiceFiscale;
    }
    
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    /**
     * 
     */
    public Integer getFlgCfCalcolato() {
        return this.flgCfCalcolato;
    }
    
    public void setFlgCfCalcolato(Integer flgCfCalcolato) {
        this.flgCfCalcolato = flgCfCalcolato;
    }

    /**
     * 
     */
    public Integer getNatura() {
        return this.natura;
    }
    
    public void setNatura(Integer natura) {
        this.natura = natura;
    }

    /**
     * 
     */
    public Integer getTipoNatura() {
        return this.tipoNatura;
    }
    
    public void setTipoNatura(Integer tipoNatura) {
        this.tipoNatura = tipoNatura;
    }

    /**
     * 
     */
    public String getPartitaIva() {
        return this.partitaIva;
    }
    
    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    /**
     * 
     */
    public String getCognome() {
        return this.cognome;
    }
    
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * 
     */
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * 
     */
    public String getAltriNomi() {
        return this.altriNomi;
    }
    
    public void setAltriNomi(String altriNomi) {
        this.altriNomi = altriNomi;
    }

    /**
     * 
     */
    public String getDenominazione() {
        return this.denominazione;
    }
    
    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    /**
     * 
     */
    public Date getDtNascita() {
        return this.dtNascita;
    }
    
    public void setDtNascita(Date dtNascita) {
        this.dtNascita = dtNascita;
    }

    /**
     * 
     */
    public Integer getPrecisioneDtNascita() {
        return this.precisioneDtNascita;
    }
    
    public void setPrecisioneDtNascita(Integer precisioneDtNascita) {
        this.precisioneDtNascita = precisioneDtNascita;
    }

    /**
     * 
     */
    public Integer getSesso() {
        return this.sesso;
    }
    
    public void setSesso(Integer sesso) {
        this.sesso = sesso;
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
    public java.math.BigDecimal getFkidComuneNascita() {
        return this.fkidComuneNascita;
    }
    
    public void setFkidComuneNascita(java.math.BigDecimal fkidComuneNascita) {
        this.fkidComuneNascita = fkidComuneNascita;
    }

    /**
     * 
     */
    public String getDesComuneNascita() {
        return this.desComuneNascita;
    }
    
    public void setDesComuneNascita(String desComuneNascita) {
        this.desComuneNascita = desComuneNascita;
    }

    /**
     * 
     */
    public String getDesProvinciaNascita() {
        return this.desProvinciaNascita;
    }
    
    public void setDesProvinciaNascita(String desProvinciaNascita) {
        this.desProvinciaNascita = desProvinciaNascita;
    }

    /**
     * 
     */
    public java.math.BigDecimal getFkidStatoNascita() {
        return this.fkidStatoNascita;
    }
    
    public void setFkidStatoNascita(java.math.BigDecimal fkidStatoNascita) {
        this.fkidStatoNascita = fkidStatoNascita;
    }

    /**
     * 
     */
    public String getDesStatoNascita() {
        return this.desStatoNascita;
    }
    
    public void setDesStatoNascita(String desStatoNascita) {
        this.desStatoNascita = desStatoNascita;
    }

    /**
     * 
     */
    public java.math.BigDecimal getFkidLocalitaNascita() {
        return this.fkidLocalitaNascita;
    }
    
    public void setFkidLocalitaNascita(java.math.BigDecimal fkidLocalitaNascita) {
        this.fkidLocalitaNascita = fkidLocalitaNascita;
    }

    /**
     * 
     */
    public String getDesLocalitaNascita() {
        return this.desLocalitaNascita;
    }
    
    public void setDesLocalitaNascita(String desLocalitaNascita) {
        this.desLocalitaNascita = desLocalitaNascita;
    }

    /**
     * 
     */
    public Integer getFlgStato() {
        return this.flgStato;
    }
    
    public void setFlgStato(Integer flgStato) {
        this.flgStato = flgStato;
    }

    /**
     * 
     */
    public Integer getFkidRappresentante() {
        return this.fkidRappresentante;
    }
    
    public void setFkidRappresentante(Integer fkidRappresentante) {
        this.fkidRappresentante = fkidRappresentante;
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
    public Date getDtMod() {
        return this.dtMod;
    }
    
    public void setDtMod(Date dtMod) {
        this.dtMod = dtMod;
    }

   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VAnaSoggettoCorrente) ) return false;
		 VAnaSoggettoCorrente castOther = ( VAnaSoggettoCorrente ) other; 
         
		 return (this.getPkid()==castOther.getPkid()) || ( this.getPkid()!=null && castOther.getPkid()!=null && this.getPkid().equals(castOther.getPkid()) )
 && (this.getProvenienza()==castOther.getProvenienza()) || ( this.getProvenienza()!=null && castOther.getProvenienza()!=null && this.getProvenienza().equals(castOther.getProvenienza()) )
 && (this.getCodSoggetto()==castOther.getCodSoggetto()) || ( this.getCodSoggetto()!=null && castOther.getCodSoggetto()!=null && this.getCodSoggetto().equals(castOther.getCodSoggetto()) )
 && (this.getCodiceFiscale()==castOther.getCodiceFiscale()) || ( this.getCodiceFiscale()!=null && castOther.getCodiceFiscale()!=null && this.getCodiceFiscale().equals(castOther.getCodiceFiscale()) )
 && (this.getFlgCfCalcolato()==castOther.getFlgCfCalcolato()) || ( this.getFlgCfCalcolato()!=null && castOther.getFlgCfCalcolato()!=null && this.getFlgCfCalcolato().equals(castOther.getFlgCfCalcolato()) )
 && (this.getNatura()==castOther.getNatura()) || ( this.getNatura()!=null && castOther.getNatura()!=null && this.getNatura().equals(castOther.getNatura()) )
 && (this.getTipoNatura()==castOther.getTipoNatura()) || ( this.getTipoNatura()!=null && castOther.getTipoNatura()!=null && this.getTipoNatura().equals(castOther.getTipoNatura()) )
 && (this.getPartitaIva()==castOther.getPartitaIva()) || ( this.getPartitaIva()!=null && castOther.getPartitaIva()!=null && this.getPartitaIva().equals(castOther.getPartitaIva()) )
 && (this.getCognome()==castOther.getCognome()) || ( this.getCognome()!=null && castOther.getCognome()!=null && this.getCognome().equals(castOther.getCognome()) )
 && (this.getNome()==castOther.getNome()) || ( this.getNome()!=null && castOther.getNome()!=null && this.getNome().equals(castOther.getNome()) )
 && (this.getAltriNomi()==castOther.getAltriNomi()) || ( this.getAltriNomi()!=null && castOther.getAltriNomi()!=null && this.getAltriNomi().equals(castOther.getAltriNomi()) )
 && (this.getDenominazione()==castOther.getDenominazione()) || ( this.getDenominazione()!=null && castOther.getDenominazione()!=null && this.getDenominazione().equals(castOther.getDenominazione()) )
 && (this.getDtNascita()==castOther.getDtNascita()) || ( this.getDtNascita()!=null && castOther.getDtNascita()!=null && this.getDtNascita().equals(castOther.getDtNascita()) )
 && (this.getPrecisioneDtNascita()==castOther.getPrecisioneDtNascita()) || ( this.getPrecisioneDtNascita()!=null && castOther.getPrecisioneDtNascita()!=null && this.getPrecisioneDtNascita().equals(castOther.getPrecisioneDtNascita()) )
 && (this.getSesso()==castOther.getSesso()) || ( this.getSesso()!=null && castOther.getSesso()!=null && this.getSesso().equals(castOther.getSesso()) )
 && (this.getNote()==castOther.getNote()) || ( this.getNote()!=null && castOther.getNote()!=null && this.getNote().equals(castOther.getNote()) )
 && (this.getFkidComuneNascita()==castOther.getFkidComuneNascita()) || ( this.getFkidComuneNascita()!=null && castOther.getFkidComuneNascita()!=null && this.getFkidComuneNascita().equals(castOther.getFkidComuneNascita()) )
 && (this.getDesComuneNascita()==castOther.getDesComuneNascita()) || ( this.getDesComuneNascita()!=null && castOther.getDesComuneNascita()!=null && this.getDesComuneNascita().equals(castOther.getDesComuneNascita()) )
 && (this.getDesProvinciaNascita()==castOther.getDesProvinciaNascita()) || ( this.getDesProvinciaNascita()!=null && castOther.getDesProvinciaNascita()!=null && this.getDesProvinciaNascita().equals(castOther.getDesProvinciaNascita()) )
 && (this.getFkidStatoNascita()==castOther.getFkidStatoNascita()) || ( this.getFkidStatoNascita()!=null && castOther.getFkidStatoNascita()!=null && this.getFkidStatoNascita().equals(castOther.getFkidStatoNascita()) )
 && (this.getDesStatoNascita()==castOther.getDesStatoNascita()) || ( this.getDesStatoNascita()!=null && castOther.getDesStatoNascita()!=null && this.getDesStatoNascita().equals(castOther.getDesStatoNascita()) )
 && (this.getFkidLocalitaNascita()==castOther.getFkidLocalitaNascita()) || ( this.getFkidLocalitaNascita()!=null && castOther.getFkidLocalitaNascita()!=null && this.getFkidLocalitaNascita().equals(castOther.getFkidLocalitaNascita()) )
 && (this.getDesLocalitaNascita()==castOther.getDesLocalitaNascita()) || ( this.getDesLocalitaNascita()!=null && castOther.getDesLocalitaNascita()!=null && this.getDesLocalitaNascita().equals(castOther.getDesLocalitaNascita()) )
 && (this.getFlgStato()==castOther.getFlgStato()) || ( this.getFlgStato()!=null && castOther.getFlgStato()!=null && this.getFlgStato().equals(castOther.getFlgStato()) )
 && (this.getFkidRappresentante()==castOther.getFkidRappresentante()) || ( this.getFkidRappresentante()!=null && castOther.getFkidRappresentante()!=null && this.getFkidRappresentante().equals(castOther.getFkidRappresentante()) )
 && (this.getIdEnte()==castOther.getIdEnte()) || ( this.getIdEnte()!=null && castOther.getIdEnte()!=null && this.getIdEnte().equals(castOther.getIdEnte()) )
 && (this.getDtIni()==castOther.getDtIni()) || ( this.getDtIni()!=null && castOther.getDtIni()!=null && this.getDtIni().equals(castOther.getDtIni()) )
 && (this.getDtFin()==castOther.getDtFin()) || ( this.getDtFin()!=null && castOther.getDtFin()!=null && this.getDtFin().equals(castOther.getDtFin()) )
 && (this.getDtMod()==castOther.getDtMod()) || ( this.getDtMod()!=null && castOther.getDtMod()!=null && this.getDtMod().equals(castOther.getDtMod()) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPkid() == null ? 0 : this.getPkid().hashCode() );
         result = 37 * result + ( getProvenienza() == null ? 0 : this.getProvenienza().hashCode() );
         result = 37 * result + ( getCodSoggetto() == null ? 0 : this.getCodSoggetto().hashCode() );
         result = 37 * result + ( getCodiceFiscale() == null ? 0 : this.getCodiceFiscale().hashCode() );
         result = 37 * result + ( getFlgCfCalcolato() == null ? 0 : this.getFlgCfCalcolato().hashCode() );
         result = 37 * result + ( getNatura() == null ? 0 : this.getNatura().hashCode() );
         result = 37 * result + ( getTipoNatura() == null ? 0 : this.getTipoNatura().hashCode() );
         result = 37 * result + ( getPartitaIva() == null ? 0 : this.getPartitaIva().hashCode() );
         result = 37 * result + ( getCognome() == null ? 0 : this.getCognome().hashCode() );
         result = 37 * result + ( getNome() == null ? 0 : this.getNome().hashCode() );
         result = 37 * result + ( getAltriNomi() == null ? 0 : this.getAltriNomi().hashCode() );
         result = 37 * result + ( getDenominazione() == null ? 0 : this.getDenominazione().hashCode() );
         result = 37 * result + ( getDtNascita() == null ? 0 : this.getDtNascita().hashCode() );
         result = 37 * result + ( getPrecisioneDtNascita() == null ? 0 : this.getPrecisioneDtNascita().hashCode() );
         result = 37 * result + ( getSesso() == null ? 0 : this.getSesso().hashCode() );
         result = 37 * result + ( getNote() == null ? 0 : this.getNote().hashCode() );
         result = 37 * result + ( getFkidComuneNascita() == null ? 0 : this.getFkidComuneNascita().hashCode() );
         result = 37 * result + ( getDesComuneNascita() == null ? 0 : this.getDesComuneNascita().hashCode() );
         result = 37 * result + ( getDesProvinciaNascita() == null ? 0 : this.getDesProvinciaNascita().hashCode() );
         result = 37 * result + ( getFkidStatoNascita() == null ? 0 : this.getFkidStatoNascita().hashCode() );
         result = 37 * result + ( getDesStatoNascita() == null ? 0 : this.getDesStatoNascita().hashCode() );
         result = 37 * result + ( getFkidLocalitaNascita() == null ? 0 : this.getFkidLocalitaNascita().hashCode() );
         result = 37 * result + ( getDesLocalitaNascita() == null ? 0 : this.getDesLocalitaNascita().hashCode() );
         result = 37 * result + ( getFlgStato() == null ? 0 : this.getFlgStato().hashCode() );
         result = 37 * result + ( getFkidRappresentante() == null ? 0 : this.getFkidRappresentante().hashCode() );
         result = 37 * result + ( getIdEnte() == null ? 0 : this.getIdEnte().hashCode() );
         result = 37 * result + ( getDtIni() == null ? 0 : this.getDtIni().hashCode() );
         result = 37 * result + ( getDtFin() == null ? 0 : this.getDtFin().hashCode() );
         result = 37 * result + ( getDtMod() == null ? 0 : this.getDtMod().hashCode() );
         return result;
   }   


}