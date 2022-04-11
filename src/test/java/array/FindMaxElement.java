package array;

public class FindMaxElement {

	public static void main(String[] args) {
		String[] strarr= {"welcome","hey","hello","all","to","yo" ,"you","tyss123"};
		String maxelement=strarr[0];
		for (int i = 0; i < strarr.length; i++) {
			if (maxelement.length()<strarr[i].length()) {
				maxelement=strarr[i];
			}
		}
		for (int i = 0; i < strarr.length; i++) {
			if(maxelement.length()==strarr[i].length()) {
				System.out.println(strarr[i]);
			}
		}

	}

}
