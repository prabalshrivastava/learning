package learning.java.inheritance;

class A {
}

class B extends A {
}

// "Class B is narrower than class A"
// Classes demonstrating method overriding:

class C {
    A getFoo() {
        return new A();
    }
}

class D extends C {
    //Overriding getFoo() in parent class C
    B getFoo() {
        return new B();
    }
}