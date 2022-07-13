import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {

//		if-else if문
//		if(조건식1) {
//			조건식1의 연산결과가 true일때 수행될 문장들
//		}else if(조건식2){
//			조건식2의 연산결과가 true일때 수행될 문장들 
//		}else if(조건식3){
//			조건식3의 연산결과가 true일때 수행될 문장들 
//		}else {
//			위의 어느 조건식도 만족하지 않을 때 수행될 문장들
//		}
		
//		학점을 등급으로 표현하는 프로그램
//		100점이하 90이상이면 A
//		90미만 80이상이면 B
//		80미만 70이상이면 C
//		70미만 60이상이면 D
//		나머지는 F로 학점을 매긴다
		
//		점수는 사용자 키보드 입력을 받는다
		
//		당신의 점수는 ??이고 등급은 ??입니다.
//		로 출력한다
		
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		String grade = "";
		
//		유효성
//		if(score > 100) {
//			System.out.println("점수는 100점을 넘을 수 없습니다.");

		if (score >= 90) {
			grade = "A";
							
			if(score >= 95) {
				grade = grade + "+";
			}
			else if(score <= 92) {
				grade = grade + "-";
			}
						
		} else if (score >= 80) {
			grade = "B";
			
			if(score >= 85) {
				grade = grade + "+";
			}
			else if(score <= 82) {
				grade = grade + "-";
			}
			
		} else if (score >= 70) {
			grade = "C";
			
			if(score >= 75) {
				grade = grade + "+";
			}
			else if(score <= 72) {
				grade = grade + "-";
			}
			
		} else if (score >= 60) {
			grade = "D";
			
			if(score >= 65) {
				grade = grade + "+";
			}
			else if(score <= 62) {
				grade = grade + "-";
			}
			
		} else {
			grade = "F";
		}

		System.out.println("당신의 점수는 " + score + "점 입니다." 
			+ "등급은 " + grade + " 입니다.");
		
//		scan.close();
	}

}
