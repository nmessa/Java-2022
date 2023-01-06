/**
 * @(#)Problem_2.java
 *
 * Problem_2 application
 *
 * @Author: nmessa 
 * @version 1.00 2023/1/11
 */
 
public class Problem_2 {
    
    public static void main(String[] args) {
    	
    	int[] array1 = {50, -20, 0, 30, 40, 60, 12};
    	int[] array2 = {45, 20, 10, 20, 30, 50, 12};
    	int[] array3 = {25, -20, 0, 30, 40, 60, 12};
    	int[] array4 = {45, 20, 10, 20, 30, 50, 11};
    	System.out.println(same(array1, array2));
    	System.out.println(same(array2, array4));
    	System.out.println(same(array1, array4));
    }
    
    static boolean same(int[] a1, int[] a2)
    {
    	if (a1[0] == a2[0] || a1[a1.length - 1] == a2[a2.length - 1])
    		return true;
    	else
    		return false;
    }
}
