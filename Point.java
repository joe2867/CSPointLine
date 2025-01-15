public class Point{
    private int myX;
    private int myY;
    
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


    public boolean isCollinear(Point o1, Point o2){
        boolean r = false;
        double slope1;
        double slope2;
        int x1 = getX();
        int y1 = getY();
        int x2 = o1.getX();
        int y2 = o1.getY();
        int x3 = o2.getX();
        int y3 = o2.getY();

        if(x2 - x1 == 0){
            throw new IllegalArgumentException("undefined slope");
        }
        if(x3 - x1 == 0){
            throw new IllegalArgumentException("undefined slope");
        }
        slope1 = (y2 - y1) / (x2 - x1);
        slope2 = (y3 - y1) / (x3 - x1);
        if(slope1 == slope2){
            r = true;
        }


        return r;
    }


}

