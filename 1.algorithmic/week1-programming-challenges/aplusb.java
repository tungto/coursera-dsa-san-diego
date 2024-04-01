import java.util.Scanner;

class SumOfDigits {
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		SumOfDigits obj = new SumOfDigits();
		int result = obj.sum(a, b);

		System.out.println(result);
	}
}