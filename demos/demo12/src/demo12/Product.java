package demo12;

import java.util.Objects;

public class Product {
	private int productId;
	private String name;
	private String description;
	private String category;
	private float pricePerUnit;
	private int quantity;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, productId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && productId == other.productId;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(float pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(int productId, String name, String description, String category, float pricePerUnit, int quantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.category = category;
		this.pricePerUnit = pricePerUnit;
		this.quantity = quantity;
	}
	public Product() {
		super();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", pricePerUnit=" + pricePerUnit + "]";
	}
	
	
}
