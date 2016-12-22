package dataAccess;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.hibernate.classic.Session;

import dominio.Booking;
import dominio.Offer;
import dominio.RuralHouse;

public class HibernateAccess {

	private static HibernateAccess currentAccess;

	private HibernateAccess() {

	}

	public static HibernateAccess getInstance() {
		if (currentAccess == null) {
			currentAccess = new HibernateAccess();
		}
		return currentAccess;
	}

	public void initializeBD() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		RuralHouse rh1 = new RuralHouse(1, "Ezkioko etxea", "Ezkio");
		RuralHouse rh2 = new RuralHouse(2, "Etxetxikia", "Iru�a");
		RuralHouse rh3 = new RuralHouse(3, "Udaletxea", "Bilbo");
		RuralHouse rh4 = new RuralHouse(4, "Gaztetxea", "Renteria");
		session.save(rh1);
		session.save(rh2);
		session.save(rh3);
		session.save(rh4);

		session.getTransaction().commit();

	}

	public Offer createOffer(RuralHouse rh, Date diaInicial, Date diaFinal, float precio) {
		try {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List result = session.createQuery("from RuralHouse where housenumber='" + rh.getHouseNumber() + "'").list();
			RuralHouse currentRh = (RuralHouse) result.get(0);
			Offer of = currentRh.createOffer(diaInicial, diaFinal, precio);
			session.save(of);
			session.getTransaction().commit();
			return of;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Vector<RuralHouse> getAllRuralHouses() {
		try {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List result = session.createQuery("from RuralHouse").list();
			session.getTransaction().commit();
			return new Vector<RuralHouse>(result);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Vector<Offer> getOffers(RuralHouse rh, Date diaInicial, Date diaFinal) {
		try {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List result = session.createQuery("from Offer where ruralhouse='" + rh.getHouseNumber() + "' and firstDay='"
					+ dateFormat(diaInicial) + "' and lastDay='" + dateFormat(diaFinal) + "'" + " and booking=null").list();
			return new Vector<Offer>(result);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private String dateFormat(Date date) {
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int day = date.getDate();
		return year + "-" + month + "-" + day + " 00:00:00";
	}
	
	public Booking createBooking(Offer offer, String username, Integer telephone, String email) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List result = session.createQuery("from Offer where offerNumber='"+ offer.getOfferNumber()+ "'").list();
		Offer of = (Offer) result.get(0);
		if(of != null){
			of.createBooking(username, telephone, email);
			session.save(of.getBooking());
			session.save(of);
			session.getTransaction().commit();
			return of.getBooking();
		}
		return null;
	}
	
	
	public boolean overlappingOffer(RuralHouse rh, Date diaInicial, Date diaFinal) throws Exception {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List result = session.createQuery("from RuralHouse where housenumber='" + rh.getHouseNumber() + "'").list();
			RuralHouse currentRh = (RuralHouse) result.get(0);
			if (currentRh.overlapsWith(diaInicial, diaFinal) != null)
				throw new Exception();
			return false;

	}
	
}
