
public class Object1 {
	private int level;
	private int count;
	private boolean isDestruction;

	Object1(){
		level = 0;
		setCount(0);
		setDestruction(true);
	}
	
	Object1(int level){
		level = this.level;
		setCount(0);
		setDestruction(true);
	}
	
	public void Success() {
		level++;
	}
	
	public void Initialization() {
		level = 0;
	}
	
	public void NoChange() { 
		
	}
	
	public void Destruct() {
		setDestruction(false);
	}
	
	public void Drop() {
		if(level!=0) {
			level--;
		}
	}

	public boolean isDestruction() {
		return isDestruction;
	}

	public void setDestruction(boolean isDestruction) {
		this.isDestruction = isDestruction;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void Enhancement() {
		setCount(getCount() + 1);
		if(level==0 || level==1) {
			Success();
			System.out.println("강화 성공!");
		}
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
