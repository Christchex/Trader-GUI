package Shipbuilder;

public enum Ships {
	TEMPEST(8, 15, 18, 40, 20, 35, 2, 40);
	private final int speed;
	private final int detection;
	private final int armour;
	private final int space;
	private final int maneouverability;
	private final int hullIntegrity;
	private final int turretRating;
	private final int shipPoints;
	
	private Ships(int speed, int detection, int armour, int space, int maneouverability, int hull, int turretRating, int points){
		this.speed = speed;
		this.detection = detection;
		this.armour = armour;
		this.space = space;
		this.maneouverability = maneouverability;
		this.hullIntegrity = hull;
		this.turretRating = turretRating;
		this.shipPoints = points;
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
	

}
