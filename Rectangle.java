package company;

class Rectangle extends Shape {
    private String name ;
    private String color;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getColor() {
        return color;
    }

    public Rectangle(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
