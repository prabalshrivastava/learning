package learning.designpattern.creational.factory.networkfactory;

public class AbcNetwork extends CellularNetwork {
    @Override
    void getRate() {
        rate = 1.5;
    }
}
