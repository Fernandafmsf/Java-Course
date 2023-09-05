import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro N e uma matriz de
//ordem N contendo números inteiros. Em seguida, mostrar a diagonal
//principal e a quantidade de valores negativos da matriz.

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][]mat = new int[n][n];//mat aponta para um objeto que inicia com 0
        System.out.println(mat.length);
        for(int i=0;i<mat.length;i++){//percorre linhas
            for(int j=0;j<mat[i].length;j++){//percorre colunas e as povoa
                mat[i][j]=sc.nextInt();//[0][0]; [0][1].... e vai armazenando
            }

        }

        System.out.println("Main diagonal:");
        for(int i=0;i<n;i++){
            System.out.print(mat[i][i]+" ");//diagonal é quando a coluna e a linha possuem o mesmo numero
        }

        System.out.println();

        //informando numeros negativos
        int count=0;
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){//mat[i].length informa o tamanho da linha da matriz, já que 'i' se refere as linhas
                if(mat[i][j]<0){
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: "+count);

        sc.close();
    }
}