package learning.designpattern.creational.factory.networkfactory;

public class NetworkFactory {
    public CellularNetwork getNetwork(String cellularNetwork) {
        switch (cellularNetwork.toUpperCase()) {
            case "ABCNETWORK":
                return new AbcNetwork();
            case "PQRNETWORK":
                return new PqrNetwork();
            case "XYZNETWORK":
                return new XyzNetwork();
            default:
                return null;
        }
    }
}
