public class PrincipalAnidados{

    public static void main(String[] args){
        int i = 0;
        while (i < 5){
            for (int j = i; j > 1; j--){
                System.out.println(j + "  ");
            }
            System.out.println("****");
            i++;
        }
        System.out.println("End of program");
    }
}
