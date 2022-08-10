//Check is array is sorted or not

class CheckSortedArray{

	static boolean sorted(int arr[]){

		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; i++){
				if(arr[j]<arr[i]){
					return false;
				}
			}	
	}
	return true;
}
	public static void main(String [] args){
		int [] arr = {10,2,4,85,75};
		System.out.print(sorted(arr));
		}
	}
