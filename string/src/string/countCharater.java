package string;

public class countCharater {
	static void countCharacterType(String str) {
		int vowel =0;
		int constant=0;
		int special=0;
		int digit=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch>='a'&&ch>='z')||(ch>='A')&&(ch>='Z')) {
				ch=Character.toLowerCase(ch);
				if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U') 
					vowel++;
				
				else 
					constant++;
			}
				else if(ch>='0'&& ch<='9') 
					digit++;
				
				else 
					special++;
				
			
		}
		System.out.println("Vowels :"+vowel);
		System.out.println("Constant :"+constant);
		System.out.println("Special Character :"+special);
		System.out.println("Digit :"+digit);
	}
	public static void main(String[] args) {
		
		String str="geeks for geeks@!";
		countCharacterType(str);
		

	}

}
