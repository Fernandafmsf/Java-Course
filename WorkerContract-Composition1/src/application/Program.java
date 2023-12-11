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

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.println("Enter Worker data:");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Level:");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary:");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel),baseSalary,new Department(department));

        System.out.print("How many contracts to this worker? ");
        int quantidadeContratos = sc.nextInt();

        for (int i=0;i<quantidadeContratos;i++){
            System.out.println("Enter contract #"+(i+1)+" data: ");
            System.out.print("Date (dd/mm/yyyy): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value (per hour): ");
            double hourSalary = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, hourSalary,hours);
            worker.addContract(contract);

        }

        System.out.print("Enter month and year to calculate income (mm/yyyy) : ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for "+monthAndYear+ ": "+String.format("%.2f", worker.income(year,month)));


        sc.close();
    }
}