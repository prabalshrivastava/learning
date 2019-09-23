package learning.java8.interfaces.defaultmethod;

public interface InterfaceWithObjectClassMethodsOverridden {
    //public default int hashCode() {
    //    return hashCode();
    //}

    //public default boolean equals(Object o) {
    //    return true;
    //}

    public default Object clone() throws CloneNotSupportedException {
        return null;
    }

    //public default String toString() {
    //    return "toString()";
    //}

    public default void finalize() throws Throwable {
    }
}