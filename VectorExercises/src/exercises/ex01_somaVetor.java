package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex01_somaVetor {
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you insert:");
        int n =sc.nextInt();
        double [] vect = new double[n];
        double soma=0;
        double media=0;

        for(int i=0;i<vect.length;i++){
            System.out.print("Insert a number:");
            vect[i]=sc.nextDouble();
        }
        System.out.print("Valores=");

        for(int i=0;i<vect.length;i++){
            System.out.print(vect[i]+" ");
            soma+=vect[i];
        }

        media=soma/n;
        System.out.println("\nSoma="+soma);
        System.out.println("Media="+media);

        sc.close();

    }
}
