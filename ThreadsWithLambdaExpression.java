package learning.java8;
public class ThreadsWithLambdaExpression {
    public static void main(String[] args) {
    	
    	//1
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("I am runnable thread");
            }
        };
        Thread t = new Thread(r);
        t.start();
        
        //2 with lambda expression
        r = () -> System.out.println("I am runnable thread");
        t = new Thread(r);
        t.start();
        
        //3 with lambda expression
	    new Thread(r = () -> System.out.println("I am runnable thread")).start();
    }
}