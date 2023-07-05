package com.company.GraphicPackage;

public class Circle extends GraphicObject{

    private int radius;

    public Circle (int radius, int xPos, int yPos) {
        super(xPos, yPos);
        this.radius = radius;
    }

    @Override
    public int findArea() {
        return (int) (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public int findPerimeter() {
        return (int) (2 * Math.PI * this.radius);
    }

    @Override
    public void printCurrentPos() {
        System.out.println("x: " + super.getxPos());
        System.out.println("y: " + super.getyPos());
    }
}
