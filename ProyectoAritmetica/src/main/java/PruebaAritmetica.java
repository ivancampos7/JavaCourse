public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        //variables local
        int operandoA = 6;
        int operandoB = 2;
        
        // Objeto de la clase Aritmetica
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
        //imprimir valores 
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
        
        //Resultado de la suma 
        System.out.println("\n Resultado de la suma: "+ objeto1.sumar());
        System.out.println("\n El resultado de la resta: "+ objeto1.restar());
        System.out.println("\n El resultado de la multiplicacion: "+objeto1.multiplicar());
        System.out.println("\n El resultado de la division: "+ objeto1.dividir());
        
        
       
    }
}
