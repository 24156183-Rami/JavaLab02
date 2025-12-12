import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Roll No: ");
        String roll = sc.nextLine();

        System.out.print("Enter your Section: ");
        String section = sc.nextLine();

        System.out.print("Enter your Branch: ");
        String branch = sc.nextLine();

        System.out.println("\n----- OUTPUT -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}
