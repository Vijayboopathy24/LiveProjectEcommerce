package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pojoclass extends BaseClass{

	
	@FindBy(xpath = "//a[text()='Sign In']")
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
