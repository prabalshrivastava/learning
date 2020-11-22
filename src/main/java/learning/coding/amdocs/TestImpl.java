package learning.coding.amdocs;

public class TestImpl{
	public static void main(String[] args) {
		isAnagram("hello","olleh");
	}
	public static boolean isAnagram(String first, String second) {
	    char[] arr = first.toCharArray();
		for(char ch : arr){
		    second = second.replace(String.valueOf(ch),"");
		}
		return second.isEmpty();
	}
}