/*
 	2진법을 출력하는 프로그램 =>  몇번을 나눠야 할지 모르므로 while문 사용
 */
import java.util.Arrays;
import java.util.Scanner;

public class 자바배열응용6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		//System.out.println(Integer.toBinaryString(num)); //2진법으로 변환
		int[] binary=new int[16]; // 0,1 => 0으로 채워져 있다.
		int index=15;
		while(true)
		{
			binary[index]=num%2;
			num=num/2;
			if(num==0)break; //2로 나눈 값이 0이면, 종료
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
