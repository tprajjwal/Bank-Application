package bank.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Taking input for account creation;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name,Password,& initial balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        //Account creation;
        SBIAccount account1 = new SBIAccount(name,password,balance);
        System.out.println("Your account has been created with account number"+" "+account1.getAccountNo()+" "+"and your current balance is"+" "+account1.getBalance());

        //deposit money
        System.out.println("Enter money to be deposited");
        int depositMoney=sc.nextInt();
        System.out.println(account1.depositMoney(depositMoney));

        //withdraw money
        System.out.println("Enter withdraw money");
        int withdrawMoney=sc.nextInt();
        System.out.println("Enter your password");
        String enteredPassword=sc.next();
        System.out.println(account1.withdrawMoney(withdrawMoney,enteredPassword));

        //interest
        System.out.print("Enter time to know interest");
        int time=sc.nextInt();
        System.out.println("Interest for"+" "+time+" "+"years is"+" "+account1.calculateInterest(time));

        //change password
        System.out.println("ENTER OLD PASSWORD && NEW PASSWORD");
        String oldPass=sc.next();
        String newPass=sc.next();
        System.out.println(account1.changePassword(oldPass,newPass));




    }
}