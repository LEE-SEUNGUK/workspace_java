package cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

	String name;
	ArrayList<Coffee> menuList = new ArrayList<>();
	
	public Cafe(String name) {
		this.name = name;
	}
	
	public void addCoffee(Coffee cf) {
		menuList.add(cf);
	}
	
	public void buyCoffee(Scanner sc) {
		
	}
}