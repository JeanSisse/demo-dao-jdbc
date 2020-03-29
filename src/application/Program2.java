package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("==== TESTE 1: department insert ====");
		Department newDepartment = new Department(null, "Administração");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id = " + newDepartment.getId());
		
		System.out.println("\n==== TESTE 2: department findById ====");
		Department department = departmentDao.findById(5);
		System.out.println(department);
		
		System.out.println("\n==== TESTE 3: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
	}
}
