package application;

import model.dao.DaoFactory;
import model.dao.DeparmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DeparmentDao deparmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: seller insert ===");
        Department newDepartment = new Department(null,
                "New Department Test");
        deparmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());


        sc.close();
    }
}
