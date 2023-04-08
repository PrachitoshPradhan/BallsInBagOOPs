package com.workshop;

import java.util.ArrayList;
import java.util.List;

public class Bag {
	
	List<Ball> ballsInBag = new ArrayList<>(12); //defining the size of array list to be 12
	
	int greenBallCount = 0;
	int blueBallCount = 0;
	int redBallCount = 0;
	int yellowBallCount = 0;
	
	void addBallToBag(Ball ball) {
		
		int total = greenBallCount + redBallCount + yellowBallCount + blueBallCount;
		
		if(total != 12) {
			if(ball.ballColour.equals("Blue") && blueBallCount < 12) {
				ballsInBag.add(ball);
				blueBallCount++;
			}
			else if(ball.ballColour.equals("Green")) {
				if(greenBallCount <= 3 || greenBallCount==0) {
					ballsInBag.add(ball);
					greenBallCount++;
				}else {
					System.out.println("Green ball count: " + greenBallCount + ". Limit reached. Add different coloured ball.");				}
			}
			else if(ball.ballColour.equals("Red")) {
				if(redBallCount < (2 * greenBallCount)) {
					ballsInBag.add(ball);
					redBallCount++;
				}else {
					 System.out.println("Red Ball count would become : " + (redBallCount+1) + " " +
	                            "" + " which is greater than twice of the Green Ball count " + greenBallCount);
				}
			}else if(ball.ballColour.equals("Yellow")) {
				if(yellowBallCount < 4) {
					ballsInBag.add(ball);
					yellowBallCount++;
				}else {
					System.out.println("Yellow Ball Count: " + yellowBallCount + " limit reached. Add different ball.");
				}
			}
		}else {
			 System.out.println("Maximum Limit of Bag is reached that is: " +total);
		}
	}
	
	  void showBalls (List <Ball> bagOfBalls) {
          System.out.println(bagOfBalls);
      }
  }
	

