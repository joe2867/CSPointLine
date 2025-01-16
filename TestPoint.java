public class TestPoint {
    public static void main(String[] args){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(-5, 7);
        Point p4 = new Point(3, -10);
        Point p5 = new Point(3, 10);
        Point p6 = new Point(6, 8);
        System.out.println("P1: " + p1.getX() + "," + p1.getY());
        System.out.println("P2: " + p2.getX() + "," + p2.getY());
        System.out.println("P3: " + p3.getX() + "," + p3.getY());
        System.out.println("P4: " + p4.getX() + "," + p4.getY());
        System.out.println("P5: " + p5.getX() + "," + p5.getY());
        System.out.println("P6: " + p6.getX() + "," + p6.getY());
        System.out.println("p2 to p3: " + p2.ManhattenDistance(p3));
        System.out.println("p3 to p4: " + p3.ManhattenDistance(p4));
        System.out.println("p2, p4, p5: " + p2.isCollinear(p4, p5));
        System.out.println("p2, p3, p4: " + p2.isCollinear(p3, p4));
        System.out.println("p1, p2, p6: " + p1.isCollinear(p2, p6));
        System.out.println("p1, p2, p3: " + p1.isCollinear(p2, p3));
    }
}
