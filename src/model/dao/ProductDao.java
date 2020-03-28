package model.dao;

import java.util.List;

import model.entities.Department;

public interface ProductDao {

	void insert(Department obj);
	void update(Department obj);
	void deletById(Department obj);
	Department findById(Department obj);
	List<Department> findAll();
}
