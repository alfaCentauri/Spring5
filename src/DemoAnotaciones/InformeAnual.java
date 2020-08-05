package DemoAnotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeAnual implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentación del informe anual.";
	}

}
