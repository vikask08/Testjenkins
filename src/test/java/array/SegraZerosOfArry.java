package array;

public class SegraZerosOfArry {

	public static void main(String[] args) {
		int []a= {1,0,3,0,2,0,3,0};
		int b[]=new int[a.length];
		int m=0;
		int n=b.length-1;
		for (int i = 0; i < b.length; i++) {
			if (a[i]==0) {
				b[n]=a[i];
				n--;
			}
			else {
				b[m]=a[i];
				m++;
			}
			
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(+b[i]+" ");
		}
	}

}
