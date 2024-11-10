package ex1_employee;

import java.util.Scanner;

public class Ex1_Employee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        int paymentPerHour = Integer.parseInt(sc.nextLine());
        int workingHours = Integer.parseInt(sc.nextLine());
        IEmployee p1 = new PartTimeEmployee(name, paymentPerHour, workingHours);
        
        System.out.println("Part-time employee name: " + p1.getName());
        System.out.println("Part-time employee salary: " + p1.calculateSalary());
        
        name = sc.nextLine();
        p1 = new FullTimeEmployee(name, paymentPerHour);
        
        System.out.println("Full-time employee name: " + p1.getName());
        System.out.println("Full_time employee salary: " + p1.calculateSalary());
    }
    
}
