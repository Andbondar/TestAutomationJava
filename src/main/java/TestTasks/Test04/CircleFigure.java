package TestTasks.Test04;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by Student on 4/8/2015.
 */
public class CircleFigure extends GeometricalFigures.Enclosed implements Stringable{
    Graphics2D g;
    private float radius = 0;
    private float centerX = 0, centerY = 0;
    private Shape shape = new Ellipse2D.Float(centerX, centerY, radius, radius);

    public CircleFigure(float centerX, float centerY, float radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return ((float)Math.PI*radius*radius);
    }

    @Override
    public float getPerimeter() {
        return (2*(float)Math.PI*radius);
    }

    @Override
    public void draw() {
        g.draw(shape);
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }

    @Override
    public void printToString() {
        System.out.println("CenterX: " + centerX);
        System.out.println("CenterY: " + centerY);
        System.out.println("Radius: " + radius);
    }

    public float getCenterX() {
        return centerX;
    }
    public void setCenterX(float centerX) {
        this.centerX = centerX;
    }
    public float getCenterY() {
        return centerY;
    }
    public void setCenterY(float centerY) {
        this.centerY = centerY;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getRadius() {
        return radius;
    }
}
