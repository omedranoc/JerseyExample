package com.remotetiger.exercise;


public class RectangleImpl extends ShapeAbstract implements Comparable  {
    private  double width, length; //sides

    public RectangleImpl(double width, double lenght )
    {
    	this.width=width;
    	this.length=lenght;
    }
    public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
    public double calArea() {
        // A = w * l
        return width * length;
    }


    
    @Override
    public boolean equals(Object figure) {
    	
        if (figure == null) {
            return false;
        }
        else if ((figure instanceof RectangleImpl)) {
        	
        	
        	if(((RectangleImpl) figure).calArea()==this.calArea())
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
    
    
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
    
    

}