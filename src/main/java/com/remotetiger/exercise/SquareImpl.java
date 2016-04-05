package com.remotetiger.exercise;
public class SquareImpl extends ShapeAbstract implements Comparable {
    private  double width; //sides
    public SquareImpl(double width)
    {
    	this.width=width;
    }
  

    public void setWidth(double width) {
		this.width = width;
	}

	@Override
    public double calArea() {
        // A = w * l
        return width * width;
    }

 
	@Override
	public String toString() {
		return "Square [width=" + width + "]";
	}
	public double getWidth() {
		return width;
	}
	 @Override
	    public boolean equals(Object figure) {
	    	
	        if (figure == null) {
	            return false;
	        }
	        else if ((figure instanceof SquareImpl)) {
	        	
	        	
	        	if(((SquareImpl) figure).calArea()==this.calArea())
	        	{
	        		return true;
	        	}
	        	else
	        	{
	        		return false;
	        	}
	        	
	        	
	        }
	        else
	        {
	       
	        return false;
	        }
	    }
	    

}