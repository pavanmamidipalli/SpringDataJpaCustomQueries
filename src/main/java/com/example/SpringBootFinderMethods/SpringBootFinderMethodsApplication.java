package com.example.SpringBootFinderMethods;

import com.example.SpringBootFinderMethods.Service.IVaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootFinderMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringBootFinderMethodsApplication.class, args);
		IVaccineService service = context.getBean(IVaccineService.class);
//		service.searchVaccineDetails().forEach(i-> System.out.println(i));
//		service.searchAllByVaccineName("sputnik").forEach(i-> System.out.println(i));
//		List<String> list = new ArrayList<>();
//		list.add("sputnik");
//		list.add("covid");
//		list.add("covaxin");
//		list.add("fizer");
////		service.searchByVaccineNameIn(list).forEach(i-> System.out.println(i));
//		service.searchByNamesBetween(100,5000).forEach(i-> System.out.println(i));
//		System.out.println(service.updatedTableDetails(2500,"sputnik"));
//		System.out.println(service.deleteByPricings(100,2500));
//		System.out.println(service.saveallDetails("sputnik","Russia",4500));
		System.out.println(service.getTimeDetails());
	}

}
