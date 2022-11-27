import java.util.ArrayList;
import java.util.Scanner;

public class UserInfo {
    ArrayList<Integer> amount1= new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    void new_account(String name, int serial) {
        System.out.println("Welcome " + name);
        int size= amount1.size();
        if (serial>=size) {
            System.out.println("You have 0 Balance");
            System.out.println("Press 1 to get 100 tk Free deposit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                amount1.add(100);
                System.out.println("Your Balance Is 100 tk.");
                System.out.println("Press any key Then Press Enter");
                scanner.next();
                menu(serial);
            } else System.out.println("Invalid");
        }
        else menu(serial);
    }
    void menu(int serial){
        while (true) {
            System.out.print("press 1 for Deposit\npress 2 for View Balance\npress 3 for Withdraw\npress 4 exit.\n ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> deposit(serial);
                case 2 -> view_balance(serial);
                case 3 -> withdraw(serial);
                case 4 -> {
                    return;
                }
            }
        }
    }
    void deposit(int serial){
        System.out.print("Enter the amount to deposit: ");
        int amount= scanner.nextInt();
        System.out.println("Amount added "+amount);
        amount+=amount1.get(serial);
        System.out.println("Your current amount is "+amount);
        amount1.set(serial,amount);
        System.out.println("Press any key Then Press Enter");
        scanner.next();
    }
    void view_balance(int serial){
        System.out.println("Your Balance Is: "+amount1.get(serial));
        System.out.println("Press any key Then Press Enter");
        scanner.next();
    }
    void withdraw(int serial){
        System.out.println("Your Balance Is: "+amount1.get(serial));
        System.out.print("Enter The amount You want to Withdraw: ");
        int amount2=scanner.nextInt();
        if(100<amount1.get(serial)-amount2){
            System.out.println("Withdrawn Amount: "+amount2);
            amount2=amount1.get(serial)-amount2;
            System.out.println("Your new amount is "+amount2);
            amount1.set(serial,amount2);
        }else {
            System.out.println("You Don't Hava enough money to withdraw");
        }
        System.out.println("Press any key Then Press Enter");
        scanner.next();
    }
}
