public class PruebaCaja {
    public static void main(String[] args) {
        System.out.println("Calculo del volumen de la caja");
        
        int a = 3;
        int aa = 2;
        int p = 6;
        
        //Objeto de la clase Caja 
        Caja cajita = new Caja(a, aa, p);
        
        // imprimir valores de volumen
        System.out.println("a = " + a);
        System.out.println("aa = " + aa);
        System.out.println("p = " + p);
        
        //Resultado del volumen
        System.out.println("EL volumen de esta caja es: "+ cajita.calcularVolumen());
        
    }
}
