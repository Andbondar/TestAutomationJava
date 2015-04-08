package TestTasks.Test04;

import java.awt.*;

/**
 * Created by Student on 4/8/2015.
 */
public abstract class GeometricalFigures {
    public abstract void draw();
    public abstract Shape getShape();

    public static abstract class Enclosed extends GeometricalFigures{
        public abstract float getArea();
        public abstract float getPerimeter();
    }

    public static abstract class OpenFigures extends GeometricalFigures{
        public abstract float getLength();
    }
}
