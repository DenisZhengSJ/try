package PTA01;

import java.util.Scanner;
public class PTA01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int a = input / 100;
		int b = (input - a * 100) / 10;
		int c = input - a * 100 - b * 10;
		int result = c * 100 + b * 10 + a;
		System.out.println(result);
		in.close();
	}

}
