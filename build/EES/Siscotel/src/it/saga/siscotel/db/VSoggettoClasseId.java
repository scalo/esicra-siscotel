package it.saga.siscotel.db;

import java.util.*;




/**
 * VSoggettoClasseId generated by hbm2java
 */
public class VSoggettoClasseId  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal fkidClasse;
     private String annoScolastico;


    // Constructors

    /** default constructor */
    public VSoggettoClasseId() {
    }
    
   
    
    

    // Property accessors

    /**
     * 
     */
    public java.math.BigDecimal getFkidClasse() {
        return this.fkidClasse;
    }
    
    public void setFkidClasse(java.math.BigDecimal fkidClasse) {
        this.fkidClasse = fkidClasse;
    }

    /**
     * 
     */
    public String getAnnoScolastico() {
        return this.annoScolastico;
    }
    
    public void setAnnoScolastico(String annoScolastico) {
        this.annoScolastico = annoScolastico;
    }

   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VSoggettoClasseId) ) return false;
		 VSoggettoClasseId castOther = ( VSoggettoClasseId ) other; 
         
		 return (this.getFkidClasse()==castOther.getFkidClasse()) || ( this.getFkidClasse()!=null && castOther.getFkidClasse()!=null && this.getFkidClasse().equals(castOther.getFkidClasse()) )
 && (this.getAnnoScolastico()==castOther.getAnnoScolastico()) || ( this.getAnnoScolastico()!=null && castOther.getAnnoScolastico()!=null && this.getAnnoScolastico().equals(castOther.getAnnoScolastico()) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getFkidClasse() == null ? 0 : this.getFkidClasse().hashCode() );
         result = 37 * result + ( getAnnoScolastico() == null ? 0 : this.getAnnoScolastico().hashCode() );
         return result;
   }   


}