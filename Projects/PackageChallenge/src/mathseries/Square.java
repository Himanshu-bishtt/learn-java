package mathseries;

import java.awt.*;

public class Square implements Relatable {
    private int length;
    private int width;
    private Point point;

    public Square() {
        this.point = new Point(0,0);
        this.length = 0;
        this.width = 0;
    }

    public Square (Point point) {
        this.point = point;
    }

    public Square(int length, int width, Point point) {
        this.length = length;
        this.width = width;
        this.point = point;
    }

    public int getArea() {
        return this.length * this.width;
    }

    @Override
    public int isLargerThan(Relatable other) {
        return Integer.compare(this.getArea(), ((Square)other).getArea());
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                ", point=" + point +
                '}';
    }
}
