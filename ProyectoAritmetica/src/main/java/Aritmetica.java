public class Aritmetica {
    
    //atributos de la clase 
    int a;
    int b;
    
    public Aritmetica(){
       // a = 3;
       // b = 5;
        System.out.println("Ejacutando cosntructor vacio");
        
    }  
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con dos argumentos");
    }

    public int sumar(){
        return a + b; 
    }
    public int restar(){
        return a - b;
    }
    public int multiplicar(){
        return a * b;
    }
    public int dividir(){
        return a / b;
    }
}
