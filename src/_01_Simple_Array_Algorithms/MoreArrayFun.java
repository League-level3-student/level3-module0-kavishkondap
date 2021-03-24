package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
	
	}

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void stringPrinter (String [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	public static void stringPrinterBackwards (String [] arr) {
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
		
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void alternatingStringPrinter (String [] arr) {
		for (int i = 0; i < arr.length; i+=2) {
			System.out.println(arr[i]);
		}
		
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomStringPrinter (String [] arr) {
		ArrayList <String> list  = new ArrayList ();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.shuffle(list);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(list.get (i));
		}
		
	}

}
