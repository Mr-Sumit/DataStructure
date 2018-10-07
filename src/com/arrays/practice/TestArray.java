package com.arrays.practice;

public class TestArray {

	public static void main(String[] args) {
		
		int[] arr = { 1, 0, 3, 4, 5 };
		int multiply = 1;
		boolean containZero = false;
		for (int i : arr) {
			if (i == 0) {
				containZero = true;
				continue;
			}
			multiply *= i;
		}
		if (!containZero) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (multiply / (i + 1));
			}
		} else {
			for (int i = 0; i < arr.length; i++) 
				arr[i] = arr[i] == 0 ? multiply : 0;
			}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}