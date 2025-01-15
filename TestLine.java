public class TestLine {
    public static void main(String[] args){
        Line l1 = new Line(0, 0, 3, 4);
        Line l2 = new Line(4, 9, 6, 8);
        Point p3 = new Point(-5, 7);
        Point p4 = new Point(3, -10);
        System.out.println("Line 1: " + l1.toString());
        
        System.out.println(l1.getSlope());
        System.out.println(l2.getSlope());
        System.out.println(l1.isCollinear(p3));
        System.out.println(l1.isCollinear(p4));
    }
}
