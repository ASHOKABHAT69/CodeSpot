package codeSpot;
import java.util.Scanner;

public class PalmLeaf {
	
	public static String removeAllSpacesSplChar(String encoded) {
		char ch;
		String result="";
		for(int i=0;i<encoded.length();i++)
		{
			ch=encoded.charAt(i);
			if(ch>='a' && ch<='z' ||ch>='A' && ch<='Z' || ch>='0' && ch<='9' )
			{
				result+=ch;
			}
		}
		return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Tadapatra Sentence: ");
		String encoded=sc.nextLine();
		System.out.println("Enter the word numbering: ");
		int wordnum=sc.nextInt();
		encoded=removeAllSpacesSplChar(encoded);
		System.out.println("Enter the Tadapatra Sentence:"+encoded);
		
		System.out.println("Enter the word numbering: "+wordnum);
		
		
		
	}

}

