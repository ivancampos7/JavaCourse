package ventas;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

public class Ventas {
    public static void main(String[] args) {
        //Crear varios objetos del tipo producto 
        Producto producto1 = new Producto("Camisa",50);
        Producto producto2 = new Producto("Pantalon", 100);
        
        //Creacion de un objeto tipo orden 
        Orden orden1 = new Orden();
        //Agregamos los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        
        //Imprimir orden
        orden1.mostrarOrden();
        
        
        
    }
 
}
