package Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

    List<Recommendation> list = new ArrayList<>();

        while (true) {
            System.out.println("1. View lists");
            System.out.println("2. Clone and Modify list");
            System.out.println("3. Make a new list");
            System.out.println("4. Exit");
            String choice = scan.nextLine();

            if (choice.equals("1")) {
                System.out.println(list);
            } else if (choice.equals("2")) {
                if (list.isEmpty()) {
                    System.out.println("No lists to clone yet.");
                    continue;
                }
                Recommendation clone = list.get(0).clone();
                System.out.println("New target Audience");
                clone.setTargetaudience(scan.nextLine());

                System.out.println("Add Book Title: ");
                String title = scan.nextLine();

                System.out.println("Author: ");
                String author = scan.nextLine();

                System.out.println("Genre: ");
                String genre = scan.nextLine();

                System.out.println("Year: ");
                int publicationyear = Integer.parseInt(scan.nextLine());

                clone.addBook(new Book(title, author, publicationyear, genre));
                list.add(clone);
                System.out.println("Clone list saved");
            } else if (choice.equals("3")) {
                System.out.println("Audience: ");
                Recommendation newRec = new Recommendation(scan.nextLine(), new ArrayList<>());

                System.out.println("Add Book Title: ");
                String title = scan.nextLine();

                System.out.println("Author: ");
                String author = scan.nextLine();

                System.out.println("Genre: ");
                String genre = scan.nextLine();

                System.out.println("Year: ");
                int publicationyear = Integer.parseInt(scan.nextLine());

                newRec.addBook(new Book(title, author, publicationyear, genre));
                list.add(newRec);
                System.out.println("New list saved");

            } else if (choice.equals("4")) {
                break;
            }
        }

    }
}
