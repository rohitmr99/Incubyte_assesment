package com.calci.main;

import java.util.Scanner;

public class client {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
        // Test with Integer
        calculatorInterface<Integer> integerAddable = new calciIntegerImpl();
        int result1 = integerAddable.add(5, 3);
        System.out.println("Integer Result: " + result1);

        // Test with Double
        calculatorInterface<Double> doubleAddable = new calciDoubleImpl();
        double result2 = doubleAddable.add(2.5, 3.7);
        System.out.println("Double Result: " + result2);

        // Test with String
        calculatorInterface<String> stringAddable = new calciStringImpl();
        String result3 = stringAddable.add("Hello, ", "World!");
        System.out.println("String Result: " + result3);
    }
}
