package beans;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import logica.ApplicationFacadeInterfaceWS;
import dominio.Offer;
import dominio.RuralHouse;

public class QueryBean {
	
    private Set<RuralHouse> ruralHouses;
    private List<Offer> ofertas;  
    private Integer noches=0;
    private int offerNumber;
    private RuralHouse ruralHouse;
	private Date firstDay; 
    private Date lastDay;
    
    private ApplicationFacadeInterfaceWS facade;
	public QueryBean() throws Exception{
		facade = MainBean.getInstance();
    	ruralHouses = new HashSet<RuralHouse>(facade.getAllRuralHouses());
    	System.out.println("tam: " + ruralHouses.size());

	}
	
	public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }
	

	public Set<RuralHouse> getRuralHouses() {
		return ruralHouses;
	}

	public void setRuralHouses(Set<RuralHouse> ruralHouses) {
		this.ruralHouses = ruralHouses;
	}

	public Integer getNoches() {
		return noches;
	}

	public void setNoches(Integer noches) {
		this.noches = noches;
	}

	public int getOfferNumber() {
		return offerNumber;
	}

	public void setOfferNumber(int offerNumber) {
		this.offerNumber = offerNumber;
	}

	public RuralHouse getRuralHouse() {
		return ruralHouse;
	}

	public void setRuralHouse(RuralHouse ruralHouse) {
		this.ruralHouse = ruralHouse;
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




	public void setOfertas(List<Offer> ofertas) {
		this.ofertas = ofertas;
	}

	
	public List<Offer> getOfertas() throws Exception{
		
		return this.ofertas;
	}
	
	public String actualizarOfertas(){
		if(firstDay!=null){
			lastDay = sumarDiasFecha(this.firstDay, this.noches);
			System.out.println("Actualizando ofertas..." + ruralHouse);
			this.ofertas = facade.getOffers(ruralHouse, firstDay, lastDay);
			System.out.println(ruralHouse.getCity());
			System.out.println(this.ofertas.size());
		}
		return "query";
	}
	 public Date sumarDiasFecha(Date fecha, int dias){
         Calendar calendar = Calendar.getInstance();
         calendar.setTime(fecha); 
         calendar.add(Calendar.DAY_OF_YEAR, dias);  
         return calendar.getTime(); 
    }
}
