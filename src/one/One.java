package one;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		float a=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����뻰����");
		a=scanner.nextFloat();
		if(a<10)
			System.out.println("�������"+a+"���� �뼰ʱ��ֵ");
		else
			System.out.println("�������"+a+"�����ʹ�� ");
	}

}
