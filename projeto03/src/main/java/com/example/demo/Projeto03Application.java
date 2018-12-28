package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Projeto03Application {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(Projeto03Application.class, args);
		 
//		 Controlador controlador = (Controlador) context.getBean("controlador"); 
//		 controlador.hello();
		 
//		 VehicleComponent controlador = (VehicleComponent) context.getBean("vehicleComponent"); 
//		 controlador.service();
		 
	}

}

