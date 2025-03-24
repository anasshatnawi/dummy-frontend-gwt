package edu.example.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PageOne extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private TextBox txt1; 
	private Label myLbl;
	
	public PageOne() {
		initWidget(this.vPanel);
		
		vPanel.setBorderWidth(1);
		
		this.myLbl = new Label("Hello World!");
		vPanel.add(myLbl);
		
		HorizontalPanel hPanel = new HorizontalPanel();
		hPanel.setBorderWidth(1);
		
		this.txt1 = new TextBox();
		hPanel.add(txt1);
		
		Button btn = new Button("Touch me please");
		btn.addClickHandler(new ButtonClickHandler());
		hPanel.add(btn);
		
		vPanel.add(hPanel);
		
		PageTwo two = new PageTwo();
		vPanel.add(two);
	}
	
	private class ButtonClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			myLbl.setText(txt1.getText());
		}
		
	}
}
