package dominio;

import java.util.Date;

public class Booking {
	
	private int bookingNumber;
	private Date bookingDate;
	
	//Datos del usuario que ha realizado la oferta
	private String username;
	private String telephone;
	private String email;
	
	public Booking(){}
	public Booking(int bookingNumber, Date bookingDate, String username, Integer telephone, String email) {
		super();
		this.bookingNumber = bookingNumber;
		this.bookingDate = bookingDate;

		this.username = username;
		this.telephone = telephone.toString();
		this.email = email;
	}
	
	public int getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(int bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone.toString();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

	
}
