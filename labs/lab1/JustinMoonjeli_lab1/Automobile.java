package JustinMoonjeli_lab1;

public class Automobile {
    private String make;
    private String model;
    private int year;
    private int numWheels;

    public Automobile(String mk, String md, int y, int nw) {
        make = mk;
        model = md;
        year = y;
        numWheels = nw;
    }

    public void getinfo() {
        System.out.println("\nThe programmer is: Justin Moonjeli\n");
        System.out.println("\tMake: " + make);
        System.out.println("\tModel: " + model);
        System.out.println("\tyear: " + year);
        System.out.println("\tNumber of Wheels: " + numWheels);

    }
}