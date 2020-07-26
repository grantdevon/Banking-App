/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class BankingApp {

    //declare the account array
    static int[] acc = {123,456,789};
    
    //declare the password array
    static int[] pass = {487,900,855};
    
    //declare the balance array
    static int[] bal = {500,700,9800};
    
    //create validation function
    public static int validation(int accountNumber){
    
        //check if user input is = to any number in account array
        if (accountNumber == acc[0]){
            
    
            //call the passval method
            passval(accountNumber);
    }
        else if (accountNumber == acc[1]){
            
    
            //call the passval method
            passval(accountNumber);
    }
        else if (accountNumber == acc[2]){
            
    
            //call the passval method
            passval(accountNumber);
    }
        else{
        out.print("sorry that account does not exist, goodbye.");}
        
        //return statement
        return accountNumber;
    }
    
    
    //create the password method
    public static void passval(int accountNumber){
        
        //get user input from user for the password
        Scanner yc = new Scanner(System.in);
    
        //promt user for password
        out.println("\nplease enter your password");
        String xa = yc.nextLine();
    
        //convert string passwrod into int
        int password = Integer.parseInt(xa);
    
        //create condition for inputs if true
        if (accountNumber == acc[0] && password == pass[0]){
            System.out.print("hi user");
            
            //call MainMenu method
            MainMenu(accountNumber);
    }
        else if (accountNumber == acc[1] && password == pass[1]){
            System.out.print("hi user");
            
            //call MainMenu method
            MainMenu(accountNumber);
    }
    
        else if (accountNumber == acc[2] && password == pass[2]){
            System.out.print("hi user");
            
            //call MainMenu method
            MainMenu(accountNumber);
    } else {
        out.print("sorry thats the wrong password, please try again ");
        passval(accountNumber);
        }
    }
    
    public static void MainMenu(int accountNumber){
        //ask the user for his/her choice
        Scanner sc = new Scanner(System.in);
        System.out.println("\nenter your choice");
        System.out.println("1: check balance");
        System.out.println("2: deposit");
        System.out.println("3: transfer");
        System.out.println("4: withdraw");
        System.out.println("5: Log Out");
        System.out.println("6: Exit");
    
  
        //get user input
        String UserInput = sc.nextLine();
   
    
        //create switch statement
        switch(UserInput) {
            case "1":
                CheckBalance(accountNumber);
                break;
            case "2":
                Deposit(accountNumber, bal);
                break;
            case "3":
                Tranfer(accountNumber, bal);
                break;
            case "4":
                withdraw(accountNumber,bal);
            case "5":
                LogOut(accountNumber);
                break;
            default:
                out.print("Goodbye");
                System.exit(0);
    
    }
    }
    
    //create check balance method
    public static void CheckBalance(int accountNumber){
        if (accountNumber == acc[0]) {
            out.print("Your current balance is: " + "R"+ bal[0]);
            
            //go to main menu after user checked balance
            MainMenu(accountNumber);
        }
        else if (accountNumber == acc[1]) {
            out.print("Your current balance is: " + "R"+ bal[1]);
            
            //go to main menu after user checked balance
            MainMenu(accountNumber);
        }
        else if (accountNumber == acc[2]) {
            out.print("Your current balance is: " + "R"+ bal[2]);
            
            //go to main menu after user checked balance
            MainMenu(accountNumber);
        }
    
    
    }
    
    public static void Deposit(int accountNumber, int bal[]){
    Scanner sc = new Scanner(System.in);
    out.print("please enter the amount you would like to deposit\n");
    String x = sc.nextLine();
    int depo = Integer.parseInt(x);
    
    if (accountNumber == acc[0]){
    bal[0] = bal[0] + depo;
    out.println("Your new balance: " + "R" + bal[0]);
    MainMenu(accountNumber);
    }
    else if (accountNumber == acc[1]){
    bal[1] = bal[1] + depo;
    out.println("Your new balance: " + "R" + bal[0]);
    MainMenu(accountNumber);
    }
    else if (accountNumber == acc[2]){
    bal[2] = bal[2] + depo;
    out.println("Your new balance: " + "R" + bal[0]);
    MainMenu(accountNumber);
    }
    
    }
    
    public static void withdraw(int accountNumber,int bal[]){
      Scanner sc = new Scanner(System.in);
    out.print("please enter the amount you would like to withdraw\n");
    String x = sc.nextLine();
    int draw = Integer.parseInt(x);
    
    if (accountNumber == acc[0]){
        if (draw <= bal[0]){
    bal[0] = bal[0] - draw;
    out.println("Your new balance: " + "R" + bal[0]);
    MainMenu(accountNumber);
    }
        else{
        out.print("that amount is higher than your balance\n");
        withdraw(accountNumber, bal);}
    } 
    
    else if (accountNumber == acc[1]){
        if (draw <= bal[1]){
    bal[1] = bal[1] - draw;
    out.println("Your new balance: " + "R" + bal[1]);
    MainMenu(accountNumber);
    } else{
        out.print("that amount is higher than your balance\n");
        withdraw(accountNumber, bal);} 
    } 
        
    else if (accountNumber == acc[2]){
        if (draw <= bal[2]){
    bal[2] = bal[2] - draw;
    out.println("Your new balance: " + "R" + bal[2]);
    MainMenu(accountNumber);
    } else{
        out.print("that amount is higher than your balance\n");
        withdraw(accountNumber, bal);} }
    }
    
    public static void Tranfer(int accountNumber, int bal[]){
    Scanner sc = new Scanner(System.in);
    out.print("please enter the account number you want to transfer too\n");
    String x = sc.nextLine();
    int account = Integer.parseInt(x);
    if (account == acc[0]) {
        out.println("please enter the amount you wish to transer");
        String y = sc.nextLine();
        int transfer = Integer.parseInt(y);
        
         
        if (accountNumber == acc[1]) {
            if (transfer > bal[1]){
                out.print("your balance is too low\n try again\n");
                Tranfer(accountNumber,  bal);
            } else {
            bal[1] -= transfer;
            bal[0] += transfer;
            out.print("your balance is currently: " + "R"+ bal[1]);
            MainMenu(accountNumber);
        }
        }if (accountNumber == acc[2]) {
            if (transfer > bal[2]){
            out.print("Your balance is too low\n try again\n");
                            Tranfer(accountNumber,  bal);

            } else {
            bal[2] -= transfer;
            bal[0] += transfer;
            out.print("your balance is currently: " + "R" + bal[2]);
            MainMenu(accountNumber);
            }
    }
    }else if (account == acc[1]) {
    out.println("please enter the amount you wish to transer");
        String y = sc.nextLine();
        int transfer = Integer.parseInt(y);
        
        //check which user is sending money
        if (accountNumber == acc[0]) {
            //check if the amount he/she wants to send is bigger than he/she has in bank account
           if (transfer >  bal[0] ){
               out.print("Your balance is too low\n try again\n");
                               Tranfer(accountNumber,  bal);

            }   else{
            bal[0] -= transfer;
            bal[1] += transfer;
            out.print("your balance: " + "R" + bal[0]);
            MainMenu(accountNumber);
           }
           
        }if (accountNumber == acc[2]) {
            if ( transfer > bal[2]){
                out.print("Your balance is too low\n try again\n");
                                Tranfer(accountNumber,  bal);

            } else{
            bal[2] -= transfer;
            bal[1] += transfer;
            out.print("your balance: " + "R" + bal[2]);
            MainMenu(accountNumber);

            }
        }
    } else if (account == acc[2]) {
    out.println("please enter the amount you wish to transer");
        String y = sc.nextLine();
        int transfer = Integer.parseInt(y);
        
        
        if (accountNumber == acc[0]) {
            if (transfer > bal[0]) {
                out.print("Your balance is too low\n try again\n");
                                Tranfer(accountNumber,  bal);

            } else {
            bal[0] -= transfer;
            bal[2] += transfer;
            out.print("your balance is currently: " + "R" + bal[0]);
            MainMenu(accountNumber);
        }
        }if (accountNumber == acc[1]) {
            if (transfer > bal[1]) {
                out.print("Your balance is too low\n try again\n");
                                Tranfer(accountNumber,  bal);

            } else {
            bal[1] -= transfer;
            bal[2] += transfer;
            out.print("your balance is currently: " + "R" + bal[1]);
            MainMenu(accountNumber);
            }
        }
    }
    
    }
    
    public static int LogOut( int accountNumber){
    Scanner sc = new Scanner(System.in);
    out.print("Please enter your account number\n");
    String x = sc.nextLine();
    int newAcc = Integer.parseInt(x);
    
    accountNumber = newAcc;
    
      //check if user input is = to any number in array
        if (accountNumber == acc[0]){
           
    
            //call the passval method
            passval(accountNumber);
    }
        else if (accountNumber == acc[1]){
            
    
            //call the passval method
            passval(accountNumber);
    }
        else if (accountNumber == acc[2]){
            
    
            //call the passval method
            passval(accountNumber);
    }
    
    return accountNumber;
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        Scanner sc = new Scanner(System.in);
            out.println("please enter your account number");

        String x = sc.nextLine();
        int accountNumber = Integer.parseInt(x);  
        
        
       
        
        validation(accountNumber);
        } catch 
        (NumberFormatException e){
        
        out.print("sorry thats not a number, goodbye");
         }
    }
    
}
