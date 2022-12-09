/**
 * @(#)PermutationLock.java
 *
 *
 * @nmessa 
 * @version 1.00 2022/12/14
 */


public class PermutationLock {
	private char one;
	private char two;
	private char three;
	private boolean locked;
	
    public PermutationLock(char n1, char n2, char n3)
    {
    	one = n1;
    	two = n2;
    	three = n3;
    	locked = true;
    }
    
    public void openLock(String perm)
    {
    	char p1, p2, p3;
    	if (!locked)
    	{
    		System.out.println("Lock already open");
    		return;
    	}
    	int len = perm.length();
    	p1 = perm.charAt(len-3);
    	p2 = perm.charAt(len-2);
    	p3 = perm.charAt(len-1);
    	if (one == p1 && two == p2 && three == p3)
    	{
    		locked = false;
    		System.out.println("Lock Opened");
    	}
    	else
    	{
    		System.out.println("Invalid permutation");
    	}
    }
    
    
    
}