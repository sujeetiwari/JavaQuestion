package oopsPractice;

	 class Doctor{
		 String name;
		 int age;
		 Doctor(String name,int age){
			 this.name=name;
			 this.age=age;
			 
		 }
		void displayInfo(){
			 System.out.println("Name :"+name);
			 System.out.println("Age :"+age);
		 }
		  
		 
	 }
	 class Surgeon extends Doctor{
		 String specialists;
		 Surgeon(String name,int age,String specialists){
			 super(name,age);
			 this.specialists=specialists;
			 
		 }
		 void displayInfo() {
			 super.displayInfo();
			 System.out.println("Specialists :"+specialists);
		 }
		 
		 
	 }
	 class Nurse extends Doctor{
		 int experience;
		 Nurse(String name,int age,int experience){
			 super(name,age);
			 this.experience=experience;
			 
		 }
		 void displayInfo() {
			 super.displayInfo();
			 System.out.println("Experience Year :"+experience);
		 }
	 }
	
	 
public class multilevelImplements {

	public static void main(String[] args) {
		
	 Surgeon s=new Surgeon("Sujeet",21,"Neuro Surgeon");
	 s.displayInfo();
	 Nurse n =new Nurse("Ayush",20,2);
	 n.displayInfo();
	}

}
