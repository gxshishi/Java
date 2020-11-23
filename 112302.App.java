package pac;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws InterruptedException {
		while (true) {
			Thread.sleep(1000);
			System.out.println("随机生成的二维坐标是："+"("+(int)(Math.random()*100%100)+","+(int)(Math.random()*100%100)+")");
		}
	}
}
