package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
public static void main(String[] args) {
	

        // 2. create an array of 5 robots.
Robot [] bobs = new Robot [5];
boolean raceOver = false;
        // 3. use a for loop to initialize the robots.
for (int i = 0; i < bobs.length; i++) {
	bobs [i] = new Robot ();
	//bobs [i].turn(90);
}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
    for (int i = 0; i < bobs.length; i++) {
		bobs [i].moveTo(850, 300);
		bobs [i].setSpeed(1000);
	}
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    if (!raceOver) {
	    for (int j = 0; j < bobs.length; j++) {
	    	while (!(bobs[j].getX() > 800 && bobs[j].getX() < 900 && bobs [j].getY() > 250 && bobs [j].getY() > 350)){
	    		if (!raceOver) {
	    	    for (int i = 0; i < bobs.length; i++) {
	    	    	int movement = (int) (Math.random()*300+100);
	    			for (int k = 0; k <= movement; k++) {
						bobs [i].move(1);
						if (k % 4 ==0) {
						bobs[i].turn(-1);
						}
					}
	    			if (bobs[i].getY()< 50) {
	    				JOptionPane.showMessageDialog(null, "Robot " + (i+1) + " has won!!! \nPARTY!!!!!!");
	    				raceOver = true;
	    				break;
	    				//break;
	    				
	    			}
	    			
	    		}
	    		}
	    	}
		}
    }
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
	}
}
