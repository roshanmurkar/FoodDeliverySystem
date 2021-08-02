package com.bl.fds;

public class FoodItem {
	

	enum Taste{
		SWEET, SALTY, SPICY; 
	}

	enum Type{
		VEG, NONVEG;
	}

	enum Category{
		STARTERS, MAINCOURSE, JUICES, SWEETS; 
	}

	protected Taste taste;
	protected int price;
	protected Type type;
	protected Category category;
	
	@Override
	public String toString() {
		return "FoodItem [taste=" + taste + ", price=" + price + ", type=" + type + ", category=" + category + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}


