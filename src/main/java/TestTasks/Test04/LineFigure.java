package TestTasks.Test04;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Student on 4/8/2015.
 */
public class LineFigure extends GeometricalFigures.OpenFigures implements Stringable{
    Graphics2D g;
    private float coordXStart, coordXEnd, coordYStart, coordYEnd;
    Shape shape = new Line2D.Float(coordXStart, coordYStart, coordXEnd, coordYEnd);

    public LineFigure(float coordXStart, float coordYStart, float coordXEnd, float coordYEnd){
        this.coordXStart = coordXStart;
        this.coordYStart = coordYStart;
        this.coordXEnd = coordXEnd;
        this.coordYEnd = coordYEnd;
    }

    @Override
    public float getLength() {
        return (float)Math.sqrt((coordXEnd-coordXStart)*(coordXEnd-coordXStart) + (coordYStart-coordYEnd)*(coordYStart-coordYEnd));
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
        System.out.println("Start coordinates: " + coordXStart + "  " + coordYStart);
        System.out.println("End coordinates: " + coordXEnd + "  " + coordYEnd);
    }

    public float getCoordXStart() {
        return coordXStart;
    }
    public void setCoordXStart(float coordXStart) {
        this.coordXStart = coordXStart;
    }
    public float getCoordXEnd() {
        return coordXEnd;
    }
    public void setCoordXEnd(float coordXEnd) {
        this.coordXEnd = coordXEnd;
    }
    public float getCoordYStart() {
        return coordYStart;
    }
    public void setCoordYStart(float coordYStart) {
        this.coordYStart = coordYStart;
    }
    public float getCoordYEnd() {
        return coordYEnd;
    }
    public void setCoordYEnd(float coordYEnd) {
        this.coordYEnd = coordYEnd;
    }
}
