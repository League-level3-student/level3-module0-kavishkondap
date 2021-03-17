package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String [] foods = {"chocolate", "chicken", "crackers", "croissant", "fries"};
        // 2. print the third element in the array
    	System.out.println(foods[2]);
        // 3. set the third element to a different value
    	foods[2] = "rice";
        // 4. print the third element again
System.out.println(foods [2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for (int i = 0; i < foods.length; i++) {
	foods[i] = "FOOOODDDDDD";
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for (int i = 0; i < foods.length; i++) {
	System.out.println(foods[i]);
}
        // 7. make an array of 50 integers
int [] nums = new int [50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
for (int i = 0; i < nums.length; i++) {
	nums [i] = (int) (Math.random() * 1000);
}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
int smallest = nums [0];
for (int i = 0; i < nums.length; i++) {
	if (nums[i]<smallest) {
		smallest = nums [i];
	}
}
System.out.println(smallest);
        // 10 print the entire array to see if step 8 was correct
for (int i = 0; i < nums.length; i++) {
	System.out.println(nums[i]);
}
System.out.println("END OF ARRAY");
        // 11. print the largest number in the array.
int largest = nums [0];
for (int i = 0; i < nums.length; i++) {
	if (nums[i]>largest) {
		largest = nums [i];
	}
}
System.out.println(largest);
        // 12. print only the last element in the array
System.out.println(nums [49]);
    }
}
