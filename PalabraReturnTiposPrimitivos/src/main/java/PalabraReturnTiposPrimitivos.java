public class PalabraReturnTiposPrimitivos {
 
    public static void main(String[] args) {
   
        sumarSinRetornarValor(3, 6);
        
        int resultado = sumarRetornandoValor(2,2);
        System.out.println("Resultado retornando valor  = " + resultado );
}

    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("El resultado de sumar sin retornar valor " + (a + b));
        return; //opcional 
    }
    
    private static int sumarRetornandoValor(int a, int b){
        if (a==0 && b==0){
            System.out.println("Debe proporcionar datos diferentes de cero");
            return 0;
            
        }
        System.out.println("Los valores proporcionados son distintos  de cero");
        return a + b;
    }
}
