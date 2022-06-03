import business.abstracts.ProductService;
import business.concretes.ProductManager;
import dataAccess.abstracts.ProductRepository;
import dataAccess.concretes.hibernateImpls.ProductHibernateRepository;
import dataAccess.concretes.jdbcImpls.ProductJdbcRepository;
import entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductService service=new ProductManager(new ProductJdbcRepository());
		service.add(new Product());
		
		

	}

}
