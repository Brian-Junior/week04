package week04;

import java.lang.reflect.Array;

public class CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question 1	
	//A										B	added 2 additional values to change output from 90 to 32
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 29, 35};
		
		System.out.println(ages[ages.length -1] - ages[0]);
	// End of a	
		
	//C
		double sum =0;
		for (int number : ages) {
			sum += number;
		}
		double average =sum / ages.length;
		System.out.println(average);
	//End of C 
		//End of question 1
		
// Question 2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	//A
		
		int nameLength = 0;
		int numNames = Array.getLength(names);
		int avg;
		
		for (String name : names) {
			nameLength += name.length();
		}
		avg = nameLength / numNames;
		System.out.println(avg);
	//End of A
	
	//B	
		
		for (String name :names) {
			System.out.print(name + " ");
		
		}
		System.out.println();
	//End of B	
		
// Question 3
 // With an operator such as this ages[ages.length -1] listed above 	
		
//Question 4
	//	With an operator such as this ages[0] listed above as an array will always start at 0

// Question 5
 	int[] nameLengths = new int[names.length];	
	for (int i=0; i < names.length; i++) {
		nameLengths[i] += names [i].length();
	}
 			
 			
 //Question 6
 			int sum2 =0;
	for (int number : nameLengths) {
		sum2 += number;
	}
	System.out.println(sum2);			

		
		
//Question 7
	System.out.println(repeatWord("Hello", 3));

	
	
//Question 8
	String firstName ="Brian";
	String lastName = "Junior";
	String fullName = showFullName(firstName, lastName);
	
	System.out.println(fullName);

	
	
//Question 9
	System.out.println(intSum(ages));
	
	
	
//Question 10
	double [] doubles = {45.7, 30.2, 67.3};
	System.out.println(calculateAverage(doubles));
	
	

// Question 11	
	double [] arr1 = {45.7, 30.2, 97.3}; 
	double [] arr2 = {45.7, 30.2, 67.3};
	System.out.println(matchingArray(arr1,arr2));
	
	
//Question 12	
	
	System.out.println(willBuyDrink (true, 12.50));
	
	
//Question 13
	System.out.println(rideMotorcycle (40));
	
	}	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//Question 7 method
	
	public static String repeatWord(String str, int num) {
	String result = "";	
	for (int i = 0; i < num; i++) {
	    result += str;
	}
	return result;
	}
	
	
//Question 8 method
	public static String showFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
//Question 9 method	
	public static boolean intSum (int[] numbers) {
		int sum = 0;
		for (int number :numbers) {
			sum += number;
		}
		return sum > 100;
	}
// question 10 method
	
	public static double calculateAverage(double[] array) {
		double sum=0;
				for (double number : array) {
					sum += number;
				}
				return sum / array.length;
	}
//Question 11 method
	
	public static boolean matchingArray (double [] array1, double [] array2) {
	return calculateAverage(array1) > calculateAverage(array2);
			
		//for (double dub : array1) {
			//if (dub.equals (array2)) {
		//		return true;
			//}
		//}
		//return false;
		}
	
	
// Question 12 method
 public static boolean willBuyDrink (boolean isHotOutside,double moneyInPocket) {
	 if (isHotOutside ==true && moneyInPocket > 10.50) {
		 return true;
		 
	 }else {
		 return false;
	 }
	 
 }
	
	
	
// Question 13 method
	public static String rideMotorcycle  (int temp) {
	
		 
		 
		if(temp >= 60 && temp <= 100) {
		return("Lets Ride!");
		}else {
			return("Maybe some other time");				
	}
	
	}
	
}
