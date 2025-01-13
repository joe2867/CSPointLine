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






    public static void main(String[] args){
    }
}