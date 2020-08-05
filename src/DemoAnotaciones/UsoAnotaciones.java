package DemoAnotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.*;

public class UsoAnotaciones {

	public static void main(String[] args) {
		System.out.println("Demostración del uso de anotaciones scope con métodos en Spring.");
		try {
			ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
			Empleados Pedro = contexto.getBean("comercialExperimentado", Empleados.class);
			Empleados Maria = contexto.getBean("comercialExperimentado", Empleados.class);
			System.out.println(Pedro.getInforme());
			System.out.println(Pedro.getTareas());
			System.out.println(Maria.getInforme());
			System.out.println(Maria.getTareas());
			if (Pedro == Maria) {
				System.out.println("Los objetos apuntan a la misma dirección de memoria.");
				System.out.println("Dirección de objeto #1: " + Pedro);
				System.out.println("Dirección de objeto #2: " + Maria);
			} else {
				System.out.println("Los objetos NO apuntan a la misma dirección de memoria.");
				System.out.println("Dirección de objeto #1: " + Pedro);
				System.out.println("Dirección de objeto #2: " + Maria);
			}
			contexto.close();
		}catch(BeansException ex){
			System.out.println("Error: Con la creación del bean.");
		}
	}

}
