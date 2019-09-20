package learning.java.innerclass;

public class MemberInnerClassExample {
    //Error as it is not visible to other class
    //Mic memberInnerClass = new Mic();

    //Error as MemberInnerClass is not a static class
    //MemberOuterClass.Mic memberInnerClass = new MemberOuterClass.Mic();

    //Instance level
    MemberOuterClass memberOuterClass = new MemberOuterClass();
    MemberOuterClass.MicDefault memberInnerClass = memberOuterClass.new MicDefault();
    MemberOuterClass.MicProtected memberInnerClass3  = memberOuterClass.new MicProtected();
    MemberOuterClass.MicPublic memberInnerClass2  = memberOuterClass.new MicPublic();
    //error
    //MemberOuterClass.MicPrivate memberInnerClass1  = memberOuterClass.new MicPrivate();

    //Class Level
    //static can be accessed using the class name and don't need any instance of Outer class to create instance of nested static class in Java
    MemberOuterClass.NscDefault nscDefaultStatic = new MemberOuterClass.NscDefault();
    MemberOuterClass.NscPublic nscPublicStatic = new MemberOuterClass.NscPublic();
    MemberOuterClass.NscProtected nscProtectedStatic = new MemberOuterClass.NscProtected();
    //MemberOuterClass.MicPrivate nscPrivateStatic = new MemberOuterClass.MicPrivate();
}

class MemberOuterClass{
    //Mic can be made private, public or protected like any other member
    class MicDefault {}
    private class MicPrivate{}
    public class MicPublic{}
    protected class MicProtected{}

    final class MicDefaultFinal {}
    final private class MicPrivateFinal{}
    final public class MicPublicFinal{}
    final protected class MicProtectedFinal{}


    //NestedStaticClass Nsc can be made private, public or protected like any other member
    static class NscDefault{}
    static private class NscPrivate{}
    static public class NscPublic{}
    static protected class NscProtected{}

    static final class NscDefaultFinal{}
    static final private class NscPrivateFinal{}
    static final public class NscPublicFinal{}
    static final protected class NscProtectedFinal{}


    //INHERITANCE CASES
    class MicDefaultInherit extends MicDefault{}
    class MicPrivateInherit extends MicPrivate{}
    class MicPublicInherit extends MicPublic{}
    class MicProtectedInherit extends MicProtected{}

    //class MicFinalDefaultInherit extends MicDefaultFinal{}
    //class MicPrivateFinalInherit  extends MicPrivateFinal{}
    //class MicPublicFinalInherit  extends MicPublicFinal{}
    //class MicProtectedFinalInherit  extends MicProtectedFinal{}

    class  NscDefaultInherit extends NscDefault{}
    private class  NscPrivateInherit extends NscPrivate{}
    public class  NscPublicInherit extends NscPublic{}
    protected class  NscProtectedInherit extends NscPublic{}

    static class  NscDefaultInherit1 extends NscDefault{}
    static private class  NscPrivateInherit1 extends NscPrivate{}
    static public class  NscPublicInherit1 extends NscPublic{}
    static protected class  NscProtectedInherit1 extends NscPublic{}

    //class  NscDefaultFinalInherit extends NscDefaultFinal{}                   /*error as final class cannot be inherited */
    //private class  NscPrivateFinalInherit extends NscPrivateFinal{}           /*error as final class cannot be inherited */
    //public class  NscPublicFinalInherit extends NscPublicFinal{}              /*error as final class cannot be inherited */
    //protected class  NscProtectedFinalInherit extends NscPublicFinal{}        /*error as final class cannot be inherited */
                                                                            
    //static class  NscDefaultFinalInherit1 extends NscDefaultFinal{}           /*error as final class cannot be inherited */
    //static private class  NscPrivateFinalInherit1 extends NscPrivateFinal{}   /*error as final class cannot be inherited */
    //static public class  NscPublicFinalInherit1 extends NscPublicFinal{}      /*error as final class cannot be inherited */
    //static protected class  NscProtectedFinalInherit1 extends NscPublicFinal{}/*error as final class cannot be inherited */

}


//1) First and most important difference between Inner class and nested static class is that Inner class require instance of outer class for initialization and they are always associated with instance of enclosing class. On the other hand nested static class is not associated with any instance of enclosing class.
//2) Another difference between Inner class and nested static class is that later uses static keyword in there class declaration, which means they are static member of class and can be accessed like any other static member of class.
//3) Nested static class can be imported using static import in Java.
//4) One last difference between Inner class and nested static class is that later is more convenient and should be preferred over Inner class while declaring member classes.