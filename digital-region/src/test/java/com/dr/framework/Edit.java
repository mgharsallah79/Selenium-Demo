package com.dr.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Edit extends Control {

	public Edit(Page parentValue, By locator) {
		
		super(parentValue,locator);
	}
	
	public void setText(String value) {
		
		this.click();
		this.getElement().clear();
		this.getElement().sendKeys(value);
		//this.getElement().sendKeys((Keys.RETURN));
	}

}
