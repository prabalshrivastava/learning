package learning.designpattern.creational.factory.networkfactory;

public class PqrNetwork extends CellularNetwork {
    @Override
    void getRate() {
        rate = 1.75;
    }
}
