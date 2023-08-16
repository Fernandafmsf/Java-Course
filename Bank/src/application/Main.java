package application;


import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account;//criando var do objeto


        System.out.print("Enter account number: ");
        int accountNumber=sc.nextInt();

        System.out.print("Enter account holder: ");
        String name = sc.next();

        System.out.print("Is there an initial deposit (y/n)?");
         char answer = sc.next().charAt(0);

         if(answer=='y'){
             System.out.print("Enter initial answer value: ");
             double depositValue=sc.nextInt();

             account = new Account(accountNumber,name,depositValue);
         }else{
             account = new Account(accountNumber,name);
         }

         System.out.println("Account data: ");
         System.out.println(account.toString());


         System.out.print("Enter a deposit value:");
         account.deposito(sc.nextInt());

        System.out.println("Updated Account data: ");
        System.out.println(account.toString());

        System.out.println("Enter a withdraw value:");
        account.saca(sc.nextInt());

        System.out.println("Updated Account data: ");
        System.out.println(account.toString());


        sc.close();


    }







}
