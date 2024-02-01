public abstract class GeoShape {
    private String color;
    private String name;

    public GeoShape(String pColor, String pName) {
        // write your code here
        // initialize the color and name of shape
        this.color = pColor;
        this.name = pName;

    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
