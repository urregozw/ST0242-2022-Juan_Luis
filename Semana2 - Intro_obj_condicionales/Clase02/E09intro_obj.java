public class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.nombre = "Tesla Model X";
        // vehiculo1.precio = 4000; // Invalido!
        vehiculo1.setPrecio(4000);
        System.out.println("Nombre: " + vehiculo1.nombre);
        System.out.println("Precio: " + vehiculo1.getPrecio());
    }
}
