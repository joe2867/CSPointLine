public class Point{
    int myX;
    int myY;
    
    public Point(int x, int y){
        myX = x;
        myY = y;
    }
    
    public int getX(){
        return myX;
    }
    

    public int getY(){
        return myY;
    }



    public int ManhattenDistance(Point other){
        int t = 0;
        int x1 = getX();
        int y1 = getY();
        int x2 = other.getX();
        int y2 = other.getY();
        int x;
        int y;
        x = Math.abs(x2 - x1);
        y = Math.abs(y2 - y1);
        t += x + y;

        return t;
    }



    public boolean isCollinear(Point p1, Point p2){
        boolean b = false;
        
        double s1 = (p1.getY() - myY) / (p1.getX() - myX);

        double s2 = (p2.getY() - myY) / (p2.getX() - myX);
        if(s1 == s2){
            b = true;
        }


        return b;

    }






    public static void main(String[] args){
        Point x1 = new Point(3,4);
        Point x2 = new Point(-5,7);
        System.out.print(x1.ManhattenDistance(x2));
    }
}