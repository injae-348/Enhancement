import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Object1 obj = null;
		System.out.print("강화하시겠습니까? (Y/N)\nY = yes, N = no \ny 또는 n을 입력해주세요 : ");
		int k = br.read();	// y또는 Y의 아스키 코드면 실행
		if(k==89 || k==121) {
			br.readLine();
			System.out.println("강화할 단계를 입력해주세요 ( 0강 ~ 13강 )");
			k = Integer.parseInt(br.readLine());
			obj = new Object1(k);
			obj.Print();
			obj.setHammer(true);
			System.out.println();
			String stop;
			while(true) {
				br.readLine();
				System.out.print("강화를 계속할거면 아무키를, 종료하실거면 stop을 입력해주세요");
				stop = br.readLine();
				if(stop.equals("stop")) break;
				if(obj.getLevel()==13) {
					System.out.println("강화 최고 단계입니다.");
					break;
				}
						
				if(obj.getLevel()>=11) {
					System.out.print("헤머를 사용하시겠어요?");
					k = br.read();
					if(k==89 || k==121) {
						obj.setHammer(true);
					}
					else {
						obj.setHammer(false);
					}
					br.readLine();
					System.out.print("플루오르 수정을 사용하시겠어요?");
					k = br.read();
					if(k==89 || k==121) {
						obj.FluCrystalEnhancement();
						obj.Print();
					}
					else {
						obj.Enhancement();
						obj.Print();
					}
				}
				else if(obj.getLevel()>=7) {
					System.out.print("헤머를 사용하시겠어요?");
					k = br.read();
					if(k==89 || k==121) {
						obj.setHammer(true);
					}
					else {
						obj.setHammer(false);
					}
					br.readLine();
					System.out.print("플루오르 스톤을 사용하시겠어요?");
					k = br.read();
					if(k==89 || k==121) {
						obj.FluStoneEnhancement();
						obj.Print();	
					}
					else {
						obj.Enhancement();
						obj.Print();
					}	
				}
				else {
					System.out.print("헤머를 사용하시겠어요?");
					k = br.read();
					if(k==89 || k==121) {
						obj.setHammer(true);
					}
					else {
						obj.setHammer(false);
					}
					br.readLine();
					obj.Enhancement();
					obj.Print();
				}
				System.out.println();
			}
			obj.Print();
			System.out.println("총 "+obj.getCount()+"번 두드렸습니다.");
			System.out.println("강화를 종료합니다.");
		}
		else {
			System.out.println("강화를 안합니다.");
		}
		
		System.out.println("플루오르 스톤 사용 개수 : "+obj.getFluStoneCnt());
		System.out.println("복원의 주문서 사용 개수 : "+obj.getRestoreCnt());
		System.out.println("플루오르 수정 사용 개수 : "+obj.getFluCrystalCnt());
	}
}
