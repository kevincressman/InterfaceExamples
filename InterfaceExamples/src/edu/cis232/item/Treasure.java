package edu.cis232.item;

public class Treasure extends Item implements Carryable{
	int weight, size;
	
	public Treasure(int weight, int size){
		super("Treasure");
		this.weight = weight;
		this.size = size;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public int getSize() {
		return size;
	}
}
