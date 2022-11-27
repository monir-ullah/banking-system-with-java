import java.util.ArrayList;
import java.util.Scanner;

public class Login extends UserInfo {

    ArrayList<String> username = new ArrayList<>();
    ArrayList<String> password = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    void register(String name1,String user,String pass){
        name.add(name1);
        username.add(user);
        password.add(pass);
        System.out.println("Registration Successful");
        System.out.println("Press any key Then Press Enter");
        scanner.next();
    }
    void login(String user, String pass){
        int ind1= username.indexOf(user);
        int ind2= password.indexOf(pass);
        if(ind1!=-1){
            if(ind1==ind2){
                new_account(name.get(ind1),ind1);
            }
            else System.out.println("Invalid Password");
        }
        else System.out.println("Invalid Username");
    }

}
