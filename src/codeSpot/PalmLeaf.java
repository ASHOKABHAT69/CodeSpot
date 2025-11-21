This code doesn;t work for no spaces at end , with spaces>2 at end , refer PALMLEAf.java for 100% working of constraints!!

package codeSpot;
import java.util.Scanner;

public class PalmLeaf {
	
	public static String spaceEqualizer(String encode) {
		String result="";
		int j=1;
		for(int i=0;i<encode.length();i++)
		{
			if(encode.charAt(i)==' ')
			{
				if(i==j+1)
				{
					result+=encode.charAt(i);
					
				}
				
				
			}
			else
				result+=encode.charAt(i);
				j=i;
			
		}
		System.out.println(result);
		return result;
	}
	
	public static String equalizer(String encode, int target) {
		int spacearr[]=new int[100];
		int j=1;
		for(int i=encode.length()-1;i>=0;i--)
		{
			if(encode.charAt(i)==' ') {
				spacearr[j]=i;
				j++;
			}
		}
		//System.out.println(spacearr);
		
		String newsent=new String();
		newsent=encode.substring(spacearr[target],encode.length());
		for(int i=0;i<spacearr[target];i++)
		{
			newsent+=encode.charAt(i);
		}
		
		return newsent;
	}
	
	public static String removeAllSpacesSplChar(String encoded) {
		char ch;
		String result="";
		for(int i=0;i<encoded.length();i++)
		{
			ch=encoded.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
			{
				result+=ch;
			}
		}
		return result;
	}
	
	public static String concat(String encode1,String encode2) {
		String result=encode1.concat(encode2);
	
		return result;
		
	}
	
	public static String reverse(String encode1)
	{
		String encoderev1="";
		int j=0;
		for(int i=encode1.length()-1;i>=0;i--)
		{
			encoderev1+=encode1.charAt(i);
		}
		return  encoderev1; 
	}
	
	public static String modulo(String decoded) {
		String result;
		String decoded1="";
		String decoded2="";
		for(int i=0;i<decoded.length();i++)
		{
			if((i%2)==0)
				decoded1+=decoded.charAt(i);
			else
				decoded2+=decoded.charAt(i);
		}
		result=concat(decoded1,decoded2);
		return result;
	}
	
	public static String lengthDivision(String encodewospl)
	{
		int len=(encodewospl.length())/2;
		
		String encode1=encodewospl.substring(0,len);
		String encode2=encodewospl.substring(len,encodewospl.length());
		System.out.println(encode1);
		System.out.println(encode2);
		String encode1rev=reverse(encode1);
		String encode2rev=reverse(encode2);
		System.out.println(encode1rev);
		System.out.println(encode2rev);
		String result=concat(encode1rev,encode2rev);
		return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Tadapatra Sentence: ");
		String encoded=sc.nextLine();
		System.out.println("Enter the word numbering: ");
		int wordnum=sc.nextInt();
		String encoded1=spaceEqualizer(encoded);
		System.out.println("space: "+encoded1);
		encoded1=equalizer(encoded,wordnum);
		System.out.println("reorder: "+encoded1);
		encoded1=removeAllSpacesSplChar(encoded1);
		System.out.println("rem space: "+encoded1);
		String decoded=lengthDivision(encoded1);
		decoded=modulo(decoded);
		System.out.println("FINCAL: "+decoded);
		
		
		
	}

}

