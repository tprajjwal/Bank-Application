package bank.application;

import java.util.UUID;

public class SBIAccount implements BankInterface{

    private String name;
    private String accountNo;
    private String password;
    private int balance;
    private double rateOfInterest;
    public SBIAccount(String name,  String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.accountNo = String.valueOf(UUID.randomUUID());
        this.rateOfInterest = 6.6;
    }
    @Override
    public int getBalance(String password) {
        if(this.password==password) return this.balance;
        return -1;

    }

    @Override
    public String depositMoney(int amount) {
        this.balance+=amount;
        String message = "Your account"+" "+accountNo+" "+"has been credited with"+" "+amount+" "+"Total Balance is:"+" "+this.balance;
        return message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(enteredPassword.equals(this.password))
        {
            if(balance<amount) return "Insufficient Balance";
            else
            {
                this.balance-=amount;
                return "Money Deducted and remaining balance is:"+this.balance;
            }
        }
        else return "Incorrect Password";
    }

    @Override
    public double calculateInterest(int time) {
        double calculatedMoney=((balance*rateOfInterest*time)/100.0);
        return calculatedMoney;
    }

    @Override
    public String changePassword(String oldPass, String newPassword) {
        if(oldPass.equals(this.password))
        {
            this.password=newPassword;
            return "Password has been updated successfully";
        }
        else return "Incorrect Password!!";

    }
}
