package assignment1;

import java.util.Arrays;

public class FindingMissingElement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int a[] = { 1,4,3,2,5,7};
			
		Arrays.sort(a);
	int n = a.length;	// 7 will store
	 for (int i=0; i<n ; i++)
	 {
	 if(i>0) {
			int cur = a[i]; // a[1] ==> 2
			int prev = a[i-1]; // a[1-1] ==> a[0] ==> 1
			if(cur != prev+1)   //--> 2 != (1+1) --> 2 != 2 --> false
				System.out.println((cur-1));
	 }
	 }
	}

}
