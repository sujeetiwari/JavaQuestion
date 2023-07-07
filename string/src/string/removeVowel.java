package string;

public class removeVowel {

	public static void main(String[] args) {
		
		String s="Computer Application";
		 String s1="";
		 s1=s.replaceAll("[aeiouAEIOU]", "");
		 System.out.println("String after remove :"+s1);
//			Second Method
		 String word="Sujeet Tiwari";
		 System.out.println("Constant :");
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a'|| word.charAt(i)=='e' ||word.charAt(i)=='i'|| word.charAt(i)=='0'||
					word.charAt(i)=='o'|| word.charAt(i)=='u'||word.charAt(i)=='A'|| word.charAt(i)=='E'||
					word.charAt(i)=='I'|| word.charAt(i)=='O'|| word.charAt(i)=='u') {
//				System.out.println(word.charAt(i));
//				continue;
			}
			else {
			System.out.print(word.charAt(i));
			}
		}
	}

}
