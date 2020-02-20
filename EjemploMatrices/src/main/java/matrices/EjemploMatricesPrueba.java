package matrices;

public class EjemploMatricesPrueba {
    public static void main(String[] args) {
        
        //1. Declarfar una matriz de tipo entero 
        int edades[][];
        //2. Instanciar la matriz 
        edades = new int [3][2];
        
                
        
        //3. Instanciar los valores de la matriz
        edades[0][0] = 30;
        edades[2][0] = 30;
        edades[0][1] = 30;
        
        //1-2 Declarar e instanciar
        Persona personas[][] = new Persona [3][2];
        
        //3. Inicializar valores 
        personas[0][0] = new Persona("Juan");
        personas[1][0] = new Persona("Karla");
        
        for (int i = 0; i < personas.length; i++){
            for(int j = 0; j < personas[0].length;j++ ){
                System.out.println("Renglon: " + i + " Columna: " + j + " " + personas[i][j]);
                
            }
        }
    }
 
}
