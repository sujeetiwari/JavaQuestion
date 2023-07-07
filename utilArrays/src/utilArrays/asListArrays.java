package utilArrays;

import java.util.Arrays;

public class asListArrays {

	public static void main(String[] args) {
		int[]arr= {10,20,15,34,8};
		System.out.println("Integer Array as List :"+Arrays.asList(arr));
		
//		binarySearch
		int [] search= {12,34,54,5,21};
		Arrays.sort(search);
		for(int i=0;i<search.length;i++) {
			System.out.println(search[i]);
		}
		int no=34;
		System.out.println(no + " found at index :"+Arrays.binarySearch(search, no));
  
		
//		copyOf()
		int[] a= {12,34,53,15};
		System.out.println("Integer Arrays :"+Arrays.toString(a));
		System.out.println("New Arrays by copyOf :");
		System.out.println("Integer Arrays :"+Arrays.toString(Arrays.copyOfRange(a,1,3)));
	}

}
