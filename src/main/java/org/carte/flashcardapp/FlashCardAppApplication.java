package org.carte.flashcardapp;

import org.carte.flashcardapp.model.FlashCard;
import org.carte.flashcardapp.repository.FlashCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlashCardAppApplication {
    private FlashCardRepository repo;
    public FlashCardAppApplication(FlashCardRepository repo) {
        this.repo = repo;

    }

	public static void main(String[] args) {
		SpringApplication.run(FlashCardAppApplication.class, args);
	}

    @Bean
    public CommandLineRunner cli() {
        return (String... args) -> {


        };
    }
}
