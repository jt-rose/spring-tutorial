package com.example.tutorial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(JobApplicationRepository repo) {
		return (args -> {
			insertJobApplications(repo);
			System.out.println(repo.findAll());
		});
	}

	private void insertJobApplications(JobApplicationRepository repo) {
		repo.save(new JobApplication("Acme Co", "Dynamite Tester", new Date(), "WWW", true, "good luck!"));
		repo.save(new JobApplication("Gotham industries", "Batarang Builder", new Date(), "WWW", true, "good luck!"));
		repo.save(new JobApplication("Lexcorp", "Kryptonite Refinement Specialist", new Date(), "WWW", true, "good luck!"));
		repo.save(new JobApplication("Daily Bugle", "Photographer of Neighborhood Menaces", new Date(), "WWW", true, "good luck!"));
	}
}
