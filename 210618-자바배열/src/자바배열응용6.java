/*
 	2������ ����ϴ� ���α׷� =>  ����� ������ ���� �𸣹Ƿ� while�� ���
 */
import java.util.Arrays;
import java.util.Scanner;

public class �ڹٹ迭����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num=scan.nextInt();
		
		//System.out.println(Integer.toBinaryString(num)); //2�������� ��ȯ
		int[] binary=new int[16]; // 0,1 => 0���� ä���� �ִ�.
		int index=15;
		while(true)
		{
			binary[index]=num%2;
			num=num/2;
			if(num==0)break; //2�� ���� ���� 0�̸�, ����
			index--;
		}
		
		//System.out.println(Arrays.toString(binary));
		
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	}
	

}
