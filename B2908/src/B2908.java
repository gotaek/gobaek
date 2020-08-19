import java.util.Scanner;

public class B2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();

		String a = "";
		String b = "";

		for (int i = 2; i >= 0; i--) {
			a += str1.charAt(i);
			b += str2.charAt(i);
		}

		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);

		if (num1 > num2)
			System.out.println(num1);
		else
			System.out.println(num2);

	}

}
