/*
	5���� ������ ���� �� �� �հ� ����� ���ؼ� ó���Ͻÿ�.
*/

/*	�ּ��Ŵ� ���
	ctrl+shift+/(������) :�ּ��ɱ�
	ctrl+shift+\(��������) :�ּ�Ǯ��

*/

public class �ڹٹ迭2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �߻��Ͽ� ���Ƿ� ������ ����
		// 1. �Ϲ� ���� ���
//		int a=(int)(Math.random()*100)+1; //1~100
//		int b=(int)(Math.random()*100)+1; //1~100
//		int c=(int)(Math.random()*100)+1; //1~100
//		int d=(int)(Math.random()*100)+1; //1~100
//		int e=(int)(Math.random()*100)+1; //1~100
//		System.out.printf("a=%d,b=%d,c=%d,d=%d,e=%d\n",a,b,c,d,e);
//		System.out.printf("��:%d\n",a+b+c+d+e);
//		System.out.printf("���:%.2f\n",(a+b+c+d+e)/5.0);
//		
//		// �ִ밪, �ּҰ� ���
//		int max=a; //�ʱⰪ ����
//		int min=a; //�ʱⰪ ����
//		
//		// �ִ밪 ���ϱ�
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
//		System.out.println("�ִ밪:"+max);
//		
//		// �ּҰ� ���ϱ�
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
//		System.out.println("�ּҰ�:"+min);
		
		// �Ϲݺ����� ����ϸ� �ݺ��� ��������. (���� 30���̸�, if���� 30��...) => ������ ������ �����.
	
		
		// �����͸� ��Ƽ� ó�� (�������� 1���� ����) ==> �ε��� ��ȣ�� �ش�.	
		// 2. �迭 ��� (for�� ����� �����ϴ�)
		
		//����
		int[] arr=new int[5];
		//�ʱⰪ
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		for(int i:arr)
		{
			System.out.printf("%d\t",i);
		}
		
		System.out.println();
		
		//����
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("��:"+total);
		
		//���
		//System.out.println("���:"+total/5.0);
		System.out.println("���:"+(total/(double)arr.length)); //�̷��� ���� ������ �ٲ� ������ ���� �ٲ� �ʿ䰡 ����.
		
		//�ּҰ�, �ִ밪
		int min=arr[0];
		int max=arr[1];
		
		for(int i:arr)
		{
			if(i<min)
				min=i;
			if(i>max)
				max=i;
		}
		System.out.println("�ִ밪:"+max);
		System.out.println("�ּҰ�:"+min);	
	}

}
