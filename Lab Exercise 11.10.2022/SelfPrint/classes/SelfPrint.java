/**
 * @(#)SelfPrint.java
 *
 * SelfPrint application
 *
 * @author 
 * @version 1.00 2020/11/30
 */

import java.util.*;
import java.io.*;

public class SelfPrint {
    
    public static void main(String[] args) throws IOException{
    	
    	Scanner sf = new Scanner(new File("SelfPrint.java"));
        String temp;
        while (sf.hasNext())
        {
        	temp = sf.nextLine();
        	System.out.println(temp);
        }
        sf.close();
    }
}
