package modelo.sql;
// Generated Apr 11, 2016 7:57:33 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tipo generated by hbm2java
 */
public class Tipo  implements java.io.Serializable {


     private int idTipo;
     private String STipo;
     private Set<Actividad> actividads = new HashSet<Actividad>(0);

    public Tipo() {
    }

	
    public Tipo(int idTipo, String STipo) {
        this.idTipo = idTipo;
        this.STipo = STipo;
    }
    public Tipo(int idTipo, String STipo, Set<Actividad> actividads) {
       this.idTipo = idTipo;
       this.STipo = STipo;
       this.actividads = actividads;
    }
   
    public int getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
    public String getSTipo() {
        return this.STipo;
    }
    
    public void setSTipo(String STipo) {
        this.STipo = STipo;
    }
    public Set<Actividad> getActividads() {
        return this.actividads;
    }
    
    public void setActividads(Set<Actividad> actividads) {
        this.actividads = actividads;
    }




}


