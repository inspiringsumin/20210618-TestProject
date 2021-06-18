/*
	2. 100~999 사이의 4의 배수가 아닌 수의 개수, 합을 출력하는 프로그램 작성
*/
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num4=0;
		int sum=0;
		
		for(int i=100;i<=999;i++)
		{

			if(i%4!=0)
				num4++;
				sum+=i;
			
		}
		System.out.println("갯수:"+num4);
		System.out.println("합:"+sum);
	}

}
