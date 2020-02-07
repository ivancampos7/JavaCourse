public class Caja {
    
    //Atributos de la clase 
    int ancho;
    int alto;
    int profundo;
    
    public Caja(){
        System.out.println("Se está ejecutando el constructor vacio");
    }
    
    public Caja (int ancho, int alto, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
        System.out.println("Se esta ejecutando el constructor con tres argumentos");
                
    }
    
    public int calcularVolumen(){
        return ancho * alto * profundo;
    }
    
}
