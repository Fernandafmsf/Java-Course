package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees you will insert:");
        int n = sc.nextInt();

        List<Employee> listEmployee= new ArrayList<>();

        for(int i=1;i<=n;i++){
            System.out.println("Employee #"+i);
            System.out.print("Id: ");
            int id = sc.nextInt();

            while(hasId(listEmployee, id)){
                System.out.print("Id already taken. Try again:");
                id= sc.nextInt();
            }

            System.out.print("Name:");
            String name=sc.next();
            sc.nextLine();
            System.out.print("Salary: ");
            double salary=sc.nextDouble();

            //adiciona um elemento na lista e esse elemento vai ser a instanciaçao de um objeto
            listEmployee.add(new Employee(id,name,salary));

        }

        //usando for each pra exibir os elementos. Importante definir o tipo como Employee
        for(Employee x: listEmployee){
            System.out.println(x);
        }

        System.out.println("Enter the employee id that will have salary increase");
        int selectedId=sc.nextInt();

        Employee verifyingEmployee = listEmployee.stream().filter(x->x.getId()==selectedId).findFirst().orElse(null); //atraves do id a gente pega o objeto que está nas conformidades do filter e o armazena em verifyingEmployee

        if(verifyingEmployee==null){
            System.out.println("This id is taken.");
        } else{
            System.out.println("Enter the percentage:");
            double percentage = sc.nextDouble();
            verifyingEmployee.increaseSalary(percentage);
        }

        for(Employee x: listEmployee){
            System.out.println(x);
        }

        sc.close();
    }

    //dentro dos parametros da função botar uma lista do tipo employee e um id
    //criar um obj do tipo employee para armazenar o resultado
    public static boolean hasId(List <Employee> list, int id){
        Employee emp = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
        return emp != null;

    }
}