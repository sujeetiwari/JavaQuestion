package labClass2;

public class DisplayMarksRecord {

	public static void main(String[] args) {
		String[] name= {"Sujeet","Mohit","Ayush","Akhil","Tushar"};
		int[] marks= {85,67,12,98,46};
		System.out.println("Display the student marks of more than 50%");
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>50) {
				System.out.println("Name :"+name[i] +  "," + "   Marks :"+ marks[i]);
			}
		}

	}

}
