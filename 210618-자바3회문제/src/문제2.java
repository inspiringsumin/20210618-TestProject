/*
	2. 100~999 ������ 4�� ����� �ƴ� ���� ����, ���� ����ϴ� ���α׷� �ۼ�
*/
public class ����2 {

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
		System.out.println("����:"+num4);
		System.out.println("��:"+sum);
	}

}
