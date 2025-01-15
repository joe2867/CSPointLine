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
        return ( "p1(" + l1.getX() + "," + l1.getY() + ") p2(" + l2.getX() + "," + l2.getY() + ")");
     
    }
    public double getSlope(){
        double x = (l2.getX() - l1.getX());
        if(x == 0){
            throw new IllegalArgumentException("undefind");
        }
        double y = (l2.getY() - l1.getY());
        return y / x;
    }

    public boolean isCollinear(Point p){
        boolean b = false;


        if(l2.getX() - l1.getX() == 0){
            throw new IllegalArgumentException("undefined slope");
        }
        if(p.getX() - l2.getX() == 0){
            throw new IllegalArgumentException("undefined slope");
        }

        double s1 = (l2.getY() - l1.getY()) / (l2.getX() - l1.getX());

        double s2 = (p.getY() - l2.getY()) / (p.getX() - l2.getX());
        if(s1 == s2){
            b = true;
        }



        return b;
    }


}
