package TestTasks;

import TestTasks.Test04.*;

import java.awt.*;

/**
 * Created by Student on 4/8/2015.
 */
public class Task04 {
    Graphics2D g;
    public static void main(String[] args) {
        System.out.println("Square");
        SquareFigure mySquare = new SquareFigure(2,3,4);
        mySquare.printToString();
        System.out.println("Redefined Square. Ony square can be redefined in current implementation");
        mySquare.reDefineSquare(2,8,12);
        mySquare.printToString();

        System.out.println();
        System.out.println("Rectangle");
        RectangleFigure myRectangle = new RectangleFigure(2,4,12,14);
        myRectangle.printToString();
        System.out.println("Area: " + myRectangle.getArea());

        System.out.println();
        System.out.println("Circle");
        CircleFigure myCircle = new CircleFigure(2,4,12);
        myCircle.printToString();
        System.out.println("Perimeter: " + myCircle.getPerimeter());

        System.out.println();
        System.out.println("Line");
        LineFigure myLine = new LineFigure(1, 2, 2, 3);
        myLine.printToString();
        System.out.println("Length: " + myLine.getLength());

        System.out.println();
        System.out.println("Two lines figure (two lines intersecting in one point)");
        TwoLinesFigure myTwoLinesFigure = new TwoLinesFigure(2, 3, 4, 12, 5, 6);
        myTwoLinesFigure.printToString();
        System.out.println("Length: " + myTwoLinesFigure.getLength());

        System.out.println();
        System.out.println("Another way for TwoLineFigure");
        LineFigure additionalLine = new LineFigure(6,7,12,34);
        TwoLinesFigure anotherTwoLinesFigure = new TwoLinesFigure(myLine, additionalLine);
        anotherTwoLinesFigure.printToString();
        System.out.println("Length: " + anotherTwoLinesFigure.getLength());
    }
}
