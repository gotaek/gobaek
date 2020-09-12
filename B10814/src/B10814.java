import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class B10814 {
	public static class Judge {
		int age;
		String name;

		Judge(int age, String name) {
			this.age = age;
			this.name = name;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Judge> members = new ArrayList<Judge>(n);

		for (int i = 0; i < n; i++) {
			int temp = s.nextInt();
			String des = s.next();

			members.add(new Judge(temp, des));
		}
		
		Collections.sort(members, new Comparator<Judge>() {
            @Override
            public int compare(Judge s1, Judge s2) {
                if (s1.age< s2.age) {
                    return -1;
                } else if (s1.age > s2.age) {
                    return 1;
                }
                return 0;
            }
        });

		for (int i = 0; i < members.size(); i++) {
			System.out.print(members.get(i).age + " " + members.get(i).name + "\n");
		}

	}

}
