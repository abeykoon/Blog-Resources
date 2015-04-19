package org.wso2.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Guest")
public class Guest {

	private String guestID;
	private String gender;
	private String tpNumber;
	private String roomNumber;
	
	public String getGuestID() {
		return guestID;
	}
	public void setGuestID(String guestID) {
		this.guestID = guestID;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTpNumber() {
		return tpNumber;
	}
	public void setTpNumber(String tpNumber) {
		this.tpNumber = tpNumber;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
}
