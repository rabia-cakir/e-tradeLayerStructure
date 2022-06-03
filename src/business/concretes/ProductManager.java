package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.ProductService;
import dataAccess.abstracts.ProductRepository;
import entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		
		productRepository.add(product);
		
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
