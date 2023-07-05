package graphics;

import java.awt.*;

public class Sqaure implements Shape{
    private final int x;
    private final int y;

    public Sqaure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point getPoint(int x, int y) {
        return new Point(x,y);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
