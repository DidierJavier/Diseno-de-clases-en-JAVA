# Diseno-de-clases-en-JAVA
Este es un proyecto práctico de diseño de clases en JAVA.
El proyecto consiste en generar una factura de venta, en la que al generar una orden, se imprime en pantalla el número de la orden, 
los productos que se agregaron a la orden, especificando el id del producto, el producto y el precio y el cálculo del total.
Para lo anterior se creó una clase denominada <Producto>, para crear objetos de tipo producto, donde cada producto tenga un identificador, el nombre y el precio.
Se creó otra clase denominada <Orden> para establecer una relación de agregación entre los objetos producto y los objetos orden; lo que quiere decir que para que 
existan objetos tipo <Orden>, se requiere que se le agreguen objetos tipo <Producto> a dicha orden. Cada objeto tipo <producto> agregado a la orden se almacena en
un arreglo y de dicho arreglo se extrae la infomación para imprimir en pantalla la orden con cada uno de sus productos y realizar el cálculo total.
