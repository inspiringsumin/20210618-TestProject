/*
	1���� �迭
 */
import java.util.Scanner;
public class �ڹٹ迭5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5���� �̸� ����
//		String[] names={"ȫ�浿","��û","����","�ڹ���","�̼���"}; //�ʱ�ȭ
//		String[] sexs={"����","����","����","����","����"}; //�ʱ�ȭ
//		
		// ��� => �Ϲ� for�� ���! for~each�� �ƴ� (�ΰ��� �迭�� �����ؼ� �����;� �ϹǷ�)
		// cf) for~each�� (�Ѱ��� �迭������ ���� ������ �� �ִ�, �ΰ��� �迭�� �����ؼ� ������ �� ����)
//		for(int i=0;i<names.length;i++) // i=0~4����
//		{
//			System.out.printf("%s(%s)\n",names[i],sexs[i]);
//		}
//		
		
		String[] book= {
				"�ڹٿ� ����Ŭ",
				"�ڹٿ� JSP",
				"HTML & Ajax",
				"�ڹ� & ��Ʋ��",
				"ȥ�� ���� ������",
				"ȥ�� ���� �ڹ�",
				"�ڹٿ� AI",
				"����� ��Ʋ��",
				"����� �� �ڹ�"
		};
		
		// ������Ʈ ��� (�����ϴ� ���ڸ� �ҷ��ͼ�, ���õ� �ܾ �����)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻��� �Է�:");
		String data=scan.next();
		
		for(String s:book)
		{
			if(s.startsWith(data) || s.endsWith(data)) // ���ξ�� ���̾ ã�� cf) ī�信�� �Խ����� Ư�� ���̵��� ������Ը� �������� �ϴ� ���, id_board=> startsWith ���
			{										
//				try 
//				{
//					Thread.sleep(500); //����ϴ� �ð��� ������
//				}catch(Exception ex) {}
				System.out.println(s);
			}
		}
		
	}

}
