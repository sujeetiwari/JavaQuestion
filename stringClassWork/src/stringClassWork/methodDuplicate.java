package stringClassWork;

public class methodDuplicate {
static void duplicate(String s) {
	
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			if(ch[i]==ch[j]) {
				System.out.println(ch[j]);
			}
			
		}
	}

	
}
	public static void main(String[] args) {
	 String name="Sujeet";
	 System.out.println("Duplcate Word :");
	 duplicate(name);

	}

}
