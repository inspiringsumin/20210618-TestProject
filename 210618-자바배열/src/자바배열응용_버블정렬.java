import java.util.Arrays;

/*
 	�������� : ������ �ͳ��� ���Ѵ�. (�ڿ��� ���� �����Ѵ�)
 	ASC(��������)�� ���
 	
	30 20 40 50 10
	== ==
	20 30
	   == ==
	   30 40
	      == ==
	      40 50
	         == ==
	         10 50
	         1����
============================ 1����
=> 20 30 40 10 50 (50�� ����, 10������ ��)
   == ==
   20 30
      == ==
      30 40
         == ==
         10 40
            == ==
            40 50
============================ 2����
=> 20 30 10 40 50 (40,50�� ����, 10������ ��)
   == ==
   20 30
      == ==
      10 30
         == ==
         30 40
            == ==
            40 50
            40 50
============================ 3����
=>   20 10 30 40 50 (30,40,50�� ����, 10������ ��)
     == ==
     10 20
============================ 4����
 	10 20 30 40 50
 	
 	i  j
  	0  4
 	1  3
 	2  2
 	3  1
 	
 	=> i+j=4 ==> j=4-i
 	
      
*/           


//int[] arr=new int[5];
//�ʱⰪ
//for(int i=0;i<arr.length;i++)
//{
//	arr[i]=(int)(Math.random()*100)+1;
//}
//�������� ����� ������ ���
//System.out.println(Arrays.toString(arr));
//System.out.println("======= ���� �� ��� =======");
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
public class �ڹٹ迭����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		//�ʱⰪ
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//�������� ����� ������ ���
		
		System.out.println(Arrays.toString(arr));
		System.out.println("======= ���� �� ��� =======");
		
		
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
		
		// ������� => Ǯ������
		System.out.println(Arrays.toString(arr));
	}

}
