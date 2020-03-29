package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("==== TESTE 1: department insert ====");
		Department newDepartment = new Department(null, "Telecomunicação");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id = " + newDepartment.getId());
		
		System.out.println("==== TESTE 2: department findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
	}
}
