package labClass5;

import java.util.Scanner;
class Student {
    private String name;
    private int rollNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

public class ArrayIndexException {
	public static void main(String args[]) {
	        Student[] students = new Student[10];
	        Scanner scanner = new Scanner(System.in);
	        try {
	        // Input student records
	        for (int i = 0; i <=students.length; i++) {
	            System.out.println("Enter details for student " + (i + 1));
	            Student student = new Student();

	            System.out.print("Name: ");
	            student.setName(scanner.nextLine());

	            System.out.print("Roll Number: ");
	            student.setRollNumber(scanner.nextInt());
	            scanner.nextLine(); // Consume the newline character

	            students[i] = student;
	            System.out.println("Record added successfully.\n");
	        }
	  
	        }

	     
	        catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Error: Array index out of bounds.");
	                
	            }
	        }
	    
	
		

	

}
