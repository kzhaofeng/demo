package one;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		float a=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入话费余额：");
		a=scanner.nextFloat();
		if(a<10)
			System.out.println("话费余额"+a+"余额不足 请及时充值");
		else
			System.out.println("话费余额"+a+"请放心使用 ");
	}

}
