package it.saga.siscotel.db;

import java.util.*;




/**
 * J2eeUserServId generated by hbm2java
 */
public class J2eeUserServId  implements java.io.Serializable {

    // Fields    

     private java.math.BigDecimal fkidServizio;
     private String userName;
     private String codAccesso;


    // Constructors

    /** default constructor */
    public J2eeUserServId() {
    }
    
   
    
    

    // Property accessors

    /**
     * 
     */
    public java.math.BigDecimal getFkidServizio() {
        return this.fkidServizio;
    }
    
    public void setFkidServizio(java.math.BigDecimal fkidServizio) {
        this.fkidServizio = fkidServizio;
    }

    /**
     * 
     */
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     */
    public String getCodAccesso() {
        return this.codAccesso;
    }
    
    public void setCodAccesso(String codAccesso) {
        this.codAccesso = codAccesso;
    }

   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof J2eeUserServId) ) return false;
		 J2eeUserServId castOther = ( J2eeUserServId ) other; 
         
		 return (this.getFkidServizio()==castOther.getFkidServizio()) || ( this.getFkidServizio()!=null && castOther.getFkidServizio()!=null && this.getFkidServizio().equals(castOther.getFkidServizio()) )
 && (this.getUserName()==castOther.getUserName()) || ( this.getUserName()!=null && castOther.getUserName()!=null && this.getUserName().equals(castOther.getUserName()) )
 && (this.getCodAccesso()==castOther.getCodAccesso()) || ( this.getCodAccesso()!=null && castOther.getCodAccesso()!=null && this.getCodAccesso().equals(castOther.getCodAccesso()) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFkidServizio().hashCode();
         result = 37 * result + this.getUserName().hashCode();
         result = 37 * result + this.getCodAccesso().hashCode();
         return result;
   }   


}