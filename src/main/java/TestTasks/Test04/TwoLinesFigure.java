package TestTasks.Test04;

import java.awt.*;

/**
 * Created by Student on 4/8/2015.
 */
//this class describes figure consisting oftwo lines that intersect in the MID point
public class TwoLinesFigure extends GeometricalFigures.OpenFigures implements Stringable{
    Graphics2D g;
    private float coordXStart, coordXMid, coordXEnd, coordYStart, coordYMid ,coordYEnd;
    private LineFigure line1;
    private LineFigure line2;

    public TwoLinesFigure(float coordXStart, float coordYStart, float coordXMid, float coordYMid, float coordXEnd, float coordYEnd){
        this.coordXStart = coordXStart;
        this.coordYStart = coordYStart;
        this.coordXMid = coordXMid;
        this.coordYMid = coordYMid;
        this.coordXEnd = coordXEnd;
        this.coordYEnd = coordYEnd;

        line1 = new LineFigure(coordXStart, coordYStart, coordXMid, coordYMid);
        line2 = new LineFigure(coordXMid, coordYMid, coordXEnd, coordYEnd);
    }
    public TwoLinesFigure(LineFigure line1, LineFigure line2){
        this.coordXStart = line1.getCoordXStart();
        this.coordYStart = line1.getCoordYStart();
        this.coordXMid = line1.getCoordXEnd();
        this.coordYMid = line1.getCoordYEnd();
        this.coordXEnd = line2.getCoordXEnd();
        this.coordYEnd = line2.getCoordYEnd();
        
        this.line1 = line1;
        this.line2 = line2;
    }

    @Override
    public void draw() {
        line1.draw();
        line2.draw();
    }

    @Override
    //some improvements can be made here. But for now null shape is returned (non classic shape)
    public Shape getShape() {
        return null;
    }

    @Override
    public void printToString() {
        System.out.println("Start coordinates: " + line1.getCoordXStart() + "  " + line1.getCoordYStart());
        System.out.println("Mid coordinates: " + line1.getCoordXEnd() + "  " + line1.getCoordYEnd());
        System.out.println("End coordinates: " + line2.getCoordXEnd() + "  " + line2.getCoordYEnd());
    }

    @Override
    public float getLength() {
        return (line1.getLength() + line2.getLength());
    }

    public float getCoordXStart() {
        return coordXStart;
    }
    public void setCoordXStart(float coordXStart) {
        this.coordXStart = coordXStart;
    }
    public float getCoordXMid() {
        return coordXMid;
    }
    public void setCoordXMid(float coordXMid) {
        this.coordXMid = coordXMid;
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
    public float getCoordYMid() {
        return coordYMid;
    }
    public void setCoordYMid(float coordYMid) {
        this.coordYMid = coordYMid;
    }
    public float getCoordYEnd() {
        return coordYEnd;
    }
    public void setCoordYEnd(float coordYEnd) {
        this.coordYEnd = coordYEnd;
    }
}
