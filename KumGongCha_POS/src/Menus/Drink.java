package Menus;
import java.util.Scanner;

public class Drink extends abstractMenu {
	
	public int eatrate=100;
	
	public boolean WhippingCheck;
	public boolean ShotCheck;
	public boolean BubbleCheck;
	public boolean SyrupCheck;
	
	public boolean Ice;
	public boolean Hot;
	
	public String strTemp;
	
	public void countset(int count) {
		this.count=count;
	}
	 
	public void SetDrinkOption(boolean Shot , boolean Whip , boolean Bubble , boolean Syrup, boolean temp) {
		WhippingCheck=Whip;
		ShotCheck=Shot;
		BubbleCheck=Bubble;
		SyrupCheck=Syrup;
		if(temp==true) {
			Ice=false;
			Hot=true;
			strTemp="HOT";
		}
		else if (temp == false) {
			Ice=true;
			Hot=false;
			strTemp="ICE";
		}
		System.out.println(strTemp);
	}


	public void nameset(String name) {
		this.name=name;
	}

}
