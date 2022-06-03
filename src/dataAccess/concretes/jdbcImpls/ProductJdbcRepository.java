package dataAccess.concretes.jdbcImpls;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ProductRepository;
import entities.concretes.Product;

public class ProductJdbcRepository implements ProductRepository {
	List<Product> products = new ArrayList<Product>();

	@Override
	public void add(Product product) {

		if (!checkIfProductExist(product.getName())) {

			int temp = 0;
			for (Product item : products) {

				if (item.getCategoryID() == product.getCategoryID()) {

					temp = temp + 1;

				}

			}

			if ((temp < 5) && (product.getUnitPrice() > 0)) {
				products.add(product);
				System.out.println("jdbc ile eklendi" + product.getName());
			}
			
			else {
				System.out.println("fiyatý sýfýrdan fazla ve farklý kategoride ürün girin");
			}

		} else {
			System.out.println("Farklý bir ürün girin");
		}

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

	public boolean checkIfProductExist(String productName) {
		boolean exist = false;
		for (Product product : products) {
			if (product.getName() == productName)
				exist = true;
		}

		return exist;
	}
}
