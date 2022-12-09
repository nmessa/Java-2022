/**
 * @(#)Line.java
 *
 *
 * @author 
 * @version 1.00 2022/12/14
 */


public class Line {

	private double slope;
	private double intercept;
	private boolean infiniteSlope;
	private double x;
	
	//Point-slope constructor
    public Line(double x, double y, double m) {
    	slope = m;
    	intercept = -slope*x + y;
    	infiniteSlope = false;
    }
    
    //Two point constructor
    public Line(double x1, double y1, double x2, double y2) {
    	slope = (y2-y1)/(x2-x1);
    	intercept = -slope*x1 + y1;
    	infiniteSlope = false;
    }
    
    //slope-intercept constructor
    public Line(double m, double i) {
    	slope = m;
    	intercept = i;
    	infiniteSlope = false;
    }
    
    //vertical line constructor
    public Line(double a) {
    	infiniteSlope = true;
    	x = a;
    }
    
    public boolean intersects(Line other){
    	if (infiniteSlope ||other.infiniteSlope)
    	{
    		if (infiniteSlope == other.infiniteSlope)
    			return false;
    		else
    			return true;
    	}
   
    	if (slope != other.slope)
    		return true;
    	else
    		return false;
    }
    
    public boolean equals(Line other){
    	if (infiniteSlope || other.infiniteSlope)
    	{
    		if (infiniteSlope == other.infiniteSlope && x == other.x)
    			return true;
    		else
    			return false;
    	}
    	
    	if (slope == other.slope && intercept == other.intercept)
    		return true;
    	else
    		return false;
    }
    
    public boolean isParallel(Line other){
    	if (infiniteSlope || other.infiniteSlope)
    	{
    		if (infiniteSlope == other.infiniteSlope)
    			return true;
    		else
    			return false;
    	}
    		
    	if (slope == other.slope)
    		return true;
    	else
    		return false;
    }
    
}