import business.abstracts.ProductService;
import business.concretes.ProductManager;
import dataAccess.abstracts.ProductRepository;
import dataAccess.concretes.hibernateImpls.ProductHibernateRepository;
import dataAccess.concretes.jdbcImpls.ProductJdbcRepository;
import entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(1,"isim",1000,20);
		ProductService service=new ProductManager(new ProductJdbcRepository());
		service.add(product);
		
		Product product1 = new Product(1,"isim1",1000,20);
		Product product2 = new Product(1,"isim2",0,20);
		Product product3 = new Product(1,"isim4",1000,20);
		Product product4 = new Product(1,"isim4",1000,20);
		//Product product5 = new Product(1,"isim5",5,20);
		//Product product6 = new Product(1,"isim6",1000,20);
		//Product product7 = new Product(1,"isim7",1000,20);
		//Product product8 = new Product(1,"isim8",1000,20);
		service.add(product1);
		service.add(product2);
		service.add(product3);
		service.add(product4);
		
		
		

	}

}
