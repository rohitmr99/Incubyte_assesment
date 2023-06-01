package com.calci.main;

import java.util.Scanner;

public class client {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first input: ");
	        String input1 = scanner.nextLine();

	        System.out.print("Enter the second input: ");
	        String input2 = scanner.nextLine();

	        int output1 = checkInputType(input1);
	        int output2 = checkInputType(input2);
	        try
	        {
	        if(output1 != output2)
	        {
	        	System.out.println("Provided inputs are of inconsistent datatypes");
	        	
	        }
	        
	        if(output1 == 0 && output2 ==0 && output1 == output2)
	        {
	        	// Test with Integer
	        	
	        	calculatorInterface<Integer> integerAddable = new calciIntegerImpl();
	            int result1 = integerAddable.add(Integer.parseInt(input1), Integer.parseInt(input2));
	            System.out.println("Integer Result: " + result1);
	        }
	        
	        else if(output1 == 1 && output2 ==1 && output1 == output2)
	        {
	        	// Test with Double
	        	 calculatorInterface<Double> doubleAddable = new calciDoubleImpl();
	             double result2 = doubleAddable.add(Double.parseDouble(input1),Double.parseDouble(input2));
	             System.out.println("Double Result: " + result2);
	        }
	        
	        else if(output1 == -1 && output2 ==-1&& output1 == output2)
	        {
	        	 // Test with String
	            calculatorInterface<String> stringAddable = new calciStringImpl();
	            String result3 = stringAddable.add(input1,input2);
	            System.out.println("String Result: " + result3);
	        }
	        scanner.close();
		
        
	        }
	        catch(Exception e)
	        {
	        	System.out.println("The error is "+ e.getMessage());
	        }

        
       

       
    }

	public static int checkInputType(String input) {
        try {
            int intValue = Integer.parseInt(input);
            return 0;
        } catch (NumberFormatException e1) {
            try {
                double doubleValue = Double.parseDouble(input);
                return 1;
            } catch (NumberFormatException e2) {
            	return -1;
            }
        }
    }
}
