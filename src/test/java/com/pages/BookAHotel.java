package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookAHotel extends LibGlobal {

	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "first_name")
	WebElement firstName;
	
	@FindBy(id="last_name")
	WebElement lastName;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="cc_num")
	WebElement creditNum;
	
	@FindBy(id="cc_type")
	WebElement creditType;
	
	@FindBy(id="cc_exp_month")
	WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
	WebElement expiryYear;
	
	@FindBy(id="cc_cvv")
	WebElement cvvNum;
	
	@FindBy(id= "book_now")
	WebElement bookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditNum() {
		return creditNum;
	}

	public WebElement getCreditType() {
		return creditType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}
	
	public WebElement getBookNow() {
		return bookNow;
	}
	
	public void payment(String FName, String LName, String BillAddr) {
		type(getFirstName(), FName);
		type(getLastName(), LName);
		type(getAddress(), BillAddr);
	}
	
	public void btnBook() {
		btnClick(getBookNow());

	}
}
