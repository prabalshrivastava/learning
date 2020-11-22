package learning.java8.nileshsirwebinar;

import java.util.Arrays;
import java.util.Comparator;

class Emp {
    private int empno;
    private String ename;
    private double sal;
    private String job;

    public Emp() {
        this(0, "", 0.0, "");
    }

    public Emp(int empno, String ename, double sal, String job) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.job = job;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Emp1 [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", job=" + job + "]";
    }
}

public class LambdaDemo01Main {
    public static void printEmps(Emp1[] arr) {
        System.out.println("");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Emp1[] arr = new Emp1[]{
                new Emp1(5, "S", 745, "Clerk"),
                new Emp1(9, "D", 834, "Manager"),
                new Emp1(7, "K", 345, "Salesman"),
                new Emp1(2, "G", 534, "Analyst"),
                new Emp1(4, "W", 742, "Manager"),
                new Emp1(1, "U", 875, "Manager"),
                new Emp1(8, "B", 528, "Salesman"),
                new Emp1(3, "N", 656, "Clerk")
        };

        //local class
        class EmpNoComparator implements Comparator<Emp1> {

            @Override
            public int compare(Emp1 o1, Emp1 o2) {
                return o1.getEmpno() - o2.getEmpno();
            }
        }
        printEmps(arr);
        Arrays.sort(arr, new EmpNoComparator());
        printEmps(arr);

        //anonymous inner class
        Comparator<Emp1> empComparator = new Comparator<Emp1>() {
            @Override
            public int compare(Emp1 o1, Emp1 o2) {
                return o1.getEname().compareTo(o2.getEname());
            }
        };

        Arrays.sort(arr, empComparator);
        printEmps(arr);

        // anonymous inner class
        Arrays.sort(arr, new Comparator<Emp1>() {
            @Override
            public int compare(Emp1 e1, Emp1 e2) {
                return ((Double) e1.getSal()).compareTo(e2.getSal());
            }
        });
        printEmps(arr);

        Arrays.sort(arr, (Emp1 e1, Emp1 e2) -> {
                    int diff = ((Double) e2.getSal()).compareTo(e1.getSal());
                    return diff;
                }
        );
        printEmps(arr);


        //arguments are inferred.
        Arrays.sort(arr, (e1, e2) -> {
                    int diff = ((Double) e2.getSal()).compareTo(e1.getSal());
                    return diff;
                }
        );
        printEmps(arr);

        Arrays.sort(arr, (e1, e2) -> e1.getJob().compareTo(e2.getJob()));

        printEmps(arr);
    }
}