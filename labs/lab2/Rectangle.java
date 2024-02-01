public class Rectangle extends GeoShape {

  private double side1;
  private double side2;

  public Rectangle(String pColor, String pName, double s1, double s2) {
    // write your code here
    // set the super class: 'GeoShape' color and name, do not assign values
    // set the side1 and side2 value without assignment statements
    super(pColor, pName);
    setSides(s1, s2);

  }

  private void setSides(double length1, double length2) {
    // write your code here to assign private side1, side2 values
    this.side1 = length1;
    this.side2 = length2;
  }

  public double getArea() {
    // write your code here
    // return the area of a rectangle
    return (side1 * side2);

  }

  public double getPerimeter() {
    // write your code here
    // return the perimeter value of a rectangle
    return (2 * (side1 + side2));

  }
}
