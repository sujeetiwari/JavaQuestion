import java.util.Scanner ;
public class ArrayQuestion {

	public static void main(String[] args) {
//		int [] marks=new int[5] ;
//		marks[0]=100;
//		marks[1]=67;
//		marks[2]=89;
//		marks[3]=95;
//		marks[4]=67;
		
// int [] marks= {12,34,56,78,56};
//		int sum=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
//		System.out.println(sum);
//		System.out.println(marks.length);
//		for(int i=0;i<marks.length;i++) {
//			System.out.println(marks[i]);
//		}
//	}
//	for(int i= marks.length-1;i>=0;i--){
//			System.out.println(marks[i]);
//		} 
//	}
//}
		int [] marks= {24,65,76,86};
		for(int elements:marks) {
			System.out.println(elements);
		}
		int [][] score=new int [3][2];
		score[0][0]=1;
		score[0][1]=2;
		score[1][0]=3;
		score[1][1]=4;
		score[2][0]=5;
		score[2][1]=6;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
		
//		int [][]flats=new int[2 ][3];
//		flats[0][0]=101;
//		flats[0][1]=102;
//		flats[0][2]=103;
//		flats[1][0]=201;
//		flats[1][1]=202;
//		flats[1][2]=203;
//		for(int i=0;i<flats.length;i++) {
//		for(int j=0;j<flats[i].length;j++) {	
//			System.out.print(flats[i][j]);
//			System.out.print(" ");
//		}
//		System.out.println("");
//		}
//		
//	} 
//}
//
//
