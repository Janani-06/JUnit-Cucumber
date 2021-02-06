package org.baseclass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {

	public static AppiumDriver<MobileElement> driver;

	public void launchApp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.snapdeal.main");
		cap.setCapability("appActivity", "com.snapdeal.ui.material.activity.MaterialMainActivity");
		URL u = new URL("http://localhost:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(u, cap);

	}

	public void closePopup(MobileElement element) {
		element.click();

	}

	public void Profile(MobileElement element) {
		element.click();
	}

	public void login(MobileElement element) {
		element.click();

	}

	public void txt(MobileElement element, String txt) {
		element.sendKeys(txt);
		

	}

}
