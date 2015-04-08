package TestTasks.Test04;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by Student on 4/8/2015.
 */
public class SquareFigure extends GeometricalFigures.Enclosed implements Stringable{
    Graphics2D g;
    private float side = 0;
    private float coordX = 0, coordY = 0;
    private Shape shape = new Rectangle2D.Float(coordX, coordY, side, side);

    //constructor
    public SquareFigure(float coordX, float coordY, float side) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.side = side;
        }

    public void setCoord(float coordX, float coordY){
        this.coordX = coordX;
        this.coordY = coordY;
    }
    public void reDefineSquare(float coordX, float coordY, float side){
        this.coordX = coordX;
        this.coordY = coordY;
        this.side = side;
    }

    @Override
    public float getArea() {
        return side*side;
    }

    @Override
    public float getPerimeter() {
        return side*4;
    }

    @Override
    public void draw() {
        g.draw(shape);
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }

    public void setSide(float side){
        this.side = side;
    }
    public float getSide() {
        return side;
    }
    public void setCoordX(float coordX){
        this.coordX = coordX;
    }
    public void setCoordY(float coordY) {
        this.coordY = coordY;
    }
    public float getCoordX() {
        return coordX;
    }
    public float getCoordY() {
        return coordY;
    }

    @Override
    public void printToString() {
        System.out.println("CoordX: " + this.coordX);
        System.out.println("CoordY: " + this.coordY);
        System.out.println("Side: " + this.side);
    }
}
