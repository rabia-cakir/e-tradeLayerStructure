package dataAccess.concretes.hibernateImpls;

import java.util.List;

import dataAccess.abstracts.ProductRepository;
import entities.concretes.Product;

public class ProductHibernateRepository implements ProductRepository {

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("hibernate ile eklendi");
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
