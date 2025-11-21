
package Caso_Practico_01;

import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public void listarProductos(){
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id){
        for (Producto p : productos) {
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    
    public Producto eliminarProducto(String id){
        Producto productoAEliminar = buscarProductoPorId(id);
        if (productoAEliminar != null){
            productos.remove(productoAEliminar);
            System.out.println("Producto eliminado:");
            productoAEliminar.mostrarInfo();
            return productoAEliminar;
        } else {
            System.out.println("No se encontró un producto con ese ID.");
            return null;
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        if (nuevaCantidad < 0){
            System.out.println("La cantidad no puede ser negativa.");
            return;
        }
        
        Producto p = buscarProductoPorId(id);
        if (p != null){
            int anterior = p.getCantidad();
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado. Antes: " + anterior + " / Ahora: " + nuevaCantidad);
        } else {
            System.out.println("No se encontro un producto con el ID: " + id);
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria){
        for (Producto p : productos){
            if (p.getCategoria() == categoria){
                p.mostrarInfo();
            }
        }
    }
    
    public int obtenerTotalStock(){
        int total = 0;
        for (Producto p : productos){
            total += p.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock(){
        if (productos.isEmpty()){
            return null;
        }
        
        Producto mayor = productos.get(0);
        for (Producto p : productos){
            if (p.getCantidad() > mayor.getCantidad()){
                mayor = p;
            }
        }
        return mayor;
    }
    
    public void filtrarProductosPorPrecio(double min, double max){
        for (Producto p : productos){
            if (p.getPrecio() >= min && p.getPrecio() <= max){
                p.mostrarInfo();
            }
        }
    }
    
    public void mostrarCategoriasDisponibles(){
        for (CategoriaProducto c : CategoriaProducto.values()){
            System.out.println(c + ": " + c.getDescripcion());
        }
    }
}