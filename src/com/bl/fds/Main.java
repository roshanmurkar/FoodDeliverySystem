package com.bl.fds;
import java.util.Scanner;

import com.bl.fds.*;

public class Main {

	public static void main(String[] args) {
		MasalaDosa masalaDosa = new MasalaDosa();
		masalaDosa.setPrice(100);
		
		ChickenMasala chickenMasal = new ChickenMasala();
		chickenMasal.setPrice(500);
		
		VegThali vegThali = new VegThali();
		vegThali.setPrice(350);
		
		Biryani biryani = new Biryani();
		biryani.setPrice(250);
		
		Biryani biryani1 = new Biryani();
		biryani1.setPrice(600);
		
		FoodDataLayer foodDataLayer = new FoodDataLayer();
		foodDataLayer.add(biryani);
		foodDataLayer.add(biryani1);
		foodDataLayer.add(chickenMasal);
		foodDataLayer.add(masalaDosa);
		foodDataLayer.add(vegThali);
		System.out.println(foodDataLayer.foodList.size());
		foodDataLayer.print();
//		System.out.println("***************  after delete  ***********************");
//		//foodDataLayer.delete(biryani);
//		foodDataLayer.print();
		
		
		Main main =new Main();
		main.showUserMenu();
		
	}
	
	public void showUserMenu() {
		FoodDataLayer foodDataLayer = new FoodDataLayer();
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter 1 for add the foodItem \n Enter 2 for delete foodItem \n Enter 3 for print fooditems \n "
				+ "Enter 4 for Exit \n");
		int input = scan.nextInt();
		switch (input) {
			case 1:
					break;
			case 2:
					Biryani biryani = new Biryani();
					biryani.setPrice(250);
					foodDataLayer.add(biryani);
					
					MasalaDosa dosa = new MasalaDosa();
					dosa.setPrice(50);
					foodDataLayer.add(dosa);
					foodDataLayer.print();
					
					Scanner input1 = new Scanner(System.in);
					System.out.println("Enter the foodName that you want to delete ");
					String name = input1.nextLine();
					System.out.println(foodDataLayer.foodList.size());
					//foodDataLayer.getFoodItem(name);
					FoodItem deleteFood = foodDataLayer.getFoodItem(name);
					foodDataLayer.delete(deleteFood);
					foodDataLayer.print();
					break;
			case 3:
					break;
			case 4:
					break;
			default:
					break;
		}
		
		
	}

}
