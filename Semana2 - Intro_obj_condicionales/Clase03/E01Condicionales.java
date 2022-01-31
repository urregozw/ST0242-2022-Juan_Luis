import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        int temp = scan.nextInt();

        if (temp > 27){
            System.out.println("Comprar helado (cerveza)");
        }
        System.out.println("Fin programa");
    }
}
