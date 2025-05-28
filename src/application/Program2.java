package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("=== TESTE 1: department insert ===");
//		Department dep = new Department(null, "Apple");
//		departmentDao.insert(dep);
//		System.out.println(dep);
		
		
		
		System.out.println("=== TESTE 3: department update ===");
		Department dep1 = new Department();
		dep1 = departmentDao.findById(7);
		dep1.setName("Watter");
		departmentDao.update(dep1);
		System.out.println("Update completed!");
		
		
		System.out.println("=== TESTE 2: department findById ===");
		Department department = departmentDao.findById(7);
		System.out.println(department);
		
		
		
		sc.close();

	}

}
