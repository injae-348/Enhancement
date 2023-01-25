import java.util.Random;

public class Object1 {
	
	private int level;
	private int count;
	private int restoreCnt;
	private int fluStoneCnt;	// 스톤이랑 수정 분리 필요
	private int fluCrystalCnt;
	//private boolean isDestruction;
	private boolean hammer;
	
	Object1(){
		level = 0;
		restoreCnt=0;
		fluStoneCnt=0;
		fluCrystalCnt=0;
		setCount(0);
		//setDestruction(true);
		hammer = false;
	}
	
	Object1(int level){
		this.level = level;
		restoreCnt=0;
		fluStoneCnt=0;
		fluCrystalCnt=0;
		setCount(0);
		//setDestruction(true);
		hammer = false;
	}
	
	public void Success() {
		level++;
		System.out.println("강화 성공!");
	}
	
	public void Initialization() {
		level = 0;
		System.out.println("초기화 되었습니다");
	}
	
	public void NoChange() { 
		System.out.println("변함 없음");
	}
	
	public void Destroy() {
		//setDestruction(false);
		System.out.println("파괴 되었습니다");
		restoreCnt++;
	}
	
	public void Drop() {
		if(level!=0) {
			level--;
		}
		System.out.println("1단계 하락했습니다");
	}

	public int getRestoreCnt() {
		return restoreCnt;
	}
	
	public int getFluStoneCnt() {
		return fluStoneCnt;
	}
	
	public int getFluCrystalCnt() {
		return fluCrystalCnt;
	}

	/*
	 * public boolean isDestruction() { return isDestruction; }

	private void setDestruction(boolean isDestruction) {
		this.isDestruction = isDestruction;
	}
	 */
	
	public int getLevel() {
		return level;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}	
	
	public void setHammer(boolean a) {
		hammer = a;
	}
	
	public void Enhancement() {
		// 함수로 좀더 간단하게 압축시키기		
		int rand = getRandomInt();
		setCount(getCount() + 1);
		
		if(hammer==false) {
			if(level==0 || level==1) {
				Success();
			}
			else if(level == 2) {
				if(rand<=9000 && rand>0) {
					Success();
				}
				else {
					NoChange();
				}
			}
			else if(level == 3) {
				if(rand<=8000 && rand>0) {
					Success();
				}
				else {
					NoChange();
				}
			}
			else if(level == 4) {
				if(rand<=7000 && rand>0) {
					Success();
				}
				else {
					NoChange();
				}
			}
			else if(level == 5) {
				if(rand<=6000 && rand>0) {
					Success();
				}
				else {
					NoChange();
				}
			}
			else if(level == 6) {
				if(rand<=2000 && rand>0) {
					Success();
				}
				else {
					NoChange();
				}
			}
			else if(level == 7) {
				if(rand<=500 && rand>0) {
					Success();
				}
				else if(rand>500 && rand<=2000) {
					NoChange();
				}
				else if(rand>2000 && rand<=5000) {
					Drop();
				}
				else {
					Initialization();
				}
			}
			else if(level == 8) {
				if(rand<=200 && rand>0) {
					Success();
				}
				else if(rand>200 && rand<=2200) {
					Destroy();
				}
				else if(rand>2200 && rand<=3200) {
					NoChange();
				}
				else if(rand>3200 && rand<=6000) {
					Drop();
				}
				else {
					Initialization();
				}
			}
			else if(level == 9) {
				if(rand<=100 && rand>0) {
					Success();
				}
				else if(rand>100 && rand<=2600) {
					Destroy();
				}
				else if(rand>2600 && rand<=3300) {
					NoChange();
				}
				else if(rand>3300 && rand<=6000) {
					Drop();
				}
				else {
					Initialization();
				}
			}
			else if(level == 10) {
				if(rand<=70 && rand>0) {
					Success();
				}
				else if(rand>70 && rand<=3600) {
					Destroy();
				}
				else if(rand>3600 && rand<=4300) {
					NoChange();
				}
				else if(rand>4300 && rand<=7000) {
					Drop();
				}
				else {
					Initialization();
				}
			}
			else if(level == 11) {
				if(rand<=100 && rand>0) {
					Success();
				}
				else if(rand>100 && rand<=2600) {
					Destroy();
				}
				else if(rand>2600 && rand<=3300) {
					NoChange();
				}
				else if(rand>3300 && rand<=6000){
					Drop();
				}
				else {
					Initialization();
				}
			}
			else if(level == 12) {
				if(rand<=100 && rand>0) {
					Success();
				}
				else if(rand>100 && rand<=3000) {
					Destroy();
				}
				else if(rand>3000 && rand<=3300) {
					NoChange();
				}
				else if(rand>3300 && rand<=6000){
					Drop();
				}
				else {
					Initialization();
				}
			}
		}
		else {
			if(level>=0 && level<6) {
				Success();
			}	
			else if(level == 6) {
				if(rand<=4000 && rand>0) {
					Success();
				}
				else {
					NoChange();
				}
			}
			else if(level == 7) {
				if(rand<=1000 && rand>0) {
					Success();
				}
				else if(rand>1000 && rand<=2000) {
					NoChange();
				}
				else if(rand>2000 && rand<=5000) {
					Drop();
				}
				else {
					Initialization();
				}
			}
			else if(level == 8) {
				if(rand<=400 && rand>0) {
					Success();
				}
				else if(rand>400 && rand<=2400) {
					Destroy();
				}
				else if(rand>2400 && rand<=3200) {
					NoChange();
				}
				else if(rand>3200 && rand<=6000) {
					Drop();
				}
				else {
					Initialization();
				}
			}
			else if(level == 9) {
				if(rand<=200 && rand>0) {
					Success();
				}
				else if(rand>200 && rand<=2700) {
					Destroy();
				}
				else if(rand>2700 && rand<=3300) {
					NoChange();
				}
				else if(rand>3300 && rand<=6000) {
					Drop();
				}
				else {
					Initialization();
				}
			}
			else if(level == 10) {
				if(rand<=140 && rand>0) {
					Success();
				}
				else if(rand>140 && rand<=3670) {
					Destroy();
				}
				else if(rand>3670 && rand<=4300) {
					NoChange();
				}
				else if(rand>4300 && rand<=7000) {
					Drop();
				}
				else {
					Initialization();
				}
			}
			else if(level == 11) {
				if(rand<=200 && rand>0) {
					Success();
				}
				else if(rand>200 && rand<=2700) {
					Destroy();
				}
				else if(rand>2700 && rand<=3300) {
					NoChange();
				}
				else if(rand>3300 && rand<=6000){
					Drop();
				}
				else {
					Initialization();
				}
			}
			else if(level == 12) {
				if(rand<=200 && rand>0) {
					Success();
				}
				else if(rand>200 && rand<=3100) {
					Destroy();
				}
				else if(rand>3100 && rand<=3300) {
					NoChange();
				}
				else if(rand>3300 && rand<=6000){
					Drop();
				}
				else {
					Initialization();
				}
			}
		}
	}
	
