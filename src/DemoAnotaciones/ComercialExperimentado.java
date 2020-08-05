package DemoAnotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComercialExperimentado implements Empleados {
	private CreacionInformeFinanciero informeTrimestre1;
		
	/**
	 * Método sobreescrito que muestra las tareas.
	 * @return Regresa una cadena.
	 * */
	@Override
	public String getTareas() {
		return "Vender y convencer al cliente.";
	}

	/**
	 * Método sobreescrito que genera el informe financiero del primer trimestre.
	 * @return Regresa una cadena.
	 **/
	@Override
	public String getInforme() {
		return this.informeTrimestre1.getInformeFinanciero();
	}

	/**
	 * @param informeTrimestre1 the informeTrimestre1 to set
	 */
	@Autowired
	@Qualifier("informeAnual")
	public void setInformeTrimestre1(CreacionInformeFinanciero informeTrimestre1) {
		this.informeTrimestre1 = informeTrimestre1;
	}

	
}
