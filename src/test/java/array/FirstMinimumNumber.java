package array;

public class FirstMinimumNumber {

	public static void main(String[] args) {
		int arry[]= {10,40,90,80,70,30};
		int min=arry[0];
			for (int i = 0; i < arry.length; i++) {
			if(arry[i]<min) {
				min=arry[i];
			}
		}
			System.out.println(min);

	}

}
