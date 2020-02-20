package arreglos;
public class EjemploArreglos {
    public static void main(String[] args) {
        //1. Declaramos una variable de tipo arreglo, arreglo int 
        int edades [];
        
        //2. Instanciar el arreglo 
        edades = new int [3];
        
        //.3 Inicializamos los valores del arreglo
        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;
        
        System.out.println("Arreglo de enteros indice 0: " + edades[1]);
        
        //1. Declarar e instanciar un arreglo de tipo object 
        Persona personas [] = new Persona [4];
        
        //2. Inicializar los valores del arreglo 
        personas[0] = new Persona ("Juan");
        personas[2] = new Persona("Karla");
        
        
        //Areglo utilizando notacion simplificada 
        String nombres[] = {"Sara", "Laura", "Carmem"};
        
        //imprimir los elementos en un arreglo 
        for(int i= 0; i<nombres.length; i++)
        
        {
        System.out.println("Arreglo de enteros indice 0: " + nombres[i]);
    }
    }

    
}
