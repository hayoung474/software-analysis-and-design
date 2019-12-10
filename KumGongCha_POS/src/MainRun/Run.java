package MainRun;

import GUI.*;
import Table.TableManage;

public class Run {
	public static void main(String[] args) {

		TableManage manage = new TableManage();
		manage.init();
		Login frame = new Login();
		frame.setVisible(true);
		
	}
}

