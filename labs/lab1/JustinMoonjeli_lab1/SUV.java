package JustinMoonjeli_lab1;

public class SUV extends Automobile {
    private int numpass;
    private double cargospc;

    public SUV(String mk, String md, int y, int nw, int np, double cs) {
        super(mk, md, y, nw);
        numpass = np;
        cargospc = cs;
    }

    @Override
    public void getinfo() {
        super.getinfo();
        System.out.println("\tpassengers: " + numpass);
        System.out.println("\tcargo space: " + cargospc);
    }
}