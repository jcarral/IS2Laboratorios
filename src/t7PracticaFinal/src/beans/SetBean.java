package beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import logica.ApplicationFacadeInterfaceWS;
import dominio.*;

public class SetBean {

	private Set<RuralHouse> ruralHouse;
	private Date firstDay;
	private Date lastDay;
	private float price;
	private RuralHouse house;    
	private Offer offer;
	
    private ApplicationFacadeInterfaceWS facade;
    
    public SetBean() throws Exception{
    	facade = MainBean.getInstance();
    	ruralHouse = new HashSet<RuralHouse>(facade.getAllRuralHouses());
    }
    
    public String createOffer() throws Exception{
    	if(house == null || firstDay == null || lastDay == null){
			return "Faltan datos";
		}
		FacesContext context = FacesContext.getCurrentInstance();
    	try{
    		facade.createOffer(house, firstDay, lastDay, price);
    		System.out.println("Oferta creada " + house);
    		context.addMessage(null, new FacesMessage("Oferta creada"));
    		return "Oferta creada";
    	}catch (Exception e){
    		context.addMessage(null, new FacesMessage("No se puede crear una oferta para esas fechas"));
    		e.printStackTrace();
    		return "Error al crear la oferta";
    	}
    }

	public Set<RuralHouse> getRuralHouse() {
		return ruralHouse;
	}

	public void setRuralHouse(Set<RuralHouse> ruralHouse) {
		this.ruralHouse = ruralHouse;
	}

	public Date getFirstDay() {
		return firstDay;
	}

	public void setFirstDay(Date firtDay) {
		this.firstDay = firtDay;
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

	public RuralHouse getHouse() {
		return house;
	}

	public void setHouse(RuralHouse house) {
		this.house = house;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}
    
}

