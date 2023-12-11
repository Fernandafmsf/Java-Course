package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enumeracao.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departments name:");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Level:");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary:");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel),baseSalary, new Department(departmentName));
        //new department porque dentro do objeto temos o apontadmento para o objeto departamento, por isso o instancioamso na hora
        //estoa associados entre si

        System.out.print("How many contracts to this worker?");
        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            System.out.println("Enter contract #"+i+"data:");
            System.out.print("Date(DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour:");
            double hourValue = sc.nextDouble();
            System.out.print("Duration(hour):");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate,hourValue,hours);

            worker.addContract(contract);


        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        //recortando a data manualmente
        int month=Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        //composiçao de objetos
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for "+monthAndYear+": "
                +String.format("%.2f", worker.income(year,month)));

        sc.close();

    }
}
