public class Line {

    private Point l1;
    private Point l2;
    public Line(Point p1, Point p2){
        l1 = p1;
        l2 = p2;
    }

    public Line(int x1, int y1, int x2, int y2){
        l1 = new Point(x1, y1);
        l2 = new Point(x2, y2);
    }


    public Point getP1(){
        return(l1);
    }
    public Point getP2(){
        return(l2);
    }

    public String toString(){
        return "p1(" + l1.getX() + "," + l1.getY() + ") p2(" + l2.getX() + "," + l2.getY();
    }
    public double getSlope(){
        
    }
}
