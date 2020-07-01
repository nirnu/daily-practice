package com.nir;

import java.util.Arrays;

public class PairOfSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10, -5, 20, 10, 1, 13, 24, 22, 0, 11, 25, -3, 11, 5, 3, 21, 18, 4};
		Logic logic = new Logic();
		logic.printPair(array, 22);
	}

}

class Logic{
	public void printPair(int[] array, int sum) {
		int low = 0;
		int length = array.length-1;
		Arrays.sort(array);
		while(low<length) {
			if(array[low]+array[length] == sum) {
				System.out.println("Pair : " + array[low] + " : " + array[length]);
			}
			if(array[low]+array[length] > sum)
				length--;
			else
				low++;
		}
		
	}	
}