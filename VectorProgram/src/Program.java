import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many heights will you insert:");
        int n = sc.nextInt();
        //criando vetor
        //em double [n] está sendo definido a quantidade de elementos no vetor
        double[] vect=new double[n];

        double totalHeight=0;
        for(int i=0;i<n;i++){
            System.out.print("Insert a height:");
            vect[i]=sc.nextDouble();
            totalHeight= (vect[i]+totalHeight);
        }
        double averageHeight = totalHeight/n;
        System.out.print("Average Height: "+averageHeight);


        sc.close();
    }
}