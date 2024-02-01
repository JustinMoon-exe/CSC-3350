// Starter code for Lab2

public class Lab2pm {
    public static void main(String[] args) {
        GeoShape[] shapes = new GeoShape[3];
        shapes[0] = new Circle("red", "circle", 5.0);
        shapes[1] = new Rectangle("blue", "rectangle", 4.0, 6.0);
        shapes[2] = new Hexagon("pink", "hexagon", 7.2);

        // replace my name with your name
        System.out.println("Programmer is Justin Moonjeli\n");
        // NOTE: output for first shape should be:
        // Shape: circle
        // Color: red
        // Area: 78.53981633974483
        // Perimeter: 31.41592653589793
        // --------------------

        int i = 0;
        for (i = 0; i < shapes.length; i++) {
            System.out.println("Shape: " + shapes[i].getName());
            System.out.println("Color: " + shapes[i].getColor());
            System.out.println("Area: " + shapes[i].getArea());
            System.out.println("Perimeter: " + shapes[i].getPerimeter());
            System.out.println("--------------------");
        }
    }
}
