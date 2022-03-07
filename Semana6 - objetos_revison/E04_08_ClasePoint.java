public class Point{
    
    private double x;
    private double y;

    public Point(){
        this.x = 0;
        this.y = 0;
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

    public double distance(Point p2){
        double dist = Math.sqrt(Math.pow(this.x - p2.getX(), 2) + Math.pow(this.y - p2.getY(), 2));
        return dist;
    }
}

