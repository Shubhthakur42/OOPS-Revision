package Lecture_2;
import java.util.*;
public class Account {
    private double balance; // data Security

    public void getBalance(String name, String pass) {
        boolean res = isValidate(name,pass);
        if(res) {
            System.out.println("Your Account Balance is: "+this.balance);
        }
        else {
            System.out.println("Invalid Users Credentials");
        }
    }
    public void setBalance(int balance, String name, String pass) { // Depositing money
        boolean res = isValidate(name,pass);
        if(res) {
            this.balance=this.balance+balance;
            System.out.println("Money Deposited successfully");
        }
        else {
            System.out.println("Invalid Users Credentials");
        }
    }
    public void withdrawBalance(int balance, String name, String pass) { // Depositing money
        boolean res = isValidate(name,pass);
        if(res) {
            this.balance=this.balance-balance;
            System.out.println("Money withdraw successfully");
        }
        else {
            System.out.println("Invalid Users Credentials");
        }
    }
    public boolean isValidate(String name, String pass) {
        return name.equalsIgnoreCase("Shubham") && pass.equals("123@@@SHUBham");
    }

    public static void main(String[] args) {
        Account Shubham = new Account();
        Shubham.setBalance(500000,"Shubham","123@@@SHUBham");
        Shubham.getBalance("Shubham","123@@@SHUBham");
        Shubham.withdrawBalance(200000,"Shubham","123@@@SHUBham");
        Shubham.getBalance("Shubham","123@@@SHUBham");
    }

}
