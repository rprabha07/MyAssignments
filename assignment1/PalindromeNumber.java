package assignment1;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 12345;
		int num1 = no;
		int rem = 0;
		
		while(no>0)
		{
			rem = (rem*10)+no%10;
			no=no/10;
		}
		System.out.print(rem);
		
		if (rem == num1) {
			System.out.print(" the number is palindrome");
		}
		else 
		{
			System.out.print("  the number is not palindrome");
		}
		

	}

}
