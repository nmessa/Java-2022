/**
 * @(#)PerfectNumber.java
 *
 * PerfectNumber application
 *
 * @Author: nmessa
 * @version 1.00 2022/10/6
 */
 
public class PerfectNumber {
    
    public static void main(String[] args) {
    	//Test all numbers from 1 to 10000 to find if perfect
    	for (int number = 1; number <= 10000; number++)
    		if (isPerfect(number))
    			System.out.print(number + " ");
    }
    
    public static boolean isPerfect(int n){
    	int total = 0;
    	
    	//Add up all of the divisors of n
    	//Add code here
    	
    	
    	//If the total of the divisors equals n, return true else return false
    	//Add code here
    	
    	
    }
}

//Output
//6 28 496 8128 