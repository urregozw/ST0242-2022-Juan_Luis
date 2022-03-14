public class PrincipalString{
    
    public static void main(String args[]){
        Circle c1 = new Circle(5.0);
        Circle c2 = c1;
        System.out.println(c1.getRadius());
        c2.getRadius(6.0);
        System.out.println(c1.getRadius());
    }

}

