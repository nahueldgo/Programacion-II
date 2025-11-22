
package Ecommerce;

import java.util.ArrayList;

public class Pedido implements Pagable {

    private ArrayList<Producto> productos;
    private String estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "CREADO";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El pedido paso a estado: " + nuevoEstado);
    }
}