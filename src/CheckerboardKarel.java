/*
 * TODO: problem 3  棋盘
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
	// TODO: create a checkerboard pattern of beepers
	
	public void run() {
		putByLine();
		while(moveToUpOneStep()){
			putByLine();
		}
	}
	
	public void putByLine(){
		boolean putedFlag = false;
		while(true){
			if(!putedFlag){
				putBeeper();
				putedFlag = true;
			}
			else{
				putedFlag = false;
			}
			if(frontIsClear()){
				move();
			}
			else{
				break;
			}
		}
		
	}
	
	//向上走一行
	public boolean moveToUpOneStep(){
		boolean isUp = false;
		//面朝东，左转
		if(facingEast()){
			if(leftIsClear()){
				turnLeft();
				move();
				turnLeft();
				isUp = true;
			}
		}
		//面朝西，右转
		else if(facingWest()){
			if(rightIsClear()){
				turnRight();
				move();
				turnRight();
				isUp = true;
			}
		}
		return isUp;
	}

}
