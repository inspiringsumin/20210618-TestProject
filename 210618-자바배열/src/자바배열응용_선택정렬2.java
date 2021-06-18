import java.util.Arrays;

/*
	자바배열응용_선택정렬2 답안 (오류확인용) =>  test.java 파일을 참고하세요.
*/

/*  <선택정렬> (앞에서부터 고정해 나간다)
	알파벳을 정렬
	P, A, P, Y, J, H, J
	= =
	A P
	=     =
	P     P
	 
*/
public class 자바배열응용_선택정렬2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[7];
		// ASC => 올림차순
		
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65); // 알파벳은 25자 
		}
		System.out.println(Arrays.toString(alpha));
		
		//Arrays.sort(alpha); //올림차순으로 배열
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=i+1;j<alpha.length;j++)
			{
				//교환 시 임시변수가 필요하다.
				if(alpha[i]>alpha[j])
				{
					char temp=alpha[i];
					alpha[i]=alpha[j];
					alpha[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(alpha));
		
		//문제1) String s="ADBHCEOPEK"; ==> DESC로 출력하시오.
		
		String s="ADBHCEOPEK";
		
		char[] arr=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(arr));

		//선택정렬
//		for(int i=0;i<arr.length-1;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				//교환 시 임시변수가 필요하다.
//				if(arr[i]>arr[j])
//				{
//					char temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		//ABCDEEHKOP
		
		//버블정렬
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
		//오류나는듯
		s=s.valueOf(arr); // char[] ==> String
		System.out.println(s);
		
		//

	}

}
