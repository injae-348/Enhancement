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
			obj = new Object1();
			obj.Print();
			br.readLine();
			System.out.println();
			
			String stop;
			while((stop = br.readLine())!=null) {
				if(stop.equals("stop")) break;
				obj.Enhancement();
				obj.Print();
				System.out.println();
			}
			obj.Print();
			System.out.println("총 "+obj.getCount()+"번 두드렸습니다.");
			System.out.println("강화를 종료합니다.");
		}
		else {
			System.out.println("강화를 안합니다.");
		}
		
		
	}
}
