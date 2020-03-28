package model.dao;

import java.util.List;

import model.entities.Seller;

public interface ClientDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deletById(Seller obj);
	Seller findById(Seller obj);
	List<Seller> findAll();
}
