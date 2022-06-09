package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class silent_zone {

				public static void main(String[] args) {
					
					//Circle circle = new Circle(3.1);
					//Scanner scan = new Scanner(System.in);
					
					Scanner scanner = new Scanner(System.in);
					System.out.println("공사장의 좌표를 입력하세요:");
					String construction = scanner.next();
					String[] constr = construction.split(" ");
					int constructionX = Integer.parseInt(constr[0]);
					int constructionY = Integer.parseInt(constr[1]);
					int constructionR = Integer.parseInt(constr[2]);//반지름
					//Circle.radius = constructionR; //반지름

					
					System.out.println("나무그늘의 수를 입력하세요:");
					int treeCount = scanner.nextInt();
					
			        List<String> s = new ArrayList<>();
			        String tree ="";
			        String answer = "";
			        
			        for (int j = 0; j < treeCount; j++) {
			          tree = scanner.next();
			        
			          String[] stringTree = construction.split(" ");
						int treeX = Integer.parseInt(stringTree[0]);
						int treeY = Integer.parseInt(stringTree[1]);
						int treeR = Integer.parseInt(stringTree[2]);//반지름
						double R =Math.pow((constructionX-treeX),2) + Math.pow((constructionY-treeY),2);
		
						      if (R >= Math.pow(R, 2)) {
						    	  answer = "silent";
						      }

						      s.add(answer);
						    }

						    s.forEach((result) -> {
						      System.out.println(result);
						    });

						  
}
