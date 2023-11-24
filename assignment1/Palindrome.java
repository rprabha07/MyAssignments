package assignment1;



public class Palindrome {

	public void palindromString() {
		String word ="ABCD";
		String word2 = "";
		
		for(int i=word.length()-1;i>=0;i--) {
			word2=word2+word.charAt(i);
		}
	System.out.print(word2);;
	if(word.equals(word2)) {
		
		System.out.print(" palindrome");
	}
	else {
		System.out.print(" not palindrome");
	}
	}
	
	public static void main(String[] args) {
		
		Palindrome pd = new Palindrome();
		pd.palindromString();
	}
}
