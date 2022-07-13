
public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		조건문
//		조건문은 프로그램의 흐름(flow)을 바꾸는 역할을 한다
//		if(조건식) { < 명칭: 블럭(block) 블럭을 열고 닫는다.
//			// 조건식이 true일 때 수행될 문장들을 적는다
//		}
//		만약 {} 블록안에 있으면 무조건 수행 / {}블록이 없을경우 가장 가까운 출력문만 출력한다. **블록표시가 중요함
		
		int score = 0;
		
		score = 68;
		
		if(score > 60) {
			System.out.println("합격입니다");
		}
		
		System.out.println("불합격입니다"); //이부분은 블럭 밖이여서 무조건 실행된다.
		
		
		
	}

}
