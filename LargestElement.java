//Largest element in an array

import java.util.*;

class LargestElement{
	public static void main(String [] args){
			int [] arr = {10,15,17,2,3};

			int large = arr[0];

			for (int i = 0; i<arr.length; i++){
					if(large < arr[i])
							large = arr[i];
			}
			System.out.println("Largest element in an array is: " + large);
	}
}