public class PruebaPersonas {
    public static void main(String[] args) {
        
        //Creacion de un Objeto de tipo persona
        Persona persona1;
        
        //Instanciando un objeto de la clase persona 
        persona1 = new Persona();
        
        //Accedemos al metodo persona y llamamos al metodo desplegarNombres
        persona1.desplegarNombres();
        
        //Modificacion de los valores de atributos 
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        //volvemos a imprimir los valres 
        
        System.out.println("");
        persona1.desplegarNombres();
        
        //Creacion de un segundo objeto 
        Persona persona2 = new Persona();
        persona2.nombre = "Karla";
        persona2.apellido = "Gomez";
        
        System.out.println("");
        persona2.desplegarNombres();
        
        
    }
}
