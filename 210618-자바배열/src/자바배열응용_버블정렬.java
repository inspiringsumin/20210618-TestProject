import java.util.Arrays;

/*
 	버블정렬 : 인접한 것끼리 비교한다. (뒤에서 부터 고정한다)
 	ASC(오름차순)인 경우
 	
	30 20 40 50 10
	== ==
	20 30
	   == ==
	   30 40
	      == ==
	      40 50
	         == ==
	         10 50
	         1라운드
============================ 1라운드
=> 20 30 40 10 50 (50은 고정, 10까지만 비교)
   == ==
   20 30
      == ==
      30 40
         == ==
         10 40
            == ==
            40 50
============================ 2라운드
=> 20 30 10 40 50 (40,50은 고정, 10까지만 비교)
   == ==
   20 30
      == ==
      10 30
         == ==
         30 40
            == ==
            40 50
            40 50
============================ 3라운드
=>   20 10 30 40 50 (30,40,50은 고정, 10까지만 비교)
     == ==
     10 20
============================ 4라운드
 	10 20 30 40 50
 	
 	i  j
  	0  4
 	1  3
 	2  2
 	3  1
 	
 	=> i+j=4 ==> j=4-i
 	
      
*/           


//int[] arr=new int[5];
//초기값
//for(int i=0;i<arr.length;i++)
//{
//	arr[i]=(int)(Math.random()*100)+1;
//}
//정렬전에 저장된 데이터 출력
//System.out.println(Arrays.toString(arr));
//System.out.println("======= 정렬 후 출력 =======");
//for(int i=0;i<arr.length-1;i++)
//{
//	for(int j=0;j<arr.length;j++)
//	{
//		if(arr[j]>arr[j+i])
//		{
//			int temp=arr[j];
//			arr[j]=arr[j+i];
//			arr[j+i]=temp;
//		}
//	}
//}
public class 자바배열응용_버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		//초기값
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//정렬전에 저장된 데이터 출력
		
		System.out.println(Arrays.toString(arr));
		System.out.println("======= 정렬 후 출력 =======");
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		
		// 오류출력 => 풀이참조
		System.out.println(Arrays.toString(arr));
	}

}
