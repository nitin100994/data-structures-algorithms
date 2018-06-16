import java.util.*;
class RotateArray{
	
	void rotation(int arr[],int noOfRotations,int size){
		int i,j,temp;
		for(i=0;i<noOfRotations;i++){
			 temp=arr[0];
			for(j=0;j<size-1;j++){
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
	}
	void printArray(int arr[],int size){
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String rags[]){
		RotateArray rotateArray = new RotateArray();
		int arr[]={1,2,3,4,5};
		int noOfRotations = 2;
		int size = arr.length;
		rotateArray.rotation(arr,noOfRotations,size);
		rotateArray.printArray(arr,size);
	}
}