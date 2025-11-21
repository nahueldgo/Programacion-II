
package Caso_Practico_01;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args){
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        Producto vaso = new Producto("123", "Vaso", 9.99, 100, CategoriaProducto.HOGAR);
        productos.add(vaso);
        
        Producto taza = new Producto("234", "Taza", 12.99, 50, CategoriaProducto.HOGAR);
        productos.add(taza);
        
        Producto celular = new Producto("992", "Celular", 199.99, 250, CategoriaProducto.ELECTRONICA);
        productos.add(celular);
        
        Producto fideos = new Producto("2488", "Fideos", 3.49, 60, CategoriaProducto.ALIMENTOS);
        productos.add(fideos);
        
        Producto remera = new Producto("579", "Remeras", 18.89, 25, CategoriaProducto.ROPA);
        productos.add(remera);
        
        Inventario inventario = new Inventario();
        
        //Se agregan los 5 productos
        inventario.agregarProducto(vaso);
        inventario.agregarProducto(taza);
        inventario.agregarProducto(celular);
        inventario.agregarProducto(fideos);
        inventario.agregarProducto(remera);
        
        //Se listan los productos junto con su informacion
        inventario.listarProductos();
        
        //Se busca un producto por id
        Producto buscado = inventario.buscarProductoPorId("579");
        if (buscado != null){
            System.out.println("Producto encontrado!");
            buscado.mostrarInfo();
        }
        
        //Se elimina un producto (id=234)
        Producto eliminado = inventario.eliminarProducto("234");
        if (eliminado != null){
            System.out.println("Se ha eliminado un producto del inventario");
            eliminado.mostrarInfo();
        } else {
            System.out.println("Nose encontro ningun producto con ese id.");
        }
        
        System.out.println("INVENTARIO ACTUALIZADO");
        System.out.println("------------------------------------------");
        
        inventario.listarProductos();
        
        System.out.println("------------------------------------------");
       
        inventario.actualizarStock("123", 75);
        inventario.listarProductos();

    }

}
