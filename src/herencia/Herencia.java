/*========================================================
=======Herencia, las clases empleado y consultor==========
=======heredan datos de persona que es su clase Madre=====
==========================================================*/
//ANOTAR EXTENDS EN LIBRO

package herencia;


public class Herencia {


    public static void main(String[] args) {
        
        Empleado emple = new Empleado();
        
        emple.getNum_legajo();
        emple.getNombre();
        
        
        Consultor consul = new Consultor();
        consul.getNum_consultor();
        consul.getNombre();//Este no esta en consultor, pero hereda de persona
        //Ya que usamos el Extends en la clase consultor
        //y significa que hereda los datos de persona!
        
        
        
        
    }
    
}
