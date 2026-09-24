package que3;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        str = str.trim();

        if (str.length() == 0) {
            System.out.println("Number of words: 0");
        } else {

            String[] words = str.split("\\s+");

            System.out.println("Number of words: " + words.length);
        }

        sc.close();
    }
}