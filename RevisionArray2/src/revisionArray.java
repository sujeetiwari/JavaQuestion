import java.lang.reflect.Array;

public class revisionArray {

	public static void main(String[] args) {
//		String[] d= {"abc","bcd","hgf","dabc","abc","hgf","dabc"};
//
//		for(int i=0;i<d.length;i++)
//		{
//		for(int j=i+1;j<d.length;j++) {
//			if((d[i].equals(d[j])) && (i!=j))
//			{
//				System.out.println("Duplicate Element is : " + d[j]);
//			}
//		}
//		
//
//	}
//		int []arr= {1,2,3,4};
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(" "+arr[i]);
//		}
//		System.out.println();
//        	  System.out.println("Reverse the array :");
//          for(int j=arr.length;j>0;j--) {
//        	  System.out.print(" "+ j);
//          }
		//maximum and minimum element
		int []arr= {122,34,2,54,32,212};
//		int max=0;
//		int min=0;
		findMinAndMax(arr);
	}
	static void findMinAndMax(int[] arr) {
		if(arr==null||arr.length==0)
			return;
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		min=Math.min(min,arr[i]);
		max=Math.max(max, arr[i]);
	}
}
