package nonVectorExercises;

import java.util.Scanner;

public class hackerrank_display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine(); // essencial para solucionar
        String s = sc.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        sc.close();
    }
}
