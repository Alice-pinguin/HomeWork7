package company;

class Quad extends Shape  {
    private String name, color;
    public Quad (String name, String color) {
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
