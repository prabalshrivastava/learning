package learning.java.innerclass;

public class InnerClass1 {}
interface AnonymousClassInterface {}

//have a look at how the classes are placed and how they are named....these are the java terminologies
class TopLevelClass{
    //NON STATIC NESTED CLASSES
    class NestedClass1{}//both static and non-static classes are called nested classes
    class InnerClass{}
    class NonStaticInnerClass{}
    class NonStaticNestedClass{}
    class NonStaticNestedInnerClass{}

    //there are three kinds of Inner class in Java:
    //1. Local inner class    ------> inner class is declared inside a code block or method
    //2. Anonymous inner class------> doesn't have name to reference and initialized at same place where it gets created
    //3. Member inner class   ------> inner class is declared inside

    public static void main(String[] args) {
        //1. Local inner class    ------> inner class is declared inside a code block or method
        class LocalInnerClass{}

        //2. Anonymous inner class------> doesn't have name to reference and initialized at same place where it gets created
        AnonymousClassInterface anonymousClassInterface = new AnonymousClassInterface() {};
    }
    //3. Member inner class   ------> inner class is declared inside
    class MemberInnerClass{}

    //========================================================================================================================================
    //STATIC NESTED CLASSES
    static class NestedClass2{}//both static and non-static classes are called nested classes
    static class NestedStaticClass{}
    static class StaticNestedClass{}
}
//One of the most important question related to nested classes are Where should you use nested class in Java?
// Nested class improves Encapsulation and help in maintenance. in HashMap class Map.Entry is a good example of nested class in Java.
//Comparator is also tied with a particular class, it make sense to declare them as nested static class in Java