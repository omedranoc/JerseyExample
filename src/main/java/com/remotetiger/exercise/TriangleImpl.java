package com.remotetiger.exercise;

public class TriangleImpl extends ShapeAbstract implements Comparable {
    private  double a, b, c; // sides
  public TriangleImpl(double a, double b, double c)
  {
	  this.a=a;
	  this.b=b;
	  this.c=c;
  }


    public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
    public double calArea() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle 
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	@Override
    public boolean equals(Object figure) {
    	
        if (figure == null) {
            return false;
        }
        else if ((figure instanceof TriangleImpl)) {
        	
        	
        	if(((TriangleImpl) figure).calArea()==this.calArea())
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
    
	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
    
}