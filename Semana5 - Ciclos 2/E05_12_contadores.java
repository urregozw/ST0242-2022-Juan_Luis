import java.util.Scanner;
public class PrincipalAnidados{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el num de los salarios");
        int numSalarios = scan.nextInt();
        int conteoMayores = 0;
        for(int i = 0; i < numSalarios; i = i + 1){
            System.out.println("Ingrese el salario " + (i + 1) + ":");
            int salarioActual = scan.nextInt();
            if (salarioActual > 1000){
                conteoMayores = conteoMayores + 1;
            }
        }

        System.out.println("Hay " + conteoMayores + " salarios mayores");
    }
}
