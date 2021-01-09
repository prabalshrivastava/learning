package learning.designpattern.creational.factory.networkfactory;

public class FactoryMain {
    public static void main(String[] args) {
        NetworkFactory networkFactory = new NetworkFactory();
        CellularNetwork abcnetwork = networkFactory.getNetwork("abcnetwork");
        abcnetwork.processBill(43);
    }
}
