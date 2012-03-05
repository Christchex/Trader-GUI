package Shipbuilder;

public class Ship {
	private int armour;
	private int speed;
	private int maneouverability;
	private int hullIntegrity;
	private int turretRating;
	private int shields;
	private int power;
	private int shipPoints;
	private int space;
	private int detection;
	
	public Ship(Ships ship){
		this.speed = ship.getSpeed();
		this.armour = ship.getArmour();
		this.hullIntegrity = ship.getHullIntegrity();
		this.turretRating = ship.getTurretRating();
		this.shipPoints = ship.getShipPoints();
		this.space = ship.getSpace();
		this.detection = ship.getDetection();
		this.maneouverability = ship.getManeouverability();
	}
	public int getSpeed(){
		return this.speed;
	}
	public int getArmour(){
		return this.armour;
	}
	public int getDetection(){
		return this.detection;
	}
	public int getSpace(){
		return this.space;
	}
	public int getManeouverability(){
		return this.maneouverability;
	}
	public int getHullIntegrity(){
		return this.hullIntegrity;
	}
	public int getTurretRating(){
		return this.turretRating;
	}
	public int getShipPoints(){
		return this.shipPoints;
	}
	public static void main(String args[]){
		Ship a = new Ship(Ships.TEMPEST);
		String returned = "Armour: " + a.getArmour();
		System.out.println(returned);
	}
}
