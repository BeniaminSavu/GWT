package org.beni.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Dashboard implements EntryPoint {

	@Override
	public void onModuleLoad() {
		MenuBar menu = new MenuBar();
		MenuBar menuCreate = new MenuBar(true);
		MenuBar menuHelp = new MenuBar(true);

		DashboardConstants messages = (DashboardConstants) GWT.create(DashboardConstants.class);
		menuHelp.addItem(messages.AboutMenuItemName(), new DummyCommand());
		menuCreate.addItem(messages.ClockMenuItemName(), new DummyCommand());
		menuCreate.addItem(messages.CalculatorMenuItemName(), new DummyCommand());
		
		menu.addItem(messages.HelpMenuItem(),menuHelp);
		menu.addItem(messages.CreateMenuItem(), menuCreate);
		
		RootPanel.get().add(menu);
	}

		private class DummyCommand implements Command {

			@Override
			public void execute() {
				Window.alert("Menu Item clicked");
			}
			
		}
}
