package org.carte.flashcardapp.service;

import org.carte.flashcardapp.model.FlashCard;
import org.carte.flashcardapp.repository.FlashCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlashCardService {

    private FlashCardRepository repo;

    public FlashCardService(FlashCardRepository repo) {
        this.repo = repo;
    }


    public List<FlashCard> getAllFlashCards() {

        return this.repo.findAll();
    }
}

