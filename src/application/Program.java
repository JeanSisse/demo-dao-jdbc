package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TESTE 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n\n==== TESTE 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n==== TESTE 3: seller findAll ====");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n==== TESTE 4: seller insert ====");
		Seller newSellser = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSellser);
		System.out.println("Inserted! New id = " + newSellser.getId());
		
		System.out.println("\n\n==== TESTE 5: seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Fatima Barbosa");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n\n==== TESTE 6: seller delete ====");
		System.out.print("Entre com Id para testar delete: ");
		int id = teclado.nextInt();
		sellerDao.deletById(id);
		System.out.println("Delete completed!");
		
		teclado.close();
	}
}
