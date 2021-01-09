package learning.designpattern.creational.factory.networkfactory;

import static java.lang.System.*;

public abstract class CellularNetwork {
    protected double rate;

    abstract void getRate();

    public void processBill(int minutes) {
        getRate();
        out.println(minutes * rate);
    }
}
