package learning.designpattern.creational.factory.networkfactory;

public class XyzNetwork extends CellularNetwork {
    @Override
    void getRate() {
        rate = 1.5;
    }
}
