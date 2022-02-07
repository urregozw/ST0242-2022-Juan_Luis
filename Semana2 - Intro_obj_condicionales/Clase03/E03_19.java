import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la creditos aprobados: ");
        int creAprobados = scan.nextInt();

        if (creAprobados >= 120){
            System.out.println("Graduado");
        }else{
            System.out.println("No se gradua");
        }
        System.out.println("Fin programa");
    }
}
