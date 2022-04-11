package array;

public class FirstMaximumNumber {

	public static void main(String[] args) {
		int arry[]= {10,40,90,80,70,30};
		int max=arry[0];
			for (int i = 0; i < arry.length; i++) {
			if(arry[i]>max) {
				max=arry[i];
			}
		}
			System.out.println(max);
	}
}
