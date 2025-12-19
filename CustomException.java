import java.util.Scanner;

class ATM {
    int accNumber = 12345678;
    int password = 1111;
    int an, pwd;
    void acceptInput() {
        Scanner   = new Scanner(System.in);
        System.out.println("Enter account number:");
        an = sc.nextInt();
        System.out.println("Enter password:");
        pwd = sc.nextInt();
    }

    void verify() {
        if (accNumber == an && password == pwd) {
            System.out.println("Collect your money");
        } else {
            System.out.println("Invalid details");
        }
    }
}
class Bank {
    void initiate() {
        ATM atm = new ATM();
        atm.acceptInput();
        atm.verify();
    }
}
public class CustomException {
    public static void main(String[] args) {
        Bank b = new Bank(); 
        b.initiate();
    }
}
