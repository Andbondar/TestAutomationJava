package TestTasks.Test04;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by Student on 4/8/2015.
 */
public class RectangleFigure extends GeometricalFigures.Enclosed implements Stringable{
    Graphics2D g;
    private float height = 0, width = 0;
    private float coordX = 0, coordY = 0;
    private Shape shape = new Rectangle2D.Float(coordX, coordY, width, height);

    public RectangleFigure(float coordX, float coordY, float width, float height){
        this.coordX = coordX;
        this.coordY = coordY;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getArea() {
        return width*height;
    }

    @Override
    public float getPerimeter() {
        return (width*2+height*2);
    }

    @Override
    public void draw() {
        g.draw(shape);
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }

    public float getCoordX() {
        return coordX;
    }
    public void setCoordX(float coordX) {
        this.coordX = coordX;
    }
    public float getCoordY() {
        return coordY;
    }
    public void setCoordY(float coordY) {
        this.coordY = coordY;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public void printToString() {
        System.out.println("CoordX: " + this.coordX);
        System.out.println("CoordY: " + this.coordY);
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
    }
}
