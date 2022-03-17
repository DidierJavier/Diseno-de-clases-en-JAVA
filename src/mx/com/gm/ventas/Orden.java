package mx.com.gm.ventas;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 10;
    private int contadorProductos;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public int getIdOrden() {
        return idOrden;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public static int getContadorOrdenes() {
        return contadorOrdenes;
    }

    public static void setContadorOrdenes(int contadorOrdenes) {
        Orden.contadorOrdenes = contadorOrdenes;
    }

    public void agregarProducto(Producto producto) {        
        if (this.contadorProductos >= Orden.MAX_PRODUCTOS) {
            System.out.println("No se pueden agregar mas productos a la orden");
            System.out.println("La cantidad máxima de productos es: " + Orden.MAX_PRODUCTOS);
        } else {
            this.productos [this.contadorProductos ++] = producto;            
        }
    }
    
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("[Orden numero: " + this.idOrden + " **** \n     Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
        System.out.println("\ttotal de la orden: " + calcularTotal() + "\n");
    }   

}


