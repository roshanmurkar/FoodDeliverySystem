package com.bl.fds;
import java.util.Objects;

import com.bl.fds.*;


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
	
//	enum FoodName{
//		BIRYANNI, CHICKENMASALA, MASALADOSA, VEGTHALI;
//	}

	
	protected Taste taste;
	protected int price;
	protected Type type;
	protected Category category;
	protected String name;
	@Override
	public String toString() {
		return "FoodItem [taste=" + taste + ", price=" + price + ", type=" + type + ", category=" + category + ", name="
				+ name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItem other = (FoodItem) obj;
		return Objects.equals(name, other.name);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}


