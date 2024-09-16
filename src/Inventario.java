import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    //Metodos CRUD
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }
    public Producto buscarProducto(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }
    public void actualizarProducto(int id, String nombre, double precio, int cantidad) {
        Producto producto = buscarProducto(id);
        if (producto != null) {
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCantidad(cantidad);
            System.out.println("Producto actualizado: " + producto);
        } else {
            System.out.println("Producto no encontrado");
        }
    }
    public void eliminarProducto(int id) {
        Producto producto = buscarProducto(id);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto eliminado: " + producto);
        } else {
            System.out.println("Producto no encontrado");
        }
    }
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos");
        } else {
            System.out.println("Listado de productos");
            for (Producto producto: productos) {
                System.out.println(producto);
            }
        }
    }
}
