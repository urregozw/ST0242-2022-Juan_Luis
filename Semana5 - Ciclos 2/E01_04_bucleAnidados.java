public class PrincipalAnidados{

    public static void main(String[] args){
        int i, j;
        i = 1;
        while(i <= 3){
            j = 1;
            while(j <= 2){
                System.out.println("i = " + i + " j = " + j);
                j = j + 1;
            }
            i = i + 1;
        }
        System.out.println("End of program");
    }
}
