package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class silent_zone {

	public static void main(String[] args) {

		// Circle circle = new Circle(3.1);
		// Scanner scan = new Scanner(System.in);

		Scanner scanner = new Scanner(System.in);
		System.out.println("공사장의 좌표를 입력하세요:");
		int constructionX = scanner.nextInt();
		int constructionY = scanner.nextInt();
		int constructionR = scanner.nextInt();// 반지름
		// Circle.radius = constructionR; //반지름

		System.out.println("나무그늘의 수를 입력하세요:");
		int treeCount = scanner.nextInt();

		List<String> s = new ArrayList<>();
		String tree = "";
		String answer = "";
		System.out.println("나무그늘의 좌표를 순서대로 입력하세요:");
		for (int j = 0; j < treeCount; j++) {
			// tree = scanner.next();
			int treeX = scanner.nextInt();
			int treeY = scanner.nextInt();
			// String[] stringTree = tree.split(" ");
			// int treeX = Integer.parseInt(stringTree[0]);
			// int treeY = Integer.parseInt(stringTree[1]);

			double R = Math.pow((constructionX - treeX), 2) + Math.pow((constructionY - treeY), 2);

			if (R <= Math.pow(constructionR, 2)) {
				answer = "silent";
			} else {
				answer = "noisy";
			}
			s.add(answer);
		}
		System.out.println(s);
	}
}
