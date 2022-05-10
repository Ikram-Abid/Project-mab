package com.exemple.Dz.univbechar.mad;

import com.exemple.Dz.univbechar.mad.Entity.User;
import com.exemple.Dz.univbechar.mad.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner initDataBaseH2(UserRepository userRepository){
		return args-> {
			userRepository.save(new User(Integer.parseInt("1"),"Samia","samiaAb@gmail.com"));
			userRepository.save(new User(Integer.parseInt("2"),"Lamia","LamiaAb@gmail.com"));
			userRepository.save(new User(Integer.parseInt("3"),"Asia","AsiaAb@gmail.com"));
		};
	}
}
