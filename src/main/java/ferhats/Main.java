package ferhats;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee employee = context.getBean("employeeImpl", Employee.class);

        System.out.println("Çalışanın saatlik ücretini gitiniz..");
        int i = Integer.parseInt(scanner.nextLine());

        employee.paySalary(i);

        context.close();

    }

}
