package Table;

import java.util.Scanner;
import java.util.Vector;
import Menus.*;
import Order.NameAndCount;
import Order.OrderSet;

public class TableManage {
	
	public static int tablenum;
	public static Vector <Object> ttttt = new Vector<Object>(12,1);
	public static Vector <Object> sssss = new Vector<Object>(12,1);
	public static Vector <Object> aaaaa = new Vector<Object>(12,1);
	
	public static Thread thread1 = new Thread();
	public static Thread thread2 = new Thread();
	public static Thread thread3 = new Thread();
	public static Thread thread4 = new Thread();
	public static Thread thread5 = new Thread();
	public static Thread thread6 = new Thread();
	public static Thread thread7 = new Thread();
	public static Thread thread8 = new Thread();
	public static Thread thread9 = new Thread();
	public static Thread thread10 = new Thread();
	public static Thread thread11 = new Thread();
	public static Thread thread12 = new Thread();
	
	
	static public int tablecount=12;
	static public int NowTableCount=8;
	
	public void init() {
		for(int i=0;i<tablecount;i++) {		
			CanClass temp = new CanClass();
			ttttt.add(temp);
		}	
		for(int i=0;i<tablecount;i++) {		
			CanClass temp = new CanClass();
			sssss.add(temp);
		}
		for(int i=0;i<tablecount;i++) {		
			CanClass temp = new CanClass();
			aaaaa.add(temp);
		}
	}
	public void addTable() {

		if(tablecount>11) {
			System.out.println("더이상추가불가");
			return;
		}
		else {
			CanClass temp = new CanClass();
			ttttt.add(temp);
		}

	}
	public boolean CheckFullTable() {
		for(int i=0; i<NowTableCount;i++) {
			Object obj = ttttt.get(i);
			if(obj instanceof CanClass) {
				return false;
			}
		}
		return true;
	}
	public void SetTable(Vector v) {
		ttttt.insertElementAt(v, tablenum-1);
		ttttt.remove(tablenum);
	}

	public void SetSimpleTable(Vector v) {
		sssss.insertElementAt(v, tablenum-1);
		sssss.remove(tablenum);	
	}
	public void SetAdditionalOrder(Vector v) {
		aaaaa.insertElementAt(v, tablenum-1);
		aaaaa.remove(tablenum);	
	}
	
	public String getSimpleTable(int tablenum) {
		String str="";
		if(sssss.elementAt(tablenum-1) instanceof Vector) {
			Vector v = (Vector) sssss.elementAt(tablenum-1);
			for(int i=0;i<v.size();i++) {
				NameAndCount t = (NameAndCount) v.elementAt(i);
				str+=t.MemuName+"("+t.MenuCount+")\n";
			}
		}
		return str;
	}
	
	public boolean ClearTable() {

			System.out.println(ttttt.size());
			CanClass v = new CanClass();
			ttttt.insertElementAt(v, tablenum-1);
			ttttt.remove(tablenum);
			System.out.println(ttttt.size());
			if( ttttt.elementAt(tablenum-1) instanceof CanClass) {
				System.out.println("테이블청소됨");
				return true;
			}
			return false;
		
	}
	public Vector GetOrder(int tablenum) {
	
		return (Vector) ttttt.elementAt(tablenum-1);
		
	}
}
