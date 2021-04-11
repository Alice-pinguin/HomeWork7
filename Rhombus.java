package company;
class Rhombus extends Shape {
    private String name, color;
    public Rhombus (String name, String color) {
        this.name = name;
        this.color = color;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }
}
