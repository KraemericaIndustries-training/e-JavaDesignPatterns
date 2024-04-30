package tjdpc;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract ShapeAF getShape(String shape);
}

class ShapeFactory extends AbstractFactory {
    @Override
    public ShapeAF getShape(String shapeType)
    {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new CircleAF();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RectangleAF();
        }else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new SquareAF();
        }
        return null;
    }

    //  In violation of the Interface Segregation principle (but running with it for simplicities' sake)
    //  Since ShapeFactory EXTENDS AbstractFactory, it must include an implementation of getColor BY DEFINITION
    @Override
    Color getColor(String color) {
        return null;
    }
}

class ColorFactory extends AbstractFactory {

    //  In violation of the Interface Segregation principle (but running with it for simplicities' sake)
    //  Since ColorFactory EXTENDS AbstractFactory, it must include an implementation of getShape BY DEFINITION
    @Override
    public ShapeAF getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String color) {

        if(color == null) {
            return null;
        }
        if(color.equalsIgnoreCase("RED")) {
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }else if(color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}