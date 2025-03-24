package edu.example.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class PageTwo extends Composite {
	private HorizontalPanel hPanel = new HorizontalPanel();
	
	public PageTwo() {
		initWidget(hPanel);
		hPanel.setBorderWidth(1);
		
		FlexTable tbl = new FlexTable();
		Label lbl1 = new Label("1");
		Label lbl2 = new Label("2");
		Label lbl3 = new Label("3");
		Label lbl4 = new Label("4");
		
		tbl.setWidget(0, 0, lbl1);
		tbl.setWidget(0, 1, lbl2);
		tbl.setWidget(1, 0, lbl3);
		tbl.setWidget(1, 1, lbl4);
		
		hPanel.add(tbl);
	}
}
