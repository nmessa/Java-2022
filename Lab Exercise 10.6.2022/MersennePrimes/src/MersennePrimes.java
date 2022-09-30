/**
 * @(#)MersennePrimes.java
 *
 * MersennePrimes application
 *
 * @Author:  
 * @version 1.00 2022/10/6
 */
import java.util.*;

public class MersennePrimes {
    
    public static void main(String[] args) {
    	//Declare 2 integer arrays
    	int numbers[] = new int[8];
    	int mercennes[] = new int[8];
    	
    	//Declare count and set to 0
    	int count = 0;
    	
    	//Test numbers from 2 to 100
    	for (int number = 2; number < 100;number++)
    	{
    		
    		if (isPrime(number))
    		{
    			//Add Mercenne number to array if it is Mercenne
    			if (isMercenne(number))
    			{
    				//Add code here
    				
    			}
    			
    			//Leave the loop once count is 8
    			if(count == 8)
    				break;	
    		}
    	}
    	
    	
    	for (int i = 0; i < numbers.length; i++)
    	{
    		System.out.println(numbers[i] + "   " + mercennes[i]);
    	}
		
    }
    
    //This method returns true if the number is prime
    public static boolean isPrime(int n){
    	for (int i = 2; i < (int)Math.sqrt(n)+1; i++)  //more efficient loop
    	{
    		if (n%i == 0)
    			return false;
    	}
    	return true;
    }
    
    //This method returns true if the number is a Mersenne Prime
    public static boolean isMercenne(int n)
    {
    	int temp = 1;
    	
    	//Calculate Mersenne number
    	for (int i = 1; i <= n; i++)
    		temp *= 2;
    	temp -= 1;
    	
    	if (isPrime(temp))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}	
    }
}

//Output
2   3
3   7
5   31
7   127
13   8191
17   131071
19   524287
31   2147483647