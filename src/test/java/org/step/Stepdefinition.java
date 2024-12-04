package org.step;

import java.time.Duration;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.Pojoclass;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
public static Pojoclass p;
public static Date d;
	
	@Given("open  chromebrowser and maximize")
	public void open_chromebrowser_and_maximize() {
	    openBrowser();
	    launchUrl("https://www.aritzia.com/intl/en/home");
	    maxWindow();
	    implictWait();
	}

	@Given("clickthe signin button and click create_newAcc")
	public void clickthe_signin_button_and_click_create_new_acc() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("close")));

		WebElement close = driver.findElement(By.linkText("close"));
		close.click();
		
		
		p = new Pojoclass();
		WebElement signinBtn = p.getSignin();
		WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(signinBtn));
	     signInButton.click();
		//implictWait();
		WebElement createAccBtn = p.getCreateAcc();
		clickBtn(createAccBtn);
		
	}

	@When("Enter firstname lastname email click the checkbox and enter password click show")
	public void enter_firstname_lastname_email_click_the_checkbox_and_enter_password_click_show() {
	    implictWait();
	    p = new Pojoclass();
	    WebElement firstname = p.getFirstname();	    
	    WebElement lastname = p.getLastname();
	    WebElement email = p.getEmail();
	    fillText(firstname, "Arun");
	    fillText(lastname, "Boopathy");
	    d = new Date();
	    String emailTimestamp = d.toString().replaceAll("\\s", "").replaceAll("\\:", "")+"@gmail.com";
	    fillText(email, emailTimestamp);
	    WebElement password = p.getPassword();
	    fillText(password, "Vij@y24820000");
	    WebElement showPass = p.getShowPass();
	    clickBtn(showPass);
	    
	   
	    
	    
	}

	@When("Click signup")
	public void click_signup() {
	   p =  new Pojoclass();
	   WebElement signUp = p.getSignUp();
	   clickBtn(signUp);
	}

	@When("verify usernaame occuer in homepage")
	public void verify_usernaame_occuer_in_homepage() {
	    WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameOnHomepage = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Arun')]")));
        String displayedUsername = usernameOnHomepage.getText().trim();
        String expectedUsername = "ARUN";
        Assert.assertEquals(displayedUsername, expectedUsername, "The displayed username on the homepage is incorrect!");


	}

	@Then("quit the browser")
	public void quit_the_browser() {
	    quitBrowser();
	}

	
	
}
