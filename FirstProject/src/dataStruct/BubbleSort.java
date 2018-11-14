package dataStruct;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {99,-10,100123,18,-978,5623,463,-9,287,49};
		int a,b,t;
		int size = 10;
		
		//display the oriignal array
		System.out.print("Original array is: ");
		for(int i=0; i< size; i++)
			System.out.print(" "+ nums[i]);
		System.out.println();
		
		//This is the bubble sort
		for(a=1; a< size;a++)
			for(b=size-1;b>=a;b--) {
				if(nums[b-1]> nums[b]) { //if out of order
					//exchange elements
					t=nums[b-1];
					nums[b-1] = nums[b];
					nums[b] =t;
				}
			}
		//display sorted array
		System.out.println("Sorted array is: ");
		for(int i = 0; i< size; i++)
			System.out.print(" "+nums[i]);
		System.out.println();
		

}
}
