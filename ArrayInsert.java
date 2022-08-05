//Insert an element in an array

//a[] = {10,20,30,40,}
//n= 4
//cap = 6
//position = 2
//x =15
//indx = 1

import java.util.*;
class ArrayInsert {
	
	public static void main(String [] args){
		int[] arr = new int[5];
		arr[0] = 10; arr[1]=20; arr[2]=30; arr[3]=40;
		int capacity = 5;
		int numOfElements = 4;
		
		int x = 15, position = 2;

		int index = position-1;

		for(int i = numOfElements-1; i>= index; i--){
			arr[i+1] = arr[i];
		}
		arr[index] = x;

		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
}
}

