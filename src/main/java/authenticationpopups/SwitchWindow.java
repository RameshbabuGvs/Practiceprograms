package authenticationpopups;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchWindow {
WebDriver driver;
public SwitchWindow(WebDriver driver) {
	this.driver=driver;
}
public boolean toTitle(String title) {
	String parentwindow=driver.getWindowHandle();
	Set<String>windows=driver.getWindowHandles();
	for(String winID:windows) {
		if(!winID.equals(parentwindow)) {
			driver.switchTo().window(winID);
			if(driver.getTitle().equals(title)) {
				return true;
			}
			
			driver.switchTo().window(parentwindow);
		}
	}
	
	return false;
	
}

public boolean toTitletab(String title) {
	String parentwindow=driver.getWindowHandle();
	Set<String>windows=driver.getWindowHandles();
	for(String winID:windows) {
		if(!winID.equals(parentwindow)) {
			driver.switchTo().window(winID);
			String Currenttitle=driver.getTitle();
			if(Currenttitle.equals(title)) {
				System.out.println("Tab has been matched");
				return true;}
			driver.switchTo().window(parentwindow);}}
	return false;}



public boolean toURL(String url) {
	String parent_window=driver.getWindowHandle();
	Set<String>windows=driver.getWindowHandles();
	for(String winID:windows) {
		if(!winID.equals(parent_window)) {
			driver.switchTo().window(winID);
			if(driver.getCurrentUrl().equals(url)) {
				return true;
				
			}
			driver.switchTo().window(parent_window);
		}
	}
	return false;
}



}

