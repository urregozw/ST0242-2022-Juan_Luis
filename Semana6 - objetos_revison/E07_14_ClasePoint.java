public class Point{
    
    private double x;
    private double y;


    public Point(){
        //this(0,0);
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p2){
        this.x = p2.getX();
        this.y = p2.getY();
    }


    public Point midPoint(Point p2){
        Point midP = new Point();
        midP.setX((this.x + p2.getX())/2);
        midP.setY((this.y + p2.getY())/2);

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

    
    public double distance(Point p2){
        double dist = Math.sqrt(Math.pow(this.x - p2.getX(), 2) + Math.pow(this.y - p2.getY(), 2));
        return dist;
    }

    public double distance(double x, double y){
        double dist = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return dist;
    }
}

