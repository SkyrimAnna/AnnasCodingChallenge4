package Challenge4;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        do {

            System.out.println("Enter Password");
            input = scanner.next();
        }

        while (!input.equals("Shark50") );

        System.out.println("ACCESS APPROVED");




    }


}
