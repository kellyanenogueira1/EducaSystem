package ifce.EducaSystem;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ifce.Educa.model.User;
import ifce.Educa.Repository.UserRepository;
import ifce.Educa.model.System;

@SpringBootApplication
public class EducaSystemApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(EducaSystemApplication.class, args);
	}
}
