package application;

import entities.Rent;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rent[] vect = new Rent[10];


        System.out.print("How many rooms will be rented:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Rent #"+(i+1));
            System.out.print("Name:");
            String name= sc.next();
            System.out.print("Email:");
            String email= sc.next();

            System.out.print("Room:");
            int roomNumber= sc.nextInt();
            vect[roomNumber]=new Rent(name,email);

        }
        System.out.println("Busy rooms:");
        for(int i=0;i< vect.length;i++){
            if(vect[i]!=null){
                System.out.println(i+":"+vect[i]);
            }
        }



        sc.close();
    }
}
