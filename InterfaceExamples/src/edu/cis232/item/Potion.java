package edu.cis232.item;

public class Potion extends Item implements Drinkable, Carryable{

	int weight;
	
	public Potion(String name, int weight) {
		super(name);
		this.weight = weight;
	}
	
	public void imbibe(){
		System.out.println("You drank this potion. It did nothing");
		weight--;
	}

	public int getWeight(){
		return weight;
	}
	
	public int getSize(){
		return 3; //All potions use the same flask of size 3.
	}
}
