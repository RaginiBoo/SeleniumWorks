package Com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//login Amazon website
public class Amazon_login_page {
WebDriver driver;
By clicksign=By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]");
By username= By.id("ap_email");
By next=By.xpath("//*[@id=\"continue\"]");
By password=By.id("ap_password");
By login=By.xpath("//*[@id=\"signInSubmit\"]");

public Amazon_login_page(WebDriver driver)
{
	this.driver=driver;
}
//click the sigin option
public void click_signin()
{
	driver.findElement(clicksign).click();
}
// enter username
public void userid(String values)
{
	 driver.findElement(username).sendKeys(values);
}
//click the continue button
public void next()
{
	 driver.findElement(next).click();
}
// enter password
public void pass(String values)
{
	 driver.findElement(password).sendKeys(values);
}
//click the login button
public void sign_in()
{
	 driver.findElement(login).click();
}
}



		





 


