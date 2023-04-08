package com.workshop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Ball in the Bag problem.");
		
		Bag bag = new Bag();
		
		char cont = 'y';
		while(cont == 'y' || cont =='Y') {
			System.out.println("Press\n 1: To add GREEN ball\n 2: To add RED ball\n "
					+ "3: To add YELLOW ball\n 4: To add BLUE ball\n 5: To print present status of bag.");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:{
				bag.addBallToBag(new Ball("Green"));
				break;
			}
			case 2:{
				bag.addBallToBag(new Ball("Red"));
				break;
			}
			case 3:{
				bag.addBallToBag(new Ball("Yellow"));
				break;
			}
			case 4:{
				bag.addBallToBag(new Ball("Blue"));
				break;
			}
			case 5:{
				bag.showBalls(bag.ballsInBag);
				break;
			}
			default:{
				System.out.println("Invalid selection.");
				break;
			}
				
			}
			System.out.println("Press 'y' or 'Y' to continue: ");
            cont = scan.next().charAt(0);
		}

	}

}
