public class Test{
    
    public static void main(String args[]){
        Circle myCircle = new Circle(5.0);
        Test.printCircle(myCircle);
        System.out.println(myCircle.getRadius());
    }

    public static void printCircle(Circle c){
        System.out.println("Radius " + c.getRadius());
        c.setRadius(6.0);
    }
}

