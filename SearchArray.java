//Search Array

import java.util.*;

class SearchArray{
	
	public static void main(String [] args){

		int [] arr = {10,20,30,40,50,60};
		int search = 50;

		for (int i=0; i<arr.length; i++){
			if(arr[i] == search){
				System.out.println("The element we are searching is at index position: " + i);
			}
	}
}
}

Time complexity : Big O(N)
Space complexity: Big O(1)