package Shipbuilder;

import java.util.ArrayList;

public  class Ship {
	private int armour;
	private int speed;
	private int manoeuverability;
	private int hullIntegrity;
	private int turretRating;
	private int shields;
	private int power;
	private int shipPoints;
	private int space;
	private int detection;
	private String name;
	private ArrayList<Component> componentList;
	
	public Ship(Ships ship, ArrayList<Component> componentList){
		this.name = ship.getName();
		this.speed = ship.getSpeed();
		this.armour = ship.getArmour();
		this.hullIntegrity = ship.getHullIntegrity();
		this.turretRating = ship.getTurretRating();
		this.shipPoints = ship.getShipPoints();
		this.space = ship.getSpace();
		this.detection = ship.getDetection();
		this.manoeuverability = ship.getManeouverability();
		this.componentList = componentList; //This should probably use some sort of add, instead of a set. (to check compatibility)
	}
	
	public Ship(Ships ship){
		this.name = ship.getName();
		this.speed = ship.getSpeed();
		this.armour = ship.getArmour();
		this.hullIntegrity = ship.getHullIntegrity();
		this.turretRating = ship.getTurretRating();
		this.shipPoints = ship.getShipPoints();
		this.space = ship.getSpace();
		this.detection = ship.getDetection();
		this.manoeuverability = ship.getManeouverability();
	}
	//
	public void addComponent(Component c){
		
	}
	
	public String toString(){
		String returned = "";
		returned += "Name: " + name + "\n";
		returned += "Speed: " + speed + "\n";
		returned += "Armour: " + armour + "\n";
		returned += "Manoeuverability: " + manoeuverability + "\n";
		returned += "Hull Integrity: " + hullIntegrity + "\n";
		returned += "Turret Rating: " + turretRating + "\n";
		returned += "Power: " + power + "\n";
		returned += "Shields: " + shields + "\n";
		returned += "Ship Points: " + shipPoints + "\n";
		returned += "Space: " + space + "\n";
		returned += "Detection: " + detection + "\n";
		
		return returned;
	}
	//
	public void update(){
		
	}
	public static void main(String[] args){
		
		Ship a = new Ship(Ships.TEMPEST);
		a.addComponent(new Component )
		System.out.println(a.toString());
		Ship b = new Ship(Ships.LUNAR, null);
		System.out.println(b.toString());
		
	}
}
