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

        List <Employee> employeeList = new ArrayList<>();

        for(int i=1;i<=n;i++){
            System.out.println("Employee #"+i);
            System.out.print("Id:");
            int id=sc.nextInt();
            while(hasId(employeeList,id)){
                System.out.println("Id already taken. Insert another");
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


        sc.close();
    }
    public static boolean hasId(List<Employee> list, int id){
        Employee emp= list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
        return emp !=null;

    }
}
