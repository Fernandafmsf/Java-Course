package exercises;


import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
public class ex00 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números irá digitar:");
        int n = sc.nextInt();
        if(n>10){
            System.out.println("Insira um número inteiro positivo até 10");
        }
        int[] vect =new int[n];

        for (int i=0;i<vect.length;i++){
            System.out.print("Insira um numero:");
            vect[i]=sc.nextInt();
        }
        for (int i=0;i<vect.length;i++){
            if(vect[i]<0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}