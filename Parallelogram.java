package company;

class Parallelogram extends Shape  {
    private String name;
    private String color;

    public Parallelogram(String name, String color) {
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
