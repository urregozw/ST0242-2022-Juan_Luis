public class Point{
    
    private double x;
    private double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point midPoint(Point p2){
        Point midP = new Point();
        midP.setX((this.x + p2.getX())/2);
        midP.setX((this.y + p2.getY())/2);

        return midP;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return this.x;
    }
    
    public void setY(double y){
        this.y = y;
    }

    public double getY(){
        return this.y;
    }
}

