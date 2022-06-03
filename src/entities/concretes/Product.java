package entities.concretes;

public class Product {
	
	private int id;
	private String name;
	private int unitPrice;
	private int categoryID;
	
	public Product() {
		super();
	}
	public Product(int id, String name, int unitPrice, int categoryID) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.categoryID=categoryID;
		
	}
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	
	

}
