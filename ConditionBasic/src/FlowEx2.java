import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scan = new Scanner(System.in);
		int score = 0;
		
		System.out.println("숫자를 입력하세요.");
		score = scan.nextInt();
		
		if(score == 0) {
			System.out.println("입력한 숫자는 0입니다.");
		}

	}
}
