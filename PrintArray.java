//Print elements in an Array

//1. Using toString method.

import java.util.*;

class PrintArray {
	
	public static void main(String [] args){

		String [] str_arr = {"one","Two","ka","Four","Four","Two","ka","One"};
		System.out.println(Arrays.toString(str_arr) + " My name is Lakhan");
	}
}

//2. Using For loop

class PrintArray{

	public static void main(String [] args){
		int [] arr = {1,2,3,4};
		System.out.println("The elements in an array are: ");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
	}
}

//3. Using for each loop
	
	class PrintArray{
		public static void main(String [] args){
			int [] arr = {1,2,3,4};
			System.out.println("The elements in an array using for each loop: ");

			for(int newArr : arr){
				System.out.print(newArr);					}
		}
	}