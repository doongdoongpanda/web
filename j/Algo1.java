package j;

import java.util.Scanner;

public class Algo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println("Hello "+resolve(count));
    }
    public static String resolve(int count){
        String nameAll = "";
        for(int i=0 ; i < count ; i++){
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        if( i <count-1) {
        nameAll += name +",";
        }else {
        	 nameAll += name +".";
        }
        }
        return nameAll;
    }
}