	public void FluStoneEnhancement() {
		// 함수로 좀더 간단하게 압축시키기		
		fluStoneCnt++;
		int rand = getRandomInt();
		setCount(getCount() + 1);
		//System.out.print(rand);
		if(hammer == false) {			
			if(level == 7) {
				if(rand<=500 && rand>0) {
					Success();
				}
				else {
					NoChange();
				}
				
			}
			else if(level == 8) {
				if(rand<=200 && rand>0) {
					Success();
				}
				else if(rand>200 && rand<=2200) {
					Destroy();		
				}
				else {
					NoChange();
				}
			}
			else if(level == 9) {
				if(rand<=100 && rand>0) {
					Success();
				}
				else if(rand>100 && rand<=2600) {
					Destroy();
				}
				else {
					NoChange();
				}
				
			}
			else if(level == 10) {
				if(rand<=70 && rand>0) {
					Success();
				}
				else if(rand>70 && rand<=3600) {
					Destroy();
				}
				else {
					NoChange();
				}
			}
		}
		else {
			if(level == 7) {
				if(rand<=1000 && rand>0) {
					Success();
				}
				else {
					NoChange();
				}
				
			}
			else if(level == 8) {
				if(rand<=400 && rand>0) {
					Success();
				}
				else if(rand>400 && rand<=2400) {
					Destroy();		
				}
				else {
					NoChange();
				}
			}
			else if(level == 9) {
				if(rand<=200 && rand>0) {
					Success();
				}
				else if(rand>200 && rand<=2700) {
					Destroy();
				}
				else {
					NoChange();
				}
				
			}
			else if(level == 10) {
				if(rand<=140 && rand>0) {
					Success();
				}
				else if(rand>140 && rand<=3670) {
					Destroy();
				}
				else {
					NoChange();
				}
			}
		}
	}
	
	public void FluCrystalEnhancement() {
		int rand = getRandomInt();
		setCount(getCount() + 1);
		fluCrystalCnt++;
		
		if(hammer==false) {			
			if(level == 11) {
				if(rand<=100 && rand>0) {
					Success();
				}
				else if(rand>100 && rand<=2600) {
					Destroy();
				}
				else if(rand>2600 && rand<=3300) {
					NoChange();
				}
				else if(rand>3300 && rand<=6000) {
					Drop();
				}
				else {
					NoChange();
				}
			}
			else if(level == 12) {
				if(rand<=100 && rand>0) {
					Success();
				}
				else if(rand>100 && rand<=3000) {
					Destroy();
				}
				else if(rand>3000 && rand<=3300) {
					NoChange();
				}
				else if(rand>3300 && rand<=6000) {
					Drop();
				}
				else {
					NoChange();
				}
			}	
		}
		else {
			if(level == 11) {
				if(rand<=200 && rand>0) {
					Success();
				}
				else if(rand>200 && rand<=2700) {
					Destroy();
				}
				else if(rand>2700 && rand<=3300) {
					NoChange();
				}
				else if(rand>3300 && rand<=6000) {
					Drop();
				}
				else {
					NoChange();
				}
			}
			else if(level == 12) {
				if(rand<=200 && rand>0) {
					Success();
				}
				else if(rand>200 && rand<=3100) {
					Destroy();
				}
				else if(rand>3100 && rand<=3300) {
					NoChange();
				}
				else if(rand>3300 && rand<=6000) {
					Drop();
				}
				else {
					NoChange();
				}
			}		
		}
	}
	
	private int getRandomInt() {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		return random.nextInt(10000)+1;
	}
	
	public void Print() {
		System.out.println("현재 상태");
		System.out.println("강화 단계 : " + level);
	}

	
}
