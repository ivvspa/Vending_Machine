import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {


        System.out.println("Please enter a letter and a number." + "\nAvailable products:");
        System.out.println("Code \"A1\": Product \"Soda\" - Price: $1.50\n" +
                "Code \"B2\": Product \"Chips\" - Price: $1.25\n" +
                "Code \"C3\": Product \"Candy\" - Price: $0.75\n" +
                "Code \"D4\": Product \"Water\" - Price: $1.00\n");


        Scanner reader = new Scanner(System.in);


        String choice = reader.next();


        switch (choice) {


            case "A1":
                System.out.println("Soda. Total is $1.50");
                break;


            case "B2":
                System.out.println("Chips. Total is $1.25");
                break;


            case "C3":
                System.out.println("Candy. Total is $0.75");
                break;


            case "D4":
                System.out.println("Water. Total is $1.00");
                break;


            default:
                System.out.println("Error. Enter a valid product code");
                break;
        }
    }
}
