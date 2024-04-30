package tjdpc;

public class ClientAF {
    public static void main(String [] args)
    {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");  //  get shape factory

        ShapeAF shape1 = shapeFactory.getShape("CIRCLE");                             //  get an object of Shape Circle
        shape1.draw();                                                              //  call draw method of Shape Circle

        ShapeAF shape2 = shapeFactory.getShape("RECTANGLE");  //  get an object of Shape Rectangle
        shape2.draw();                                      //  call draw method of Shape Rectangle

        ShapeAF shape3 = shapeFactory.getShape("SQUARE");  //  get an object of Shape Square
        shape3.draw();                                   //  call draw method of Shape Square

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");


        Color color1 = colorFactory.getColor("RED");  //  get an object of Color Red
        color1.fill();                                //  call fill method of Red

        Color color2 = colorFactory.getColor("Green");  //  get an object of Color Green
        color2.fill();                                  //  call fill method of Green

        Color color3 = colorFactory.getColor("BLUE");  //  get an object of Color Blue
        color3.fill();                                 //  call fill method of Color Blue
    }
}