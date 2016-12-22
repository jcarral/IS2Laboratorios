package dominio;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class RuralHouse {

	
	private int houseNumber;
	private String description;
	private String city;
	public Set<Offer> offers;

	public RuralHouse(){}
	
	public RuralHouse(int houseNumber, String description, String city){
		this.houseNumber = houseNumber;
		this.description = description;
		this.city = city;
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Set<Offer> getOffers() {
		return offers;
	}
	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}
	
	public Offer createOffer(Date firstDay, Date lastDay, float price)  {
        Offer off=new Offer();
        off.setFirstDay(firstDay);
        off.setLastDay(lastDay);
        off.setPrice(price);
        off.setRuralHouse(this);
        offers.add(off);
        return off;
	}
	
public Offer overlapsWith( Date firstDay,  Date lastDay) {
		
		Iterator<Offer> e=offers.iterator();
		Offer offer=null;
		while (e.hasNext()){
			offer=e.next();
			if ( (offer.getFirstDay().compareTo(lastDay)<0) && (offer.getLastDay().compareTo(firstDay)>0))
				return offer;
		}
		return null;
		
	}
	
public String toString() {
	return this.houseNumber + ": " + this.city;
}
	
}
