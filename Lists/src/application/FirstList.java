package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstList {
    public static void main(String[] args) {
        //definindo uma lista do tipo String
        //Obs.: sempre usar wrapper class. Tipo primitivo nao funciona
        List<String> firstList= new ArrayList<>();

        firstList.add("Maria");
        firstList.add("Alex");
        firstList.add("Bob");
        firstList.add("Anna");
        //adicionando elemento em uma posição pre definida (2)
        firstList.add(2,"Marco");

        //tamanho da lista
        System.out.println("First List size:"+firstList.size());
        //laço for each. Exibir todos os elementos da lista
        System.out.println("First List Itens: ");
        for (String x: firstList){
            System.out.println(x);
        }

        System.out.println("-------------");
        //removendo itens que comecem com a letra 'm'
        System.out.println("List with removed item (the ones which first letter is M)");
        firstList.removeIf(x->x.charAt(0)=='M');
        for (String x: firstList){
            System.out.println(x);
        }

        System.out.println("--------------");
        //exibindo posição de elementos
        System.out.println("Index of Bob:"+ firstList.indexOf("Bob"));
        System.out.println("Index of Marco: "+firstList.indexOf("Marco"));
        //se elemento não existir na lista, indexof retorna 'null'

        System.out.println("--------------");
        //montando uma nova lista  que terá os elementos que coomeçam com a letra 'a' da primeira lista

        //firstList.stream -> transforma a lista em stream
        //filtra esse stream -> procura elementos que começam com A
        //transforma de stream para lista novamente
        //ao inves de '.toList()', pode-se usar '.collect(Collectors.toList())

        List<String> secondList = firstList.stream().filter(x->x.charAt(0) == 'A').toList(); //lambda function -> retorna true or false
        System.out.println("Second List itens: ");
        for(String x: secondList){
            System.out.println(x);
        }

        //Encontrar o primeiro elemento que comece com uma letra em específico
        System.out.println("------------");
        String nome= firstList.stream().filter(x->x.charAt(0)=='A').findFirst().orElse(null);
        System.out.println("First name found: "+nome);






    }
}
