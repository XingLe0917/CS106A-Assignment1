/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	// TODO: 修复损坏的拱桥
	public void run() {
		boolean flag = true;
		while(flag){
			putBeeperInLine();
			for(int i= 0;i<4;i++){
				if(frontIsClear()){
					move();
				}
				else{
					flag = false;
					break;
				}
			}
		}
	}
		
	/*
	 * 向上放置一竖排的石块，然后回到最下方位置
	 */
	private void putBeeperInLine() {
		turnLeft();
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
		}
		if(frontIsBlocked()){
			turnAround();
			while(frontIsClear()){
				move();
			}
		}
		turnLeft();
	}

}
