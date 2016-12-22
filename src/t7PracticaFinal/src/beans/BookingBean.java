package beans;

import java.util.HashSet;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import dominio.Booking;
import dominio.Offer;
import dominio.RuralHouse;
import logica.ApplicationFacadeInterfaceWS;

public class BookingBean {

	 private ApplicationFacadeInterfaceWS facade;
	 
	 private String username;
	 private Integer telephone;
	 private String email;
	 private Offer offer;
	 
	 public BookingBean() throws Exception{
			facade = MainBean.getInstance();
	}
	 
	 public String storeBooking(Offer of) throws Exception{
		 this.offer = of;
		return "ok";
	 }

	public ApplicationFacadeInterfaceWS getFacade() {
		return facade;
	}

	public void setFacade(ApplicationFacadeInterfaceWS facade) {
		this.facade = facade;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getTelephone() {
		return telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}
	
	
	public String createBooking(){
		FacesContext context = FacesContext.getCurrentInstance();
		if(username.length() == 0|| telephone.equals(null) || email.length() == 0){
			if(username.length() == 0) FacesContext.getCurrentInstance().addMessage("myform:username", new FacesMessage("El nombre de usuario no es válido"));
			if(telephone == null) FacesContext.getCurrentInstance().addMessage("myform:tfn", new FacesMessage("El telefono no es válido"));
			if(email.length() == 0) FacesContext.getCurrentInstance().addMessage("myform:email", new FacesMessage("El correo no es válido"));
			return "Error, no se ha podido guardar la reserva";
		}
		System.out.println("Reservando...");
		Booking b = facade.createBooking(offer, username, telephone, email);
		System.out.println("Resultado...");
		if(b == null){
    		context.addMessage(null, new FacesMessage("Error, no se ha podido realizar la reserva"));
			return "Error";
		}
		else{
    		context.addMessage(null, new FacesMessage("Reserva realizada"));
			return "Reserva realizada";
		}
	}
}
