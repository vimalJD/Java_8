package java8.stream4api.model;

public class Product {
	// visibility of data type as public it's not feasible way but for practicing
	public int id;
    public String name;  
    public float price;
    
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
    
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
    
    
}
