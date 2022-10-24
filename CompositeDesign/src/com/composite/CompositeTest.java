package com.composite;

public class CompositeTest {

	public static void main(String[] args) {
		Component hd = new Leaf(4000, "HDD");
		Component mouse = new Leaf(500, "Mouse");
		Component moniter = new Leaf(8000, "Moniter");
		Component ram = new Leaf(3000, "Ram");
		Component CPU = new Leaf(9400, "CPU");
		
		Composite ph= new Composite("peri");
		Composite cabinet= new Composite("Cabinet");
		Composite mb= new Composite("MB");
		Composite computer= new Composite("Computer");
	
		mb.addComponent(CPU);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(moniter);
		ph.addComponent(hd);
		ph.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
		
	}
}
