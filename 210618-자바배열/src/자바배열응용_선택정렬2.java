import java.util.Arrays;

/*
	�ڹٹ迭����_��������2 ��� (����Ȯ�ο�) =>  test.java ������ �����ϼ���.
*/

/*  <��������> (�տ������� ������ ������)
	���ĺ��� ����
	P, A, P, Y, J, H, J
	= =
	A P
	=     =
	P     P
	 
*/
public class �ڹٹ迭����_��������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[7];
		// ASC => �ø�����
		
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65); // ���ĺ��� 25�� 
		}
		System.out.println(Arrays.toString(alpha));
		
		//Arrays.sort(alpha); //�ø��������� �迭
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=i+1;j<alpha.length;j++)
			{
				//��ȯ �� �ӽú����� �ʿ��ϴ�.
				if(alpha[i]>alpha[j])
				{
					char temp=alpha[i];
					alpha[i]=alpha[j];
					alpha[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(alpha));
		
		//����1) String s="ADBHCEOPEK"; ==> DESC�� ����Ͻÿ�.
		
		String s="ADBHCEOPEK";
		
		char[] arr=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(arr));

		//��������
//		for(int i=0;i<arr.length-1;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				//��ȯ �� �ӽú����� �ʿ��ϴ�.
//				if(arr[i]>arr[j])
//				{
//					char temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		//ABCDEEHKOP
		
		//��������
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+i])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//�������µ�
		s=s.valueOf(arr); // char[] ==> String
		System.out.println(s);
		
		//

	}

}
