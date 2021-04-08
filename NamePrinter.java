package company;

class NamePrinter {


    public static void main(String[] args) {

        Shape circle = new Circle("Circle", "grey");
        Shape quad = new Quad("Quad", "green");
        Shape rhombus = new Rhombus("Rhombus", "blue");
        Shape parallelogram = new Parallelogram("Parallelogram", "yellow");
        Shape rectangle = new Rectangle("Rectangle", "black");
        System.out.println(circle.getName()+
                ","+quad.getName()+","+rhombus.getName()+","+parallelogram.getName()+
                ","+rectangle.getName());

        System.out.println(circle.getColor()+
                ","+quad.getColor()+","+rhombus.getColor()+","+parallelogram.getColor()+
                ","+rectangle.getColor());
    }
}



