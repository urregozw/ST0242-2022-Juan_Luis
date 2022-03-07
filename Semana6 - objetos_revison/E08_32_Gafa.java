public class Gafa{
    
    private String nombre;
    private double precio;
    public final static int IVA = 19;
    public final static int ENVIO = 2000;

    public Gafa(String n, double p){
        this.nombre = n;
        this.precio = p;
    }

    public static void imprimirDatosGenerales(){
        System.out.println("Todos los productos vendidos tiene un iva de : ");
        System.out.println(Gafa.IVA);
        System.out.println("Todos los productos vendidos tiene costo de envio de : ");
        System.out.println(Gafa.ENVIO);
    }
}

