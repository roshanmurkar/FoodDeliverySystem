package com.bl.fds;

public class Main {

	public static void main(String[] args) {
		MasalaDosa masalaDosa = new MasalaDosa();
		masalaDosa.setPrice(100);
		
		ChickenMasala chickenMasal = new ChickenMasala();
		chickenMasal.setPrice(500);
		
		VegThali vegThali = new VegThali();
		vegThali.setPrice(350);
		
		Biryanni biryanni = new Biryanni();
		biryanni.setPrice(250);
		
		FoodDataLayer foodDataLayer = new FoodDataLayer();
		foodDataLayer.add(biryanni);
		foodDataLayer.add(chickenMasal);
		foodDataLayer.add(masalaDosa);
		foodDataLayer.add(vegThali);
		
		foodDataLayer.print();
		
	}

}
