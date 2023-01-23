import java.util.Random;

public class Object1 {
	
	private int level;
	private int count;
	private int restoreCnt;
	private int fluCnt;	// 스톤이랑 수정 분리 필요
	private boolean isDestruction;

	Object1(){
		level = 0;
		restoreCnt=0;
		fluCnt=0;
		setCount(0);
		setDestruction(true);
	}
	
	Object1(int level){
		level = this.level;
		restoreCnt=0;
		fluCnt=0;
		setCount(0);
		setDestruction(true);
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
		setDestruction(false);
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
	
	public int getFluCnt() {
		return fluCnt;
	}
	
	public boolean isDestruction() {
		return isDestruction;
	}

	private void setDestruction(boolean isDestruction) {
		this.isDestruction = isDestruction;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void Enhancement() {
		// 함수로 좀더 간단하게 압축시키기		
		int rand = getRandomInt();
		setCount(getCount() + 1);
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
			else if(rand>200 && rand<=1200) {
				NoChange();
			}
			else if(rand>1200 && rand<=4000) {
				Drop();
			}
			else if(rand>4000 && rand<=6000) {
				Destroy();
			}
			else {
				Initialization();
			}
		}
		else if(level == 9) {
			if(rand<=100 && rand>0) {
				Success();
			}
			else if(rand>100 && rand<=2800) {
				Drop();
			}
			else if(rand>2800 && rand<=3500) {
				NoChange();
			}
			else if(rand>3500 && rand<=6000) {
				Destroy();
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
			else if(rand>100 && rand<=4800) {
				NoChange();
			}
			else if(rand>4800 && rand<=7500) {
				Drop();
			}
			else {
				Destroy();
			}
		}
		else if(level == 12) {
			if(rand<=100 && rand>0) {
				Success();
			}
			else if(rand>100 && rand<=4400) {
				NoChange();
			}
			else if(rand>4400 && rand<=7100) {
				Drop();
			}
			else {
				Destroy();
			}
		}
	}
	
	public void FluEnhancement() {
		// 함수로 좀더 간단하게 압축시키기		
		fluCnt++;
		int rand = getRandomInt();
		setCount(getCount() + 1);
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
			else {
				NoChange();
			}
			
		}
		else if(level == 8) {
			if(rand<=200 && rand>0) {
				Success();
			}
			else if(rand>200 && rand<=8000) {
				NoChange();
			}
			else {
				Destroy();
			}
			
		}
		else if(level == 9) {
			if(rand<=100 && rand>0) {
				Success();
			}
			else if(rand>100 && rand<=7500) {
				NoChange();
			}
			else {
				Destroy();
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
		else if(level == 11) {
			if(rand<=100 && rand>0) {
				Success();
			}
			else if(rand>100 && rand<=2800) {
				Drop();
			}
			else if(rand>2800 && rand<=3500) {
				NoChange();
			}
			else if(rand>3500 && rand<=6000) {
				Destroy();
			}
			else {
				Initialization();
			}
		}
		else if(level == 12) {
			if(rand<=100 && rand>0) {
				Success();
			}
			else if(rand>100 && rand<=2800) {
				Drop();
			}
			else if(rand>2800 && rand<=3100) {
				NoChange();
			}
			else if(rand>3100 && rand<=6000) {
				Destroy();
			}
			else {
				Initialization();
			}
		}
	
	}
	
	private int getRandomInt() {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		return random.nextInt(100000)+1;
	}
	
	public void Print() {
		System.out.println("현재 상태");
		System.out.println("강화 단계 : " + level);
		if(isDestruction==true) {
			System.out.println("파괴 여부 : " + "강화 가능");			
		}
		else {
			System.out.println("파괴 여부 : " + "파괴");				
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
