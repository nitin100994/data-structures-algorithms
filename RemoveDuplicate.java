import java.io.*;
import java.util.*; 
class RemoveDuplicate{
	
	private void RemoveDuplicateCharracter(String str){
		LinkedHashSet<Character> lhst = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++){
			lhst.add(str.charAt(i));
		}
		
		for(Character ch:lhst){
			System.out.println(ch);
		}
	}
	
	public static void main(String args[]){
		RemoveDuplicate obj = new RemoveDuplicate();
		String str = new String("Nitin Joshi");
		obj.RemoveDuplicateCharracter(str);
	}
}