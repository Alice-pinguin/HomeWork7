import company.*;

public class Main {
    
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", "grey");
        Quad quad = new Quad("Quad", "green");
        Rhombus rhombus = new Rhombus("Rhombus", "blue");
        Parallelogram parallelogram = new Parallelogram("Parallelogram", "yellow");
        Rectangle rectangle = new Rectangle("Rectangle", "black");
        NamePrinter namePrinter = new NamePrinter();
        namePrinter.printColor(circle);
        namePrinter.printName(circle);
        namePrinter.printColor(quad);
        namePrinter.printName(quad);
        namePrinter.printColor(rhombus);
        namePrinter.printName(rhombus);
        namePrinter.printColor(parallelogram);
        namePrinter.printName(parallelogram);
        namePrinter.printColor(rectangle);
        namePrinter.printName(rectangle);
    }
}


