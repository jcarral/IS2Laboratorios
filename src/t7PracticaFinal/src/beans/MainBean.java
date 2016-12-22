package beans;

import logica.ApplicationFacadeInterfaceWS;
import logica.FacadeImplementationWS;

public class MainBean {
	private static ApplicationFacadeInterfaceWS facade;

	private MainBean() {
		try {
			facade = new FacadeImplementationWS();
			System.out.println("Instancia creada");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static ApplicationFacadeInterfaceWS getInstance() throws Exception {
		if (facade == null) {
			new MainBean();
		}
		return facade;
	}

}
