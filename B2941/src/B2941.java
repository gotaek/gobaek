import java.util.Scanner;

public class B2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = 0;
		String str = s.next();
		int i = 0;
		while (i < str.length()) {
			try {
				switch (str.charAt(i)) {
				case 'c':
					if ((str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')) {
						count++;
						i++;
					} else
						count++;
					break;

				case 'd':
					if ((i < str.length() - 2) && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
						count++;
						i += 2;
					} else if (str.charAt(i + 1) == '-') {
						count++;
						i++;
					} else
						count++;
					break;
				case 'l':
				case 'n':
					if ( str.charAt(i + 1) == 'j') {
						count++;
						i++;
					} else
						count++;
					break;

				case 's':
				case 'z':
					if (str.charAt(i + 1) == '=') {
						count++;
						i++;
					} else
						count++;
					break;

				default:
					count++;
					break;
				}
			} catch (Exception e) {
				count++;
				break;
			}
			i++;
		}

		System.out.printf("%d", count);
	}

}