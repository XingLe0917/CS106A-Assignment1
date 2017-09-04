/*
 * TODO: problem 4 找中间点
 放满整行，分别从两头捡起每次捡起一个，直到只剩最后一个
 */

import stanford.karel.*;

public class MidpointFinderKarel extends SuperKarel {
	
//	// TODO: write the code to implement this program
//	public void run() {
//		putOneLine();
//		while(true){
//			moveToBeeperFront();
//			pickOneSide();
//			
//		}
//		
//	}
//	
//	//把一行填满,除了最两边的
//	private void putOneLine(){
//		while(!frontIsBlocked()){
//			move();
//			putBeeper();
//		}
//		pickBeeper();
//		turnAround();
//	}
//	
//	private void pickOneSide(){	
//			move();
//			pickBeeper();
//			while(frontIsClear()){
//				move();
//			}
//			turnAround();	
//	}
//	
//	//移动到beeper的前面
//	private void moveToBeeperFront(){
//		while(frontIsClear()){
//			move();
//			if(beepersPresent()){
//				turnAround();
//				move();
//				turnAround();
//				break;
//			}
//		}
//	}
//	
//	private boolean isHaveOnFront(){
//		boolean flag = false;
//		if(frontIsClear()){
//			move();
//			if(beepersPresent()){
//				turnAround();
//				move();
//				turnAround();
//				return true;
//			}
//		}
//		return flag;
//	}
	
	 public void run() {
	        putOneLine();    //fill the 1st street with beepers except 1st and the last avenues.
	        turnBack();        
	        //pick up beside beepers
	        while (beepersPresent()) {
	            pickBesideBeeper();
	            move();
	        }
	        //put one beeper at the middle point
	        turnBack();
	        putBeeper();
	    }

	    private void putOneLine() {
	        move();
	        while (frontIsClear()) {
	            putBeeper();
	            move();
	        }
	    }
	    
	    private void pickBesideBeeper() {
	        while (beepersPresent()){
	            move();
	        }
	        turnBack();
	        pickBeeper();
	    }
	    
	    private void turnBack() {
	        turnAround();
	        move();
	    }
	

	
}
