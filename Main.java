package company;

class Shape  implements ColorShape{
     private String color;
    public  String getName(){
        return "Shape";
    }
     @Override
     public String getColor() {
        this.color = color;
         return color;
     }
 }
    class Quad extends Shape implements ColorShape {
    private String name;
    private String color;
    @Override
    public String getName() {
        return "Quad";
    }
    @Override
    public String getColor() {
        this.color = color;
        return color;
    }
}
 class Circle extends  Shape implements ColorShape {
    private String name;
    private String color;

     @Override
    public String getName() {
        return "Circle";
    }
     @Override
     public String getColor() {
         this.color = color;
         return color;
     }
 }

    class Rectangle extends Shape implements ColorShape {
        private String name;
        private String color;

        @Override
        public String getName() {
            return "Rectangle";
        }
        @Override
        public String getColor() {
            this.color = color;
            return color;
        }
    }
    class Rhombus extends Shape implements ColorShape{
        private String name;
        private String color;
        @Override
        public String getName() {
            return "Rhombus";
        }
        @Override
        public String getColor() {
            this.color = color;
            return color;
        }
    }
class Parallelogram extends Shape implements ColorShape{
    private String name;
    private String color;
    @Override
    public String getName() {
        return "Parallelogram";
    }

    @Override
    public String getColor() {
        this.color = color;
        return color;
    }
}
class NamePrinter {
        public void printName(Shape shape) {
            System.out.println(shape.getName());
        }
        public void printColor(Shape shape) {
        System.out.println(shape.getColor());
    }

}

