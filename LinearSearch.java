package array;

import java.util.*;

public class LinearSearch {

	public static  void main(String[] args) 
	{
		
  int arr[]= {15,14,13,12,11,10};
	int key=10;
	int size=arr.length;
	int index=linearSearch(arr,size,key);
	if(index==-1) {
		System.out.println(key+ ""+"  not found");
	}else {
		System.out.println(key+" "+"Found at Index "+index);
	}
	
	} public static int linearSearch(int[] arr,int size,int key) {
   	 for(int i=0;i<size;i++) {
		 if(key==arr[i]) {
			 return i;


}
}
	return-1;}}