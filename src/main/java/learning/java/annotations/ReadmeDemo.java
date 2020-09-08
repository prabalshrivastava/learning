package learning.java.annotations;

@Readme("Nilesh") //info="No Info",company="Unknown"
public class ReadmeDemo {

//    @Readme("") //annotations are only allowed for the target it is mentioned here we are trying to use it on a field which is not allowed.
    private int demoField;

    @Readme(value = "Rahul", info = "Param less ctor") //company="Unkown"
    public ReadmeDemo() {
    }

    @Readme(value = "Amit",info = "demo method",company = "Sunbeam")
    public void demoMethod() {

    }
}
