import java.util.Scanner;

class Validation {
    private String userid, password; 

    void store(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }

    void login(String userid, String password) {
        if (check(userid, password)) {
            System.out.println(" *** Successfully Logged In. *** ");
        } else {
            System.out.println(" *** Invalid Credentials. *** ");
        }
    }

    private boolean check(String userid, String password) {
        return this.userid.equals(userid) && this.password.equals(password);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String correctId = "snu.univ.2017";
        String correctPwd = "university@2017@";
        
        Validation validator = new Validation();
        validator.store(correctId, correctPwd);

        System.out.print("Enter your user ID: ");
        String userid = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        validator.login(userid, password);

        scanner.close();
    }
}