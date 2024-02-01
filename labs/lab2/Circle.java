public class Circle extends GeoShape {

    private double radius;

    public Circle(String pColor, String pName, double pRadius) {
        // write your code here
        // set the super class: 'GeoShape' color and name, do not assign values
        // set the radius value without assignment statement, use method
        super(pColor, pName);
        setRadius(pRadius);

    }

    private void setRadius(double pRad) {
        // write your code here
        // assign the radius from pRad
        this.radius = pRad;

    }

    public double getArea() {
        // write your code here
        // return the area of a circle
        // hint use 'Math.PI' to get pi value
        return (Math.PI * radius * radius);

    }

    public double getPerimeter() {
        // write your code here
        // return the circumference of a circle
        // hint use 'Math.PI' to get pi value

        return (2 * Math.PI * radius);

    }
}
