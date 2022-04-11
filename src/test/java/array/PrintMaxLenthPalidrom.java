package array;

public class PrintMaxLenthPalidrom {

	public static void main(String[] args) {
		String s1= "radar malayalam vikas hanannbnnanah";
		String[] s4=s1.split(" ");
		String lar = "";
		String s3="";
		for (int i = 0; i < s4.length; i++) {
			String s2=s4[i];	
			String tem=s2;	
			String rev="";
			for (int j =0; j<s2.length(); j++) {
				char ch=s2.charAt(j);
				rev=ch+rev;
			}	
			if (tem.equals(rev)) {
				s3=rev;			
			}
			if (lar.length()<s3.length()) {
				lar=s3;
			}			
		}
		System.out.println(lar);
	}
}