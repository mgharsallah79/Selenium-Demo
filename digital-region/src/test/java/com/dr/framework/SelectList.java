package com.dr.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SelectList extends Control {

	public SelectList(Page parentValue, By locatorValue) {
		super(parentValue, locatorValue);
		// TODO Auto-generated constructor stub
	}
	
	public Select getSelect() {
		
		return new Select(this.getElement());
	}
	
	public void selectByText(String value) {
		
		this.exists();
		this.getSelect().selectByVisibleText(value);
	}

}
