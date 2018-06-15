/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;

class RemoveSpace {
    void removeSpaceFromString(StringBuffer str){
    int l=str.length();
    for(int i=0;i<l;i++){
        if(str.charAt(i) == ' '){
            str.deleteCharAt(i--);
            l--;
        }
    }
}
    void printString(StringBuffer str){
        System.out.println(str);
    }
	public static void main(String[] args) {
		RemoveSpace rm = new RemoveSpace();
		StringBuffer str = new StringBuffer("g  eeks   for ge  eeks ");
		rm.removeSpaceFromString(str);
		rm.printString(str);
	}
}
	
