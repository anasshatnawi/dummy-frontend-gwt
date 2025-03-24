package edu.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTProjectOne implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		PageOne page = new PageOne();
		RootPanel.get().add(page);
	}
}
