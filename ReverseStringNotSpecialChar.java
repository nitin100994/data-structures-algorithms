import java.io.*;
import java.lang.String;	
class ReverseStringNotChar{

	private void revString(String str){
		//StringBuffer strBuff = new StringBuffer(str);
		//strBuff.append(str);
		char[] charArray = str.toCharArray();
		int l = 0;int r = charArray.length - 1;
		while(l<r){
			if(!checkAlphabet(charArray[l]))
				l++;
			else if(!checkAlphabet(charArray[r]))
				r--;
			else
				{
					char temp = charArray[l];
					charArray[l] = charArray[r];
					charArray[r] = temp;
					l++;
					r--;
				}			
		}
		System.out.println("Reveresd string is :"+charArray);
	}
	
	private boolean checkAlphabet(Character ch){
		if(('A'<=ch && ch<='Z') || ('a'<=ch && ch<='z'))
			return true;
			else
			return false;
	}
	
	public static void main(String args[]){
		ReverseStringNotChar obj = new ReverseStringNotChar();
		String str = "a!!!b.c.d,e'f,ghi";
		obj.revString(str);
 	}
}