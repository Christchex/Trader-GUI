package Shipbuilder;

public abstract class Component {
	private int shipPoints;
	private int power;
	private int space;
	private boolean isPowered;
	private boolean isDamaged;
	//Need to fill in all possible component statistics
	
	public Component(int shipPoints, int power, int space){
		this.shipPoints = shipPoints;
		this.power = power;
		this.space = space;
	}
	public int getPower(){
		return this.power;
	
	}
	
	public int getSpace(){
		return this.space;
	}
	public void damage(){
		
	}
	public void unPower(){
		
	}
	public boolean isPowered(){
		return isPowered;
	}
	public boolean isDamaged(){
		return isDamaged;
	}
	public int getShipPoints(){
		return this.shipPoints;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
