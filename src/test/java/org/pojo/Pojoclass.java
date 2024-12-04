package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends BaseClass{

public	Pojoclass(){
	PageFactory.initElements(driver, this);
}
	
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getCreateAcc() {
		return createAcc;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getShowPass() {
		return showPass;
	}
	public WebElement getSignUp() {
		return signUp;
	}
	
	@FindBy(xpath = "(//a[@data-link-type='nav-global'])[5]")
	private WebElement signin;
	@FindBy(xpath = "//a[@title='Create an Account']")
	private WebElement createAcc;
	@FindBy (id="dwfrm_profile_customer_firstname")
	private WebElement firstname;
	@FindBy(id = "dwfrm_profile_customer_lastname")
	private WebElement lastname;
	@FindBy(name="dwfrm_profile_customer_email")
	private WebElement email;
	@FindBy(xpath = "//input[@placeholder='Create Password']")
	private WebElement password;
	@FindBy(xpath="//button[@type='button']")
	private WebElement showPass;
	@FindBy(name = "dwfrm_profile_confirm")
	private WebElement signUp;
	
}
