package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public boolean isSmallerThan(Rectangle other) {
        return this.getArea() < other.getArea();
    }

    public boolean isSquare() {
        return length == width;
    }

    public void draw() {
        StdDraw.rectangle(length / 2, width / 2, length / 2, width / 2);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 4.0);
        Rectangle rectangle2 = new Rectangle(3.0, 3.0);

        System.out.println("Rectangle 1 area: " + rectangle1.getArea());
        System.out.println("Rectangle 2 area: " + rectangle2.getArea());

        if (rectangle1.isSmallerThan(rectangle2)) {
            System.out.println("Rectangle 1 is smaller than Rectangle 2.");
        } else {
            System.out.println("Rectangle 1 is not smaller than Rectangle 2.");
        }

        if (rectangle1.isSquare()) {
            System.out.println("Rectangle 1 is a square.");
        } else {
            System.out.println("Rectangle 1 is not a square.");
        }

        StdDraw.clear();
        
        StdDraw.setCanvasSize(400, 400); // Set the canvas size
        StdDraw.setXscale(0, 10); // Set the x-axis scale
        StdDraw.setYscale(0, 10); // Set the y-axis scale

        // Draw rectangle1
        StdDraw.setPenColor(StdDraw.BOOK_RED); // Set the pen color
        rectangle1.draw();

        // Draw rectangle2
        StdDraw.setPenColor(StdDraw.BOOK_BLUE); // Set a different pen color
        rectangle2.draw();
    }
}
