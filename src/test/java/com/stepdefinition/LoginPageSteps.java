package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.LibGlobal;
import com.pages.BookAHotel;
import com.pages.LoginPage;
import com.pages.SearchHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends LibGlobal {
	LoginPage loginPage;
	SearchHotel searchHotel;
	BookAHotel bookAHotel;
	WebDriver driver;

	@Given("Customer is on Adactin home page")
	public void customer_is_on_Adactin_home_page() {
		driver = getDriver();
		loadUrl("http://adactinhotelapp.com/");	    
	}

	@When("Customer logged in with valid {string} and {string}")
	public void customer_logged_in_with_valid_and(String name, String pass) {
		loginPage = new LoginPage();
		loginPage.login(name, pass);   
	}

	@Then("Customer should select hotel by filling {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void customer_should_select_hotel_by_filling(String locName, String hotName, String roomType, String roomNum, String checkInDate, String checkOutDate, String adultPerRoom, String childrenPerRoom) {
		searchHotel = new SearchHotel();
		searchHotel.hotelSelection(locName, hotName, roomType, roomNum, checkInDate, checkOutDate, adultPerRoom,
				childrenPerRoom);
	}

	@Then("Customer book a hotel by payment with filling {string}, {string}, {string}")
	public void customer_book_a_hotel_by_payment_with_filling(String FName, String LName, String BillAddr, io.cucumber.datatable.DataTable dataTable) {
		bookAHotel = new BookAHotel();
		bookAHotel.payment(FName, LName, BillAddr);
		List<Map<String, String>> mp = dataTable.asMaps();
		type(bookAHotel.getCreditNum(), mp.get(3).get("CreditCardNo"));
		type(bookAHotel.getCreditType(), mp.get(3).get("CreditCardType"));
		type(bookAHotel.getExpiryMonth(), mp.get(3).get("Month"));
		type(bookAHotel.getExpiryYear(), mp.get(3).get("Year"));
		type(bookAHotel.getCvvNum(), mp.get(3).get("CVV"));
		btnClick(bookAHotel.getBookNow());
		implicitWait();
		WebElement element = driver.findElement(By.id("order_no"));
		String id = element.getAttribute("value");
		System.out.println("Order id is" +id);
		
	}

	
}