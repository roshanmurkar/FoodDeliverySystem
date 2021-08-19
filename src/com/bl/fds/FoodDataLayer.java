package com.bl.fds;
import com.bl.fds.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FoodDataLayer {
	//List<FoodItem>foodList = new ArrayList<FoodItem>();
	Set<FoodItem> foodList = new HashSet<>();
	public void add(FoodItem foodItem) {
		foodList.add(foodItem);	
	}
	
	public void print() {
		for(Object foodItem : foodList) {
			System.out.println(foodItem);
			
		}
	}
	
	public void delete(FoodItem foodItem) {
		foodList.remove(foodItem);
	}
	
//	public FoodItem getFoodItem(String name) {
//		for(int i=0; i<foodList.size(); i++) {
//			System.out.println(i);
//			if(name.equals(foodList.get(i).name)) {
//				return foodList.get(i);
//			}
//		}
//		return null;
//	}
	
	
	public FoodItem getFoodItem(String name) {
//		for (FoodItem foodItem : foodList) {
//			if(foodItem.name.equalsIgnoreCase(name)) {
//				return foodItem;
//			}
//			
//		}
		if(foodList.size()>0) {
			return foodList.stream().filter(foodItem -> foodItem.name
					.equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
		}
		else {
			return null;
		}
		
	}
}
