package Order;

import java.util.Vector;

public class AdditionalOrder implements OrderSet{

	
	public Vector<Object> menus = new Vector();
	public Vector<NameAndCount> simple_menus=new Vector();
	
	public void AddSimpleMenus(String name,int count) {
		boolean equal=false;
		for(int i=0;i<simple_menus.size();i++) {
			NameAndCount obj=simple_menus.elementAt(i);
			if(obj.MemuName.equals(name)) {
				equal=true;
				obj.MenuCount+=count;
				break;
			}
			else {
				continue;
			}
		}
		if(equal==false) {
			NameAndCount n = new NameAndCount();
			n.MemuName=name;
			n.MenuCount=count;
			simple_menus.add(n);
		}
	}

}
