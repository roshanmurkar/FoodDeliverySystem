package com.bl.fds;

import java.util.ArrayList;
import java.util.List;

public class FoodDataLayer {
	List<FoodItem>foodList = new ArrayList<>();
	
	public void add(FoodItem foodItem) {
		foodList.add(foodItem);	
	}
	
	public void print() {
		for(Object foodItem : foodList) {
			System.out.println(foodItem);
			
		}
	}
}
