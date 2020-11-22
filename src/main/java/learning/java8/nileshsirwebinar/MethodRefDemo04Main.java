package learning.java8.nileshsirwebinar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Emp1 {
	private int empno;
	private String ename;
	private double sal;
	private String job;
	public Emp1() {
		this(0, "", 0.0, "");
	}
	public Emp1(int empno, String ename, double sal, String job) {
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
	
	public static int compareJobDesc(Emp1 e1, Emp1 e2) {
		return e2.getJob().compareTo(e1.getJob());
	}
}

public class MethodRefDemo04Main {
	public static void printEmps(List<Emp1> l) {
		for (Emp1 e : l)
			System.out.println(e);
		System.out.println();
	}
	public static void main(String[] args) {
		List<Emp1> list = Arrays.asList(
			new Emp1(5, "S", 745, "Clerk"),
			new Emp1(9, "D", 834, "Manager"),
			new Emp1(7, "K", 345, "Salesman"),
			new Emp1(2, "G", 534, "Analyst"),
			new Emp1(4, "W", 742, "Manager"),
			new Emp1(1, "U", 875, "Manager"),
			new Emp1(8, "B", 528, "Salesman"),
			new Emp1(3, "N", 656, "Clerk")
		);
		
		// sort by job asc
		list.sort((e1,e2)->e1.getJob().compareTo(e2.getJob())); // sort() is new default method in List<> interface.
		printEmps(list);
		System.out.println();
		list.sort(Emp1::compareJobDesc);
		printEmps(list);
		System.out.println();
		list.sort(Comparator.comparing(e -> e.getJob()));
		list.sort(Comparator.comparing(Emp1::getJob));
		list.sort(Comparator.comparing(Emp1::getJob).reversed());
		list.sort(Comparator.comparing(Emp1::getJob).thenComparing(Emp1::getEname));

		/*
		// sort by job desc - using static method compareJobDesc
		// ???
		list.forEach(System.out::println);
		System.out.println();
		
		// sort by job asc
		// ???
			// (e1,e2) -> e1.getJob().compareTo(e2.getJob())
		list.forEach(System.out::println);
		System.out.println();

		// sort by job desc
		// ???
			// (e1,e2) -> - e1.getJob().compareTo(e2.getJob())
		list.forEach(System.out::println);
		System.out.println();

		// sort by job desc and then by name desc (using lambda)
			// select * from emp order by job desc, name desc
		list.sort((e1,e2)-> {
			// ???
			return 0;
		});
		list.forEach(System.out::println);
		System.out.println();
		
		// sort by job asc and then by name asc
		// ???
		list.forEach(System.out::println);
		System.out.println();
		
		// sort strings ignoring case
		List<String> strList = Arrays.asList("sarang", "Nilesh", "Amit", "Nitin", "Vishal", "Sarang", "nitin");
		// ???
		strList.sort((s1,s2)->s1.compareToIgnoreCase(s2));
		System.out.println(strList);
		System.out.println();
		*/
	}
}