import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        boolean salir = false;
        while (!salir) {
            System.out.println("\n=== Menu de Inventario ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4.Listar productos");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (opcion) {
                case 1:
                    System.out.println("ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();// Conusme the newline
                    System.out.println("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.println("Cantidad del producto: ");
                    int cantidad = scanner.nextInt();

                    Producto producto = new Producto(id, nombre, precio, cantidad);
                    inventario.agregarProducto(producto);
                    break;
                case 2:
                    System.out.println("ID del producto a actualizar: ");
                    id = scanner.nextInt();
                    scanner.nextInt();
                    System.out.println("Nuevo nombre: ");
                    nombre = scanner.nextLine();
                    System.out.println("Nuevo precio: ");
                    precio = scanner.nextDouble();
                    System.out.println("Nuevo cantidad: ");
                    cantidad = scanner.nextInt();

                    inventario.actualizarProducto(id, nombre, precio, cantidad);
                    break;

                case 3:
                    System.out.print("Id del producto a eliminar: ");
                    id = scanner.nextInt();
                    inventario.eliminarProducto(id);
                    break;


                case 4:
                    inventario.listarProductos();
                    break;

                case 5:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }
        scanner.close();
    }
}