package oopsPractice;

class Address{
	 String city;
	 String country;
	 Address(String city,String country){
		 this.city=city;
		 this.country=country;
	 }
}

public class Aggregation {
	int id;
	String name;
	Address address;
	Aggregation(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println("ID : " +id + "  Name :"+name) ;
		System.out.println("City :"+address.city +" Country :"+address.country);
		
	}

	public static void main(String[] args) {
		
		Address a=new Address("Gurgaon","India");
		
		Aggregation e=new Aggregation(101,"Sujeet",a);
		e.display();
		

	}

	
}



