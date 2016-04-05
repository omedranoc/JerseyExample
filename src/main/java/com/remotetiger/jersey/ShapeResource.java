package com.remotetiger.jersey;

import java.util.ArrayList;
import javax.inject.Singleton;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.remotetiger.exercise.CircleImpl;

import com.remotetiger.exercise.RectangleImpl;
import com.remotetiger.exercise.Shape;
import com.remotetiger.exercise.SquareImpl;
import com.remotetiger.exercise.TriangleImpl;
import com.remotetiger.forms.ResultDto;



@Path("shapes")
@Singleton 

public class ShapeResource {
	
	private ArrayList<ResultDto> resultAll = new ArrayList<ResultDto>();
	
	
  
	
	
	@GET
	@Path("square")
	@Produces(value={MediaType.APPLICATION_JSON})
	public ResultDto calcSquare(@QueryParam("value") double value){
		ResultDto resultForm= new ResultDto();
		Shape squareImpl=new SquareImpl(value);
		System.out.println(value);
		resultForm.setName("Square");	
		resultForm.setArea(squareImpl.calArea());
		
		for (ResultDto resultDto : resultAll) {
			 if(resultForm.getName().equals(resultDto.getName())&(resultForm.getArea()==resultDto.getArea()))
		          resultForm.setEqual(true);
		      
		}
		resultAll.add(resultForm);
		return resultForm;
		
		
		
	}
	@GET
	@Path("circle")
	@Produces(value={MediaType.APPLICATION_JSON})
	public ResultDto calCircle(@QueryParam("radio") double radio){
		ResultDto resultForm= new ResultDto();
		Shape circleImpl=new CircleImpl(radio);
		System.out.println(radio);
		resultForm.setName("Circle");	
		resultForm.setArea(circleImpl.calArea());
		
		for (ResultDto resultDto : resultAll) {
			 if(resultForm.getName().equals(resultDto.getName())&(resultForm.getArea()==resultDto.getArea()))
		          resultForm.setEqual(true);
		      
		}
		resultAll.add(resultForm);
		return resultForm;
		
		
		
	}
	@GET
	@Path("rectangle")
	@Produces(value={MediaType.APPLICATION_JSON})
	public ResultDto calRectangle(@QueryParam("width") double width,@QueryParam("length") double length){
		ResultDto resultForm= new ResultDto();
		Shape rectangleImpl=new RectangleImpl(width, length);
		System.out.println(rectangleImpl);
		resultForm.setName("Rectangle");	
		resultForm.setArea(rectangleImpl.calArea());
		
		for (ResultDto resultDto : resultAll) {
			 if(resultForm.getName().equals(resultDto.getName())&(resultForm.getArea()==resultDto.getArea()))
		          resultForm.setEqual(true);
		      
		}
		resultAll.add(resultForm);
		return resultForm;
		
		
		
	}
	@GET
	@Path("triangle")
	@Produces(value={MediaType.APPLICATION_JSON})
	public ResultDto calTriangle(@QueryParam("a") double a,@QueryParam("b") double b,@QueryParam("c") double c){
		ResultDto resultForm= new ResultDto();
		Shape triangleImpl=new TriangleImpl(a,b,c);
		System.out.println(triangleImpl);
		resultForm.setName("Triangle");	
		resultForm.setArea(triangleImpl.calArea());
		
		for (ResultDto resultDto : resultAll) {
			 if(resultForm.getName().equals(resultDto.getName())&(resultForm.getArea()==resultDto.getArea()))
		          resultForm.setEqual(true);
		      
		}
		resultAll.add(resultForm);
		return resultForm;
		
		
	}
	
		
	

	
	@GET
	@Path("allShapes")
	@Produces(value={MediaType.APPLICATION_JSON})
	public ArrayList<ResultDto> getAllBooks(){
		return  resultAll;
	}
	
	
	
	
}
