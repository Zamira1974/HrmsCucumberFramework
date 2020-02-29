package com.my.hrms.testbase;

import com.my.hrms.pages.MyAddEmployeePageElements;
import com.my.hrms.pages.MyLoginPageElements;
import com.my.hrms.pages.MyPersonalDetailsPageElements;


public class PageInitializer extends BaseClass {

	protected static MyLoginPageElements login;
	protected static MyAddEmployeePageElements addEmployee;
	protected static MyPersonalDetailsPageElements myPersonDet;

	public static void initializeAllPage() {

		login = new MyLoginPageElements();
		addEmployee = new MyAddEmployeePageElements();
		myPersonDet = new MyPersonalDetailsPageElements();
	}
}