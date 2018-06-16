import java.io.*;
class CheckAnagram
{
    final int no_of_chars = 256;
    boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int countarr[] = new int[no_of_chars];

        for(int i=0;i<str1.length()&&i<str2.length();i++){
            countarr[str1.toLowerCase().charAt(i)]++;
            countarr[str2.toLowerCase().charAt(i)]--;
        }
        for(int i=0;i<countarr.length;i++){
            if(countarr[i]!=0){
                return false;
            }
        }
        return true;
    }
	public static void main (String[] args)
	{
	    CheckAnagram ca = new CheckAnagram();
		String str1 = "aa";
		String str2 = "aaa";
		if(ca.isAnagram(str1,str2)){
		    System.out.println("Anagram");
		}else{
		    System.out.println("Not an Anagram");
		}
	}
}
