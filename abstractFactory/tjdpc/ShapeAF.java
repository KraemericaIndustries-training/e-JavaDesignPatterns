package tjdpc;

interface ShapeAF {
    void draw();
}

class RectangleAF implements ShapeAF {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
class SquareAF implements ShapeAF {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
class CircleAF implements ShapeAF {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
