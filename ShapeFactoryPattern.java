interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
class Triangle implements Shape {   
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}
class shapefactory {
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }
}
public class ShapeFactoryPattern {
    public static void main(String[] args) {
        Shape shape1 = shapefactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapefactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapefactory.getShape("TRIANGLE");
        shape3.draw();
    }
}