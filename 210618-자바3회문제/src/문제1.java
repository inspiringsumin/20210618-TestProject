/*
 	1. 100~999������ 7�� ����� ������ ���� ����ϴ� ���α׷� �ۼ�
 */
public class ����1 {

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
		System.out.println("7�� ��� ����:"+num7);
		System.out.println("7�� ��� ��:"+sum);
	}

}
