package com.remotetiger.exercise;

public class CircleImpl extends ShapeAbstract implements Comparable {
    private  double radius;
    final double pi = Math.PI;
    
    public CircleImpl() {
        this(1);	
    }   
    public CircleImpl(double radius) {
        this.radius = radius;
    }
    
    public boolean equals(Object figure) {
    	
        if (figure == null) {
            return false;
        }
        else if ((figure instanceof CircleImpl)) {
        	
        	
        	if(((CircleImpl) figure).calArea()==this.calArea())
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
    
  

    
    public double calArea() {
       
        return pi * Math.pow(radius, 2);
    }

    public double calPerimeter() {
        // P = 2πr
        return 2 * pi * radius;
    }
	public double getRadius() {
		return radius;
	}
	public double getPi() {
		return pi;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", pi=" + pi + "]";
	}
    
}
