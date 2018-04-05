package edu.handong.csee.java.labo7.prob2; // define the package name

public class Chicken_main { // class name is Chicken_main
	public static void main(String[] args) { //main method
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5); //create instance that name menu 1
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);//create instance that name menu 2
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);//create instance that name menu 3

		menu1.set_stars(3);
		menu2.set_stars(4);
		menu3.set_stars(1);

		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());
	}


}
