import java.io.*;
class  Panagram
{
    public boolean checkPanagram(String str){
        boolean hastable[]=new boolean[26];
        int index = 0;
        for(int i=0;i<str.length();i++){
            if('A'<=str.charAt(i) && str.charAt(i)<='Z')
                index = str.charAt(i) - 'A';
            else if('a'<=str.charAt(i) && str.charAt(i)<='z')   
                index = str.charAt(i) - 'a';
                hastable[index] = true;
        }
        for(int i=0;i<26;i++){
            if(hastable[i] == false)
                return false;
        }
        return true; 
    }
	public static void main (String[] args)
	{
		Panagram pana = new Panagram();
		String str = "The quick brown fox jumps over the lazy dog";
		if(pana.checkPanagram(str))
		    System.out.println("Panagram");
		else    
		    System.out.println("Not a Panagram");
	}
}
