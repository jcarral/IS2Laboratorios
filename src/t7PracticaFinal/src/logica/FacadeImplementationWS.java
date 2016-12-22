package logica;

import java.util.Date;
import java.util.Vector;

import logica.ApplicationFacadeInterfaceWS;
import dataAccess.HibernateAccess;
import dominio.Booking;
import dominio.Offer;
import dominio.RuralHouse;

public class FacadeImplementationWS implements ApplicationFacadeInterfaceWS {
	private HibernateAccess dataAccess;

	public FacadeImplementationWS() {
		dataAccess = HibernateAccess.getInstance();

	}

	@Override
	public Offer createOffer(RuralHouse rh, Date diaInicial, Date diaFinal, float precio) throws Exception {

		System.out.println(diaInicial + ", " + diaFinal + ", " + precio);
		if (diaInicial.compareTo(diaFinal) >= 0)
			throw new Exception();
		if (!dataAccess.overlappingOffer(rh, diaInicial, diaFinal))
			return dataAccess.createOffer(rh, diaInicial, diaFinal, precio);
		return null;

	}

	@Override
	public Vector<RuralHouse> getAllRuralHouses() {
		return dataAccess.getAllRuralHouses();
	}

	@Override
	public Vector<Offer> getOffers(RuralHouse rh, Date diaInicial, Date diaFinal) {
		return dataAccess.getOffers(rh, diaInicial, diaFinal);
	}

	@Override
	public void initializeBD() {
		dataAccess.initializeBD();

	}

	@Override
	public Booking createBooking(Offer offer, String username, Integer telephone, String email) {
		return dataAccess.createBooking(offer, username, telephone, email);
	}

	public static void main(String[] args) {
		new FacadeImplementationWS().initializeBD();
	}
}
