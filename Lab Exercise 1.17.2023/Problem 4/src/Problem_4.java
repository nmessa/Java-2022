/**
 * @(#)Problem_4.java
 *
 * Problem_4 application
 *
 * @Author:  
 * @version 1.00 2023/1/17
 */
 
public class Problem_4 {
    
    public static void main(String[] args) {
    	
    	int[] arr = {1, 4, 17, 7, 25, 3, 100};
    	double average;
    	average = calAverage(arr);
    	System.out.println("The average of the array is " + average);
    	System.out.println("The numbers in the array grater than average:");
    	printLarge(arr, average);
    }
    
    public static double calAverage(int[] a)
    {
    	//Add code here
    	
    }
    
    public static void printLarge(int[] a, double avg)
    {
    	//Add code here
    	
    }
}

//Output
//The average of the array is 22.428571428571427
//The numbers in the array grater than average:
//25
//100
