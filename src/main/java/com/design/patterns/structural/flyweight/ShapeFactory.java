package com.design.patterns.structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<ShapeType, Shape> shapes = new EnumMap<>(ShapeType.class);
    
    public static Shape getShape(ShapeType type) {
        Shape shape = shapes.get(type);
        
        if (shape == null) {
            switch (type) {
                case LINE:
                    shape = new Line();
                    break;
                case OVAL_FILL:
                    shape = new Oval(true);
                    break;
                case OVAL_NOFILL:
                    shape = new Oval(false);
                    break;
            }
            shapes.put(type, shape);
        }
        
        return shape;
    }
    
    public static int getNumberOfShapes() {
        return shapes.size();
    }
}
