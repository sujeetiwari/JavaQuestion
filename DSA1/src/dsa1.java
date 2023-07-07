import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dsa1 {
		
	
	public static void main(String[] args) {
	/*	 int[]arr= {21,4,54,32,99,19};
		 findMaxAndMin(arr);
	}
	static void findMaxAndMin(int[]arr) {
		if(arr==null||arr.length==0)
			return;
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
//			 max=Math.max(max, arr[i]);
//			 min=Math.min(min, arr[i]);
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
		}
		}
		System.out.println("Maximum :" + max);
		System.out.println("Minimum :" + min);
	}
		int max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
} */
//		Reverse Number
/*		int [] a= {12,3,42,87,1};
		for(int i=0;i<a.length;i++) {
			System.out.print(" " +a[i]);
		}
		
		for(int i=4;i>=0;i--) {
			System.out.print("\n " + a[i]);
		} */
//		duplicate number
		List<Integer>list=Arrays.asList(1,12,3,42,10,2,3,54,42,1,67,87,67);
//		Set<Integer>dup=
//				list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
//		System.out.println(dup);
//Set<Integer>dupNum=new HashSet<Integer>();
//Set<Integer>dup=list.stream().filter(e->!dupNum.add(e)).collect(Collectors.toSet());
//System.out.println(dup);
		
		Set<Integer>dup=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(dup);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	}
}
