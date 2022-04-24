package it.saga.siscotel.db;

import java.util.*;




/**
 * J2eeUserRolesId generated by hbm2java
 */
public class J2eeUserRolesId  implements java.io.Serializable {

    // Fields    

     private String userName;
     private String roleName;


    // Constructors

    /** default constructor */
    public J2eeUserRolesId() {
    }
    
   
    
    

    // Property accessors

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
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof J2eeUserRolesId) ) return false;
		 J2eeUserRolesId castOther = ( J2eeUserRolesId ) other; 
         
		 return (this.getUserName()==castOther.getUserName()) || ( this.getUserName()!=null && castOther.getUserName()!=null && this.getUserName().equals(castOther.getUserName()) )
 && (this.getRoleName()==castOther.getRoleName()) || ( this.getRoleName()!=null && castOther.getRoleName()!=null && this.getRoleName().equals(castOther.getRoleName()) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUserName().hashCode();
         result = 37 * result + this.getRoleName().hashCode();
         return result;
   }   


}