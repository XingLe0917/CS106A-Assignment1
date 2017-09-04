/*
 * TODO: problem 1 捡报纸
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	
	// TODO: write the code to implement this program
	
	/*
	 * The problem you need to get Karel to solve is to collect the 
	 * newspaper—represented (as all objects in Karel’s world are) by a beeper—from outside the doorway 
	 * and then to return to its initial position, facing east.
	 */
	
	public void run(){
//		moveToNewspaper();
		moveToOutside();
		pickBeeper();
		moveToInitail();	
	}
	
	/*
	 * 移动到门外
	 */
	private void moveToOutside() {
		while(leftIsBlocked()){
			if(frontIsClear()){
				move();
			}
			else{
				turnRight();
			}
		}
		turnLeft();
		move();
	}
	
	/*
	 * 走到要收集的报纸位置
	 */
	private void moveToNewspaper() {
		moveToWall();
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	/*
	 * 移动到原始位置
	 */
	private void moveToInitail() {
		turnRight();
		moveToWall();
		turnRight();
		moveToWall();
		turnAround();
	}
	
	/*
	 * 向前走到墙
	 */
	private void moveToWall() {
		while(frontIsClear()){
			move();
		}
	}

}
