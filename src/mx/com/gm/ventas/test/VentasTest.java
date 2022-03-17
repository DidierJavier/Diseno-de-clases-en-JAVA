package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 5000);
        Producto producto2 = new Producto("Pantalon", 6000.0);
        Producto producto3 = new Producto("Tenis", 9999.99);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto2);  
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto2); 
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();
    }
}
