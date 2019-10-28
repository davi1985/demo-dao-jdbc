package application;

import model.dao.DaoFactory;
import model.dao.DeparmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DeparmentDao deparmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: department insert ===");
        Department newDepartment = new Department(null, "New Department Test");
        deparmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("=== Test 2: department update ===");
        deparmentDao.update(new Department(7, "Update Department Test"));
        System.out.println("Update completed!");

        System.out.println("=== Test 3: department deleteById ===");
        System.out.println("Enter id for delete test");
        int id = sc.nextInt();
        deparmentDao.deleteById(id);
        System.out.println("Delete completed!");

        System.out.println("=== Test 3: department findById ===");
        Department department = new Department(1, null);

        Department dataDepartment = deparmentDao.findById(department.getId());
        System.out.println(dataDepartment);

        System.out.println("=== Test 4: department findAll ===");
        List<Department> list = deparmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
        sc.close();
    }
}
