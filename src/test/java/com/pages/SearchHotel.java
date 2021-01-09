package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotel extends LibGlobal {
	
	public SearchHotel() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(id= "location")
	WebElement city;
	
	@FindBy(id= "hotels")
	WebElement hotelName;
	
	@FindBy(id= "room_type")
	WebElement roomType;
	
	@FindBy(id="room_nos")
	WebElement noOfRooms;
	
	@FindBy(id="datepick_in")
	WebElement checkIn;
	
	@FindBy(id="datepick_out")
	WebElement checkOut;
	
	@FindBy(id="adult_room")
	WebElement adultPerRoom;
	
	@FindBy(id="child_room")
	WebElement childPerRoom;
	
	@FindBy(id= "Submit")
	WebElement btnSearch;

	@FindBy(id= "radiobutton_0")
	WebElement clickHotel;
	
	@FindBy(id= "continue")
	WebElement clickCont;
	
	public WebElement getCity() {
		return city;
	}

	public WebElement getHotelName() {
		return hotelName;
	}
	
	public WebElement getRoomType() {
		return roomType;
	}

	
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	public WebElement getClickHotel() {
		return clickHotel;
	}
	
	public WebElement getClickCont() {
		return clickCont;
	}
	
public void hotelSelection(String locName, String hotName, String roomType, String roomNum,
		String checkInDate, String checkOutDate, String adultPerRoom, String childrenPerRoom) {
	
	selectByValue(getCity(), locName);
	selectByValue(getHotelName(), hotName);
	selectByValue(getRoomType(), roomType);
	selectByValue(getNoOfRooms(), roomNum);
	type(getCheckIn(), checkInDate);
	type(getCheckOut(), checkOutDate);
	selectByValue(getAdultPerRoom(), adultPerRoom);
	selectByValue(getChildPerRoom(), childrenPerRoom);
	btnClick(getBtnSearch());
	btnClick(getClickHotel());
	btnClick(getClickCont());

}	
	
}
