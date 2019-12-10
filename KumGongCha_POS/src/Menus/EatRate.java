package Menus;
import java.util.Random;
import java.util.Vector;

public class EatRate implements Runnable {
	
	private Vector menu ;
	public void EatRateSet(Vector menu) {
		this.menu = menu;
	}

	public synchronized boolean check() {
		for (int k = 0; k < menu.size(); k++) {
			Object o = menu.elementAt(k);
			if (o instanceof Drink){
				Drink drink = (Drink) o;
				if (drink.eatrate != 0) {
					return false;
				}
			}
			if (o instanceof Dessert){
				Dessert des = (Dessert) o;
				if (des.eatrate != 0) {
					return false;
				}
			}
			if (o instanceof Accessory){
				Accessory acc=(Accessory) o;
				if (acc.eatrate != 0) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public synchronized void run() {
		Random random = new Random();

		while (true) {
			
			String str = "";
			for (int j = 0; j < menu.size(); j++) {
				Object o=menu.elementAt(j);
				if (o instanceof Drink){
					Drink drink = (Drink) o;
					str += drink.name + ":" + drink.eatrate + "% ";
				}
				if (o instanceof Dessert){
					Dessert des = (Dessert) o;
					str += des.name + ":" + des.eatrate + "% ";
				}
				if (o instanceof Accessory){
					Accessory acc=(Accessory) o;
					str += acc.name + ":" + acc.eatrate + "% ";
				}
				
				
			}
			for (int i = 0; i < menu.size(); i++) {
				Object o=menu.elementAt(i);
				if (o instanceof Drink){
					Drink drink = (Drink) o;
					if (drink.eatrate != 0) {
						drink.eatrate -= random.nextInt(10);
						if (drink.eatrate < 0) {
							drink.eatrate = 0;
						}
					}
				}
				if (o instanceof Dessert){
					Dessert des = (Dessert) o;
					if (des.eatrate != 0) {
						des.eatrate -= random.nextInt(10);
						if (des.eatrate < 0) {
							des.eatrate = 0;
						}
					}
					
				}
				if (o instanceof Accessory){
					Accessory acc=(Accessory) o;
					if (acc.eatrate != 0) {
						acc.eatrate -= random.nextInt(10);
						if (acc.eatrate < 0) {
							acc.eatrate = 0;
						}
					}
				}

			}

			if (check() == true) {
				String str2 = "";
				for (int j = 0; j < menu.size(); j++) {
					Object o=menu.elementAt(j);
					if (o instanceof Drink){
						Drink drink = (Drink) o;
						str2 += drink.name + ":" + drink.eatrate + "% ";
					}
					if (o instanceof Dessert){
						Dessert des = (Dessert) o;
						str2 += des.name + ":" + des.eatrate + "% ";
					}
					if (o instanceof Accessory){
						Accessory acc=(Accessory) o;
						str2 += acc.name + ":" + acc.eatrate + "% ";
					}
					
					
				}				
				break;
			}
			try {
				Thread.sleep(1000);

			} 
			catch (Exception e) 
			{

			}
		}
	}

	


}
