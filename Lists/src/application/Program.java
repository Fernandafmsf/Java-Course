package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered:");
        int n=sc.nextInt();

        List <Employee> employeeList = new ArrayList<>();//criando lista do tipo 'employee', que é a classe criada

        for(int i=1;i<=n;i++){
            System.out.println("Employee #"+i);
            System.out.print("Id:");
            int id=sc.nextInt();
            //usando a função criada para verificar se o ID já existe
            while(hasId(employeeList,id)){
                System.out.print("Id already taken. Insert another: ");
                id=sc.nextInt();
            }

            System.out.print("Name:");
            String name=sc.next();
            sc.nextLine();

            System.out.print("Salary:");
            double salary=sc.nextDouble();

            employeeList.add(new Employee(id,name,salary));

        }

        for(Employee obj : employeeList){
            System.out.println(obj);
        }

        //atualizando salario
        System.out.println();
        System.out.print("Enter the employee number that will have salary increase:");
        int selected_id=sc.nextInt();

        // cria-se um variavel com o tipo da classe Employee. Essa nova lista criada vai receber o elemento da lista existente que coincidir com o filtro definido
        Employee emp=employeeList.stream().filter(x->x.getId()==selected_id).findFirst().orElse(null);

        if(emp == null){ //aqui pegamos o retorno da função lambda
            System.out.println("This ID does not existe.");
        }else{
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);//ao acessar um metodo de  'emp', vemos que se tornou um objeto
        }

        System.out.println();
        System.out.println("List of employees");
        for(Employee obj : employeeList){
            System.out.println(obj);
        }



        sc.close();
    }
    public static boolean hasId(List<Employee> list, int id){
        Employee emp= list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
        return emp !=null;

    }
}
