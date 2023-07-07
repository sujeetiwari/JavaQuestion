import java.util.Arrays;

public class revisionArray2 {
static int max;
static int min;
static void max_min(int array[]) {
	max=array[0];
	min=array[0];
	int len=array.length;
	for(int i=1;i<len-1;i++) {
		if(i+1>len) {
		if(array[i]>max)
			max=array[i];
		if(array[i]<min)
			min=array[i];
	}
	if(array[i]>array[i+1]) {
		if(array[i]>max)
			max=array[i];
		if(array[i+1]<min)
			min=array[i+1];
	}
	if(array[i]<array[i+1]) {
		if(array[i]<min)
			min=array[i];
		if(array[i+1]<min)
			min=array[i+1];
	}
	}
}
	public static void main(String[] args) {
		int[] array= {1,23,45,12,87,3,94};
		max_min(array);
		System.out.println("Original array " +Arrays.toString(array));
		System.out.println("Maximum number :" +max);
		System.out.println("Minimum number :" +min);

	}

}
