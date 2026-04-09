package sandwiches;
import java.util.Scanner;

public class Prices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like 'Regular' Size or 'Large'? ");
        String sandwitchSize = sc.nextLine();
        System.out.println("Would you like your sandwitch 'Normal' or 'Loaded'? ");
        String type = sc.nextLine();

        double cost = 0;
        double finalCost = 0;


        if (sandwitchSize.equals("Large")) {
            cost = 8.95;
            if (type.equals("Loaded")) {
                cost = cost + 1.75;
            }
        }
        else if (sandwitchSize.equals("Regular")) {
            cost = 5.45;
        }

        if (type.equals("Loaded")) {
            cost = cost + 1.00;
        } else {
            System.out.println("Invalid Data");
        }


        System.out.print("How old are you? ");
        int age = sc.nextInt();

        if (age <= 17) {
            finalCost = cost * .90;
        } else if (age >= 65) {
            finalCost = cost * .80;
        } else {
            finalCost = cost;
        }


        finalCost = Math.round(finalCost * 100.0) / 100.0;
        System.out.println("You owe us $" + finalCost);



    }  }