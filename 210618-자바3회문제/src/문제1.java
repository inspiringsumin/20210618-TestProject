/*
 	1. 100~999사이의 7의 배수의 갯수와 합을 출력하는 프로그램 작성
 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num7=0;
		int sum=0;
		
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
				num7++;
				sum+=i;
			
		}
		System.out.println("7의 배수 갯수:"+num7);
		System.out.println("7의 배수 합:"+sum);
	}

}
