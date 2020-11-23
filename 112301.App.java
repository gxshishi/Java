package pac;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("欢迎来到随机坐标生成小程序");
		System.out.println("请输入一个数字：");
		Scanner scanner=new Scanner(System.in);
		while (true) {
		int shishi=scanner.nextInt();
		if (shishi==1) {
			int x=(int)(Math.random()*shishi*100%100);
			int y=(int)(Math.random()*shishi*100%100);
			System.out.println("随机生成的二维坐标是：("+x+","+y+")");
		}else {
			System.out.println("程序发生错误，请输入数字1");
			}
		}	
	
	}
}
