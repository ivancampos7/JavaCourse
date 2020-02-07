public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;    // Se asocia con la clase y no con los objetos
    
    public Persona(String nombre){
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
        
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
    /*  
    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }
    */
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public static int getContadorPersonas(){
        return contadorPersonas;
    }    
    
    @Override
    public String toString(){
        return "idPersona: " + idPersona + ", nombre: " + nombre + ", contador personas: " + contadorPersonas;
    }
}
