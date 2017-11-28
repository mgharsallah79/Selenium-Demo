package com.dr.Models;

import com.poiji.annotation.ExcelCell;

public class Passager {

	@ExcelCell(0)
	private String idPassager;

	@ExcelCell(1)
	private int age;

	@ExcelCell(2)
	private String region;

	@ExcelCell(3)
	private String carte;

	@Override
	public String toString() {
		return "Passager{" + "Id=" + idPassager + ", age='" + age + '\'' + ", region='" + region + '\''
				+ ", carte=" + carte  + '\'' + '}';
	}
}
