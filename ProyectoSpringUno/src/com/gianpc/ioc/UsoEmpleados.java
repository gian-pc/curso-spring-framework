package com.gianpc.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Crear un contexto(Cargar archivo XML)
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Pedir al Bean
		Empleados Gian = contexto.getBean("miEmpleado",Empleados.class);
		
		// 3. Utilizar al Bean
		System.out.println(Gian.getTareas());
		
		// Cerrar el XML
		contexto.close();
		
	}
}
