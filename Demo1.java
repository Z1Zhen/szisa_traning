import java.util.*;
public class Demo1 {

	/**
	 * @param args
	 */
	
	/*
	猜数字是已一个古老的游戏，由一个出题者随机出一个数字，
	由猜题者猜，若所猜数字大于所出数字，则出题者回答『大了』；
	若小于，则回答『小了』；直到猜题者猜中。现在请编写程序
	模拟出题者，随机数字在0~1000之间。当使用者猜中时，
	同时打印出猜测次数。
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int number=(int)(Math.random()*1000);
			int s;
			int i=0;
			System.out.println("你猜什么");
			do{
				s=scan.nextInt();
				if(s<=1000&&s>=1){
				if(number<s){
				System.out.println("猜大了");
				i++;
				}else if(number>s){   
					System.out.println("猜小了");
					i++;
				}else{
					i++;
					break;
				}}else{
					System.out.println("你输入的数字不在范围内");
					System.exit(0);
				}
			}while(true);
			System.out.println("我出的数为"+number);
			System.out.println("你猜的次数为"+i);
		}
}
