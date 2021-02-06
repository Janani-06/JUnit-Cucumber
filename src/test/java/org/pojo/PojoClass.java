package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PojoClass extends BaseClass {
	public PojoClass() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.snapdeal.main:id/close")
	private MobileElement close;
	
	@AndroidFindBy(id="com.snapdeal.main:id/image_view_icon")
	private MobileElement profile;
	
	@AndroidFindBy(id="btnEmptyCartSignContinue")
	private MobileElement login;
	
	@AndroidFindBy(id="com.snapdeal.main:id/firstEmailEditText")
	private MobileElement mail;
	
	@AndroidFindBy(id="com.snapdeal.main:id/continuebtn")
	private MobileElement con;

	public MobileElement getClose() {
		return close;
	}

	public MobileElement getProfile() {
		return profile;
	}

	public MobileElement getLogin() {
		return login;
	}

	public MobileElement getMail() {
		return mail;
	}
	
	public MobileElement getCon() {
		return con;
	}
		
	

}
