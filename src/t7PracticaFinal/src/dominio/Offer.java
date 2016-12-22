package dominio;

import java.util.Date;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Offer {
	

	private int offerNumber;
	private Date firstDay;
	private Date lastDay;
	private float price;
	private RuralHouse ruralHouse;
	private Booking booking;
	
	public Offer(){}

	public Offer(int offerNumber, Date firstDay, Date lastDay, float price, RuralHouse ruralHouse) {
		super();
		this.offerNumber = offerNumber;
		this.firstDay = firstDay;
		this.lastDay = lastDay;
		this.price = price;
		this.ruralHouse = ruralHouse;
		this.booking = null;
	}

	public int getOfferNumber() {
		return offerNumber;
	}

	public void setOfferNumber(int offerNumber) {
		this.offerNumber = offerNumber;
	}

	public Date getFirstDay() {
		return firstDay;
	}

	public void setFirstDay(Date firstDay) {
		this.firstDay = firstDay;
	}

	public Date getLastDay() {
		return lastDay;
	}

	public void setLastDay(Date lastDay) {
		this.lastDay = lastDay;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public RuralHouse getRuralHouse() {
		return ruralHouse;
	}

	public void setRuralHouse(RuralHouse ruralHouse) {
		this.ruralHouse = ruralHouse;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	public Booking createBooking(String username, Integer telephone, String email){
		Date currentDate = new Date(System.currentTimeMillis());
		this.booking = new Booking();
		this.booking.setBookingDate(currentDate);
		this.booking.setUsername(username);
		this.booking.setTelephone(telephone.toString());
		this.booking.setEmail(email);
		return this.booking;
	}
	
}
