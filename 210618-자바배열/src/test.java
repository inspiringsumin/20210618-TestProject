/*
 	자바배열응용_선택정렬2 답안 (오류확인용)
 */
import java.util.Arrays;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*char[] alpha=new char[7];
        // ASC => 올림 차순 
        for(int i=0;i<alpha.length;i++)
        {
        	alpha[i]=(char)((Math.random()*26)+65);
        }
        System.out.println(Arrays.toString(alpha));
        
        //Arrays.sort(alpha);
        for(int i=0;i<alpha.length-1;i++)
        {
        	for(int j=i+1;j<alpha.length;j++)
        	{
        		// 교환 
        		if(alpha[i]>alpha[j])
        		{
        			char temp=alpha[i];
        			alpha[i]=alpha[j];
        			alpha[j]=temp;
        		}
        		
        	}
        }*/
        /*
         *    int a=10;
         *    int b=20;
         *    
         *    a=b; a=20
         *    b=a; b=20
         *    =========
         *    
         *    int temp=a; ==> temp=10;
         *    a=b;  ==> a=20
         *    b=temp;==> b=10
         */
        //System.out.println(Arrays.toString(alpha));
        // String s="ADBHCEOPEK"; ==> DESC
		String s="ADBHCEOPEK";
		char[] alpha=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			alpha[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(alpha));
		/*for(int i=0;i<alpha.length-1;i++)
        {
        	for(int j=i+1;j<alpha.length;j++)
        	{
        		// 교환 
        		if(alpha[i]>alpha[j])
        		{
        			char temp=alpha[i];
        			alpha[i]=alpha[j];
        			alpha[j]=temp;
        		}
        		
        	}
        }*/
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=0;j<alpha.length-1-i;j++)
			{
				if(alpha[j]<alpha[j+1])
				{
					char temp=alpha[j];
					alpha[j]=alpha[j+1];
					alpha[j+1]=temp;
				}
			}
		}
		//System.out.println(new String(alpha));
		s=s.valueOf(alpha);// char[] ==> String
		System.out.println(s);
	}

}
