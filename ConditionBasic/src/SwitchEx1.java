
public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		switch(조건식)
//		case 값1 :
//			 조건식의 결과가 값1과 같은 경우 수행될 문장
//		break;
//		case 값2:
//			조건식의 결과가 값2와 같은 경우 수행될 문장
//		break;
//		.
//		.
//		.
//		default:
//			조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
//			
//	}
//	
//	switch문의 제약조건
//	조건식의 결과값이 반드시 정수여야 한다.
//	조건식 결과는 정수 또는 문자열
//	case문의 값은 정수와 상수만 가능, 중복되면 안된다.

	int rndNum = 0;
	
	rndNum = (int)(Math.random() * 10);
	rndNum = (rndNum * 100);
	
	switch (rndNum) {
		case 100:
			System.out.println("당신의 번호는 100이고, 상품은 자전거입니다.");
			break;
		case 200:
			System.out.println("당신의 번호는 200이고, 상품은 TV입니다.");
			break;	
		case 300:
			System.out.println("당신의 번호는 300이고, 상품은 노트북입니다.");
			break;
		case 400:
			System.out.println("당신의 번호는 400이고, 상품은 자동차입니다.");
			break;
		case 500:
			System.out.println("당신의 번호는 500이고, 상품은 컴퓨터입니다.");
			break;
		default:
			System.out.println("당신의 번호는 " + rndNum + "입니다. " 
							+ "꽝 다음 기회를 기대해주세요.");
			break;
	}

	System.out.println("프로그램을 종료합니다.");
	

	
	
}	
}
	
