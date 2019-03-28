package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumFirefox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\Java\\SeleniumBrowserlaunch\\Driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&_ga=2.146331636.159513436.1545387969-1048471073.1543225467");
//driver.quit();
}
}
