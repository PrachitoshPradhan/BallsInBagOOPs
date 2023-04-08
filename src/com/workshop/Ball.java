package com.workshop;

public class Ball {
	
	String ballColour ;
	
	public Ball(String ballColour) {
		this.ballColour = ballColour;
	}
	
	
	@Override
	public String toString() {
		return "Ball{" +  "Color='" + ballColour + '\'' +  '}';
		
	}
	

}
