package stringClassWork;



public class stringTableTwoArrays {

	public static void main(String[] args) {
		String[] name= {"Peter","Amy","John","Boyd","Cathy"};
		int []value= {15,9,14,10,12};
		System.out.println("Name " + "\t " +  "Value ");
		String temp1;
		for(int i=0;i<name.length-1;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].compareTo(name[j])>0) {
				temp1=name[i];
				name[i]=name[j];
				name[j]=temp1;
				}
			}
		}
		for(int i=0;i<value.length;i++) {
			for(int j=i+1;j<value.length;j++) {
				int temp;
				if(value[i]>value[j]) {
				     temp=value[i];
					value[i]=value[j];
					value[j]=temp;	
				}	
			}
		}
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i] +  " \t  " + value[i]);
		}

	}

}
