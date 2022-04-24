package it.saga.siscotel.db;

import java.util.*;




/**
 * SchemataId generated by hbm2java
 */
public class SchemataId  implements java.io.Serializable {

    // Fields    

     private Object catalogName;
     private Object schemaName;
     private Object schemaOwner;
     private Object defaultCharacterSetCatalog;
     private Object defaultCharacterSetSchema;
     private Object defaultCharacterSetName;
     private Object sqlPath;


    // Constructors

    /** default constructor */
    public SchemataId() {
    }
    
   
    
    

    // Property accessors

    /**
     * 
     */
    public Object getCatalogName() {
        return this.catalogName;
    }
    
    public void setCatalogName(Object catalogName) {
        this.catalogName = catalogName;
    }

    /**
     * 
     */
    public Object getSchemaName() {
        return this.schemaName;
    }
    
    public void setSchemaName(Object schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * 
     */
    public Object getSchemaOwner() {
        return this.schemaOwner;
    }
    
    public void setSchemaOwner(Object schemaOwner) {
        this.schemaOwner = schemaOwner;
    }

    /**
     * 
     */
    public Object getDefaultCharacterSetCatalog() {
        return this.defaultCharacterSetCatalog;
    }
    
    public void setDefaultCharacterSetCatalog(Object defaultCharacterSetCatalog) {
        this.defaultCharacterSetCatalog = defaultCharacterSetCatalog;
    }

    /**
     * 
     */
    public Object getDefaultCharacterSetSchema() {
        return this.defaultCharacterSetSchema;
    }
    
    public void setDefaultCharacterSetSchema(Object defaultCharacterSetSchema) {
        this.defaultCharacterSetSchema = defaultCharacterSetSchema;
    }

    /**
     * 
     */
    public Object getDefaultCharacterSetName() {
        return this.defaultCharacterSetName;
    }
    
    public void setDefaultCharacterSetName(Object defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName;
    }

    /**
     * 
     */
    public Object getSqlPath() {
        return this.sqlPath;
    }
    
    public void setSqlPath(Object sqlPath) {
        this.sqlPath = sqlPath;
    }

   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SchemataId) ) return false;
		 SchemataId castOther = ( SchemataId ) other; 
         
		 return (this.getCatalogName()==castOther.getCatalogName()) || ( this.getCatalogName()!=null && castOther.getCatalogName()!=null && this.getCatalogName().equals(castOther.getCatalogName()) )
 && (this.getSchemaName()==castOther.getSchemaName()) || ( this.getSchemaName()!=null && castOther.getSchemaName()!=null && this.getSchemaName().equals(castOther.getSchemaName()) )
 && (this.getSchemaOwner()==castOther.getSchemaOwner()) || ( this.getSchemaOwner()!=null && castOther.getSchemaOwner()!=null && this.getSchemaOwner().equals(castOther.getSchemaOwner()) )
 && (this.getDefaultCharacterSetCatalog()==castOther.getDefaultCharacterSetCatalog()) || ( this.getDefaultCharacterSetCatalog()!=null && castOther.getDefaultCharacterSetCatalog()!=null && this.getDefaultCharacterSetCatalog().equals(castOther.getDefaultCharacterSetCatalog()) )
 && (this.getDefaultCharacterSetSchema()==castOther.getDefaultCharacterSetSchema()) || ( this.getDefaultCharacterSetSchema()!=null && castOther.getDefaultCharacterSetSchema()!=null && this.getDefaultCharacterSetSchema().equals(castOther.getDefaultCharacterSetSchema()) )
 && (this.getDefaultCharacterSetName()==castOther.getDefaultCharacterSetName()) || ( this.getDefaultCharacterSetName()!=null && castOther.getDefaultCharacterSetName()!=null && this.getDefaultCharacterSetName().equals(castOther.getDefaultCharacterSetName()) )
 && (this.getSqlPath()==castOther.getSqlPath()) || ( this.getSqlPath()!=null && castOther.getSqlPath()!=null && this.getSqlPath().equals(castOther.getSqlPath()) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCatalogName() == null ? 0 : this.getCatalogName().hashCode() );
         result = 37 * result + ( getSchemaName() == null ? 0 : this.getSchemaName().hashCode() );
         result = 37 * result + ( getSchemaOwner() == null ? 0 : this.getSchemaOwner().hashCode() );
         result = 37 * result + ( getDefaultCharacterSetCatalog() == null ? 0 : this.getDefaultCharacterSetCatalog().hashCode() );
         result = 37 * result + ( getDefaultCharacterSetSchema() == null ? 0 : this.getDefaultCharacterSetSchema().hashCode() );
         result = 37 * result + ( getDefaultCharacterSetName() == null ? 0 : this.getDefaultCharacterSetName().hashCode() );
         result = 37 * result + ( getSqlPath() == null ? 0 : this.getSqlPath().hashCode() );
         return result;
   }   


}