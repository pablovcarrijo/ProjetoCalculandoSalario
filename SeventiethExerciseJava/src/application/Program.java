package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced?(y/n) ");
			char outsourced = sc.next().toLowerCase().charAt(0);

			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if ( outsourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}
			else if ( outsourced == 'n') {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee em : list) {
			System.out.println(em.getName() + " - " + em.paymente());
			
		}
		
		sc.close();
		
	}
	
}
