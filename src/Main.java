import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("press 1 to Register\npress 2 to Login\npress 3 to exit\nEnter your choice: ");
            int choice = scanner.nextInt();
            if(choice==1){
                scanner.nextLine();
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Username: ");
                String user= scanner.nextLine();
                System.out.print("Enter Password: ");
                String pass = scanner.nextLine();
                login.register(name,user,pass);
            }
            else if(choice==2){
                scanner.nextLine();
                System.out.print("Enter username: ");
                String user=scanner.nextLine();
                System.out.print("Enter Password: ");
                String pass= scanner.nextLine();
                login.login(user,pass);
            }
            else if(choice==3)return;
            else System.out.println("Invalid choice");
        }

    }
}