/*
	5개의 정수를 저장 한 후 합과 평균을 구해서 처리하시오.
*/

/*	주석거는 방법
	ctrl+shift+/(슬래시) :주석걸기
	ctrl+shift+\(역슬래시) :주석풀기

*/

public class 자바배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생하여 임의로 데이터 저장
		// 1. 일반 변수 사용
//		int a=(int)(Math.random()*100)+1; //1~100
//		int b=(int)(Math.random()*100)+1; //1~100
//		int c=(int)(Math.random()*100)+1; //1~100
//		int d=(int)(Math.random()*100)+1; //1~100
//		int e=(int)(Math.random()*100)+1; //1~100
//		System.out.printf("a=%d,b=%d,c=%d,d=%d,e=%d\n",a,b,c,d,e);
//		System.out.printf("합:%d\n",a+b+c+d+e);
//		System.out.printf("평균:%.2f\n",(a+b+c+d+e)/5.0);
//		
//		// 최대값, 최소값 출력
//		int max=a; //초기값 설정
//		int min=a; //초기값 설정
//		
//		// 최대값 구하기
//		if(max<a)
//		   max=a;
//		if(max<b)
//		   max=b;
//		if(max<c)
//		   max=c;
//		if(max<d)
//		   max=d;
//		if(max<e)
//		   max=e;
//		
//		System.out.println("최대값:"+max);
//		
//		// 최소값 구하기
//		if(min>a)
//		   min=a;
//		if(min>b)
//		   min=b;
//		if(min>c)
//		   min=c;
//		if(min>d)
//		   min=d;
//		if(min>e)
//		   min=e;
//		System.out.println("최소값:"+min);
		
		// 일반변수를 사용하면 반복이 많아진다. (값이 30개이면, if문이 30개...) => 루프를 돌리기 힘들다.
	
		
		// 데이터를 모아서 처리 (변수명이 1개로 통일) ==> 인덱스 번호를 준다.	
		// 2. 배열 사용 (for문 사용이 가능하다)
		
		//선언
		int[] arr=new int[5];
		//초기값
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		for(int i:arr)
		{
			System.out.printf("%d\t",i);
		}
		
		System.out.println();
		
		//총합
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("합:"+total);
		
		//평균
		//System.out.println("평균:"+total/5.0);
		System.out.println("평균:"+(total/(double)arr.length)); //이렇게 쓰면 개수가 바뀌어도 나누는 값을 바꿀 필요가 없다.
		
		//최소값, 최대값
		int min=arr[0];
		int max=arr[1];
		
		for(int i:arr)
		{
			if(i<min)
				min=i;
			if(i>max)
				max=i;
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);	
	}

}
