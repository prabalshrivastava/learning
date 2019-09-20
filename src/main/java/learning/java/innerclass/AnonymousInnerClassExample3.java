package learning.java.innerclass;


class AnonymousInnerClassExample3 {
    //Anonymous inner classes are created then and there itself
    //It is a class which doesn't have name to reference and initialized at same place where it gets created.
    //It can be declared inside class as well as method
    private Runnable r1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("AnonymousInnerClass");
        }
    };

    public static void main(String[] args) {

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("AnonymousInnerClass");
            }
        };
    }

    {
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("AnonymousInnerClass");
            }
        };
    }
    static{
        Runnable r4 = new Runnable() {
            @Override
            public void run() {
                System.out.println("AnonymousInnerClass");
            }
        };
        new Test();
    }


}

class Test{
    static AnonymousInnerClassExample3 astatic = new AnonymousInnerClassExample3(){
        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            return super.equals(o);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "From inside anonymous inner class";
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    };

    static{
        System.out.println(astatic.toString());
    }
}
