import java.util.*;
public class Demo1 {

	/**
	 * @param args
	 */
	
	/*
	����������һ�����ϵ���Ϸ����һ�������������һ�����֣�
	�ɲ����߲£����������ִ����������֣�������߻ش𡺴��ˡ���
	��С�ڣ���ش�С�ˡ���ֱ�������߲��С���������д����
	ģ�������ߣ����������0~1000֮�䡣��ʹ��������ʱ��
	ͬʱ��ӡ���²������
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int number=(int)(Math.random()*1000);
			int s;
			int i=0;
			System.out.println("���ʲô");
			do{
				s=scan.nextInt();
				if(s<=1000&&s>=1){
				if(number<s){
				System.out.println("�´���");
				i++;
				}else if(number>s){   
					System.out.println("��С��");
					i++;
				}else{
					i++;
					break;
				}}else{
					System.out.println("����������ֲ��ڷ�Χ��");
					System.exit(0);
				}
			}while(true);
			System.out.println("�ҳ�����Ϊ"+number);
			System.out.println("��µĴ���Ϊ"+i);
		}
}
