package logica;

import java.util.Date;
import java.util.Vector;

import dominio.Booking;
import dominio.Offer;
import dominio.RuralHouse;


public interface ApplicationFacadeInterfaceWS {

	void initializeBD();

	Vector<Offer> getOffers(RuralHouse rh, Date diaInicial, Date diaFinal);

	Vector<RuralHouse> getAllRuralHouses();

	Offer createOffer(RuralHouse rh, Date diaInicial, Date diaFinal, float precio) throws Exception;
	
	Booking createBooking(Offer offer, String username, Integer telephone, String email);

}
