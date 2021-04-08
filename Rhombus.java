package company;

class Rhombus extends Shape implements ColorShape{
    private String name ;
    private String color;

    public Rhombus(String name, String color) {
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