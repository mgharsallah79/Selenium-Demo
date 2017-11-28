package com.dr.framework;

import org.openqa.selenium.By;

public class Edit extends Control {

	public Edit(Page parentValue, By locator) {
		
		super(parentValue,locator);
	}
	
	public void setText(String value) {
		
		this.click();
		this.getElement().clear();
		this.getElement().sendKeys(value);
	}

}
