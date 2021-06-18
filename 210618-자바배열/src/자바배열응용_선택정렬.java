import java.util.Arrays;

/*
 	정렬
	40 	50	10	20	30 ===> 50 40 30 20 10(DESC) , 10 20 30 40 50(ASC)
	                        내림차순				   올림차순              
	                        
	<선택정렬>
	=======
	
	40 50 10 20 30
	== ==
	50 40
	==	  ==
	50    10
	==       ==
    50		 20	
	==          ==
	50			30
	첫번째 값과 다른 값들을 각각 비교 => 1round (for문 1바퀴)
	================================================
	=>
	50 40 10 20 30
	   == ==
	   40 10 
	   ==    ==
	   40    20
	   ==       ==
	   40		30
	   두번째 값과 다른 값들을 각각 비교 => 2round (for문 2바퀴) ?? 이해안되는 중
	================================================   
	=>
	50 40 10 20 30
	      == ==
		  20 10
	      ==    ==
	      30    10
	  세번째 값과 다른 값들을 각각 비교 => 3round (for문 3바퀴)
	================================================ 
	50 40 30 10 20
	         == ==
	         20 10
	 네번째 값과 다른 값들을 각각 비교 => 4round (for문 4바퀴)
	===================================================
	50 40 30 20 10
	
	==> 5개인 경우 for문은 4바퀴 돌아간다.
	
*/
public class 자바배열응용_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 5개 선언
		int[] arr=new int[5]; // 정수를 5개 저장할 수 있는 공간
		//저장공간에 데이터 출력
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1; //1~100 사이의 정수값 대입
		}
		
		//출력
		System.out.println("======= 정렬 전 =======");
		System.out.println(Arrays.toString(arr)); //Arrays입력 후 ctrl+space한 후 선택 (배열자체의 데이터를 출력하는 형식)
		System.out.println("======= 정렬 후 =======");
//		for(int i=0;i<arr.length-1;i++) //개수보다 하나 적게 for문이 돌아가야 한다.
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				// 숫자를 비교해서 교환한다.
//				if(arr[i]<arr[j])
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//					// 뒤의 값이 더 크면, 두 값의 위치를 바꿔준다. => 뒤의 값을 앞으로 바꿈
//				}
//			}
//		}
		Arrays.sort(arr); // 오름차순으로 순서를 변경한다.
		//출력시에는 내림차순이 많다. cf) 최신순 먼저 출력
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		} // 해당 문장을 추가해줘야, Arrays.sort(arr);가 내림차순으로 바뀐다.
		
		//System.out.println(Arrays.toString(arr));
	}

}
