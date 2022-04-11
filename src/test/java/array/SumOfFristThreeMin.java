package array;

public class SumOfFristThreeMin {

	public static void main(String[] args) {
		int arry[]= {10,40,90,80,70,30};
		int sum=0;
		for (int i = 0; i < arry.length; i++) {
			for (int j = i+1; j < arry.length; j++) {
				if(arry[i]>arry[j]) {//Condition to check which no is greater
					int temp =arry[i];//store greater number in tempt
					arry[i]=arry[j];//Swamping
					arry[j]=temp;
				}
			}
		}
		for (int i = 0; i < arry.length; i++) {
			
			if(i<3) {
				sum=sum+arry[i];
			}
			
		}
		System.out.println(sum);
	}

}
