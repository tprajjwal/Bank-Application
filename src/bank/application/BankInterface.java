package bank.application;

public interface BankInterface {


    int getBalance(String password);

    String depositMoney(int amount);
    String withdrawMoney(int amount,String password);
    double calculateInterest(int time);

    String changePassword(String oldPassword,String newPassword);
}
