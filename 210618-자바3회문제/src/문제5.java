/*
	4. 1~1000�������� 7�� ����� ��, 9�� ����� ��
*/
public class ����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum7=0;
		int sum9=0;
		
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
				sum7+=i;
			if(i%9==0)
				sum9+=i;
		}
		System.out.println("7�� ���:"+sum7);
		System.out.println("9�� ���:"+sum9);	
		System.out.println("7�� ���+9�� ���:"+(sum7+sum9));	
	}

}
