package array;

public class AddingTwoAraayAnyLength {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,7,9,11,13};
		int count =a.length;
		if (b.length>a.length) {
			count=b.length;
		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.print(a[i]+b[i]+" ");
			}
			catch(Exception e){
				if(a.length>b.length) {
					System.out.print(a[i]+" ");
				}
				else {
					System.out.print(b[i]+" ");
				}
			}
			
		}
		
	}

}
