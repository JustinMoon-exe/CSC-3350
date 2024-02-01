public class Hexagon extends GeoShape {

    private double side;

    public Hexagon(String pColor, String pName, double pSide) {
        // write your code here
        // initialize the color and name in the 'GeoShape' super class
        // set the side value, do not use assignment for this
        super(pColor, pName);
        setSide(pSide);
    }

    private void setSide(double length) {
        // write your code here
        // assign the 'side' from length
        this.side = length;

    }

    public double getArea() {
        // write your code here
        // return the area of a regular hexagon (all sides equal)
        // hint use 'Math.sqrt' to get square root
        // here is a formula:
        // https://socratic.org/questions/how-do-i-calculate-the-area-of-a-hexagon
        return ((3 * Math.sqrt(3) * side * side) / 2);

    }

    public double getPerimeter() {
        // write your code here
        // return the perimeter of a regular hexagon (all sides equal)
        return (6 * side);
    }
}
