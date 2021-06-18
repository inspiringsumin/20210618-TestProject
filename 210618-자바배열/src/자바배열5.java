/*
	1차원 배열
 */
import java.util.Scanner;
public class 자바배열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5명의 이름 저장
//		String[] names={"홍길동","심청","춘향","박문수","이순신"}; //초기화
//		String[] sexs={"남자","여자","여자","남자","남자"}; //초기화
//		
		// 출력 => 일반 for문 사용! for~each문 아님 (두개의 배열을 연결해서 가져와야 하므로)
		// cf) for~each문 (한개의 배열에서만 값을 가져올 수 있다, 두개의 배열을 연결해서 가져올 수 없다)
//		for(int i=0;i<names.length;i++) // i=0~4까지
//		{
//			System.out.printf("%s(%s)\n",names[i],sexs[i]);
//		}
//		
		
		String[] book= {
				"자바와 오라클",
				"자바와 JSP",
				"HTML & Ajax",
				"자바 & 코틀린",
				"혼자 배우는 스프링",
				"혼자 배우는 자바",
				"자바와 AI",
				"모바일 코틀린",
				"모바일 과 자바"
		};
		
		// 서제스트 기능 (시작하는 문자를 불러와서, 관련된 단어를 출력함)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String data=scan.next();
		
		for(String s:book)
		{
			if(s.startsWith(data) || s.endsWith(data)) // 접두어와 접미어를 찾음 cf) 카페에서 게시판이 특정 아이디인 사람에게만 보여지게 하는 경우, id_board=> startsWith 사용
			{										
//				try 
//				{
//					Thread.sleep(500); //출력하는 시간을 늦춰줌
//				}catch(Exception ex) {}
				System.out.println(s);
			}
		}
		
	}

}
