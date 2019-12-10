package Stock;

import java.util.Vector;


public class stock {
	
	String ICEstraw = "ICE���뻡��";
	String HOTstraw = "HOT���뻡��";
	String Tissue = "����";
	String CupHolder = "��Ȧ��";
	String PlasticCup ="�ö�ƽ��";
	String PaperCup ="������";
	String Fork = "��ȸ����ũ";
	
	public static int ice_straw=30;
	public static int hot_straw=30;
	public static int tissue=60;
	public static int cupholder=60;
	public static int plasticcup=30;
	public static int papercup=30;
	public static int fork=30;
	
	public static int StockManage[] = new int[7] ;
	public String namearr[]= {ICEstraw ,HOTstraw,Tissue,CupHolder,PlasticCup,PaperCup,Fork};
	public Vector<String> SearchResult = new Vector();
	
	public void init() {
		SearchResult.add(ICEstraw);
		SearchResult.add(HOTstraw);
		SearchResult.add(Tissue);
		SearchResult.add(CupHolder);
		SearchResult.add(PlasticCup);
		SearchResult.add(PaperCup);
		SearchResult.add(Fork);
	}
	public void Refresh() {
		StockManage[0]=ice_straw;
		StockManage[1]=hot_straw;
		StockManage[2]=tissue;
		StockManage[3]=cupholder;
		StockManage[4]=plasticcup;
		StockManage[5]=papercup;
		StockManage[6]=fork;
	}
	public void SearchExistStock(String name) {
		SearchResult.removeAllElements();
		for(int i=0;i<7;i++) {
			if(namearr[i].contains(name)==true) {
				SearchResult.add(namearr[i]);		
			}
			if(namearr[i].contains(name)==false) {
				continue;				
			}
		}	
		System.out.println("��ġ�ϴ»�ǰ����");
	}
	
	public void Print() {
		for(int i=0;i<7;i++) {
			System.out.print(StockManage[i]);
		}
	}
	public void AddStock(String name, int count) {
		if(name.equals(ICEstraw)) {
			ice_straw+=count;
		}
		if(name.equals(HOTstraw)) {
			hot_straw+=count;
		}
		if(name.equals(Tissue)) {
			tissue+=count;
		}
		if(name.equals(CupHolder)) {
			cupholder+=count;
		}
		if(name.equals(PlasticCup)) {
			plasticcup+=count;
		}
		if(name.equals(PaperCup)) {
			papercup+=count;
			
		}
		if(name.equals(Fork)) {
			fork+=count;
		}	
	}
	

}
