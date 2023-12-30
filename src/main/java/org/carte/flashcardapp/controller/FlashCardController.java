package org.carte.flashcardapp.controller;

import org.carte.flashcardapp.model.FlashCard;
import org.carte.flashcardapp.service.FlashCardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/flash-cards")
public class FlashCardController {

    private FlashCardService service;

    public FlashCardController(FlashCardService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<FlashCard> getAllFlashCards() {
        return this.service.getAllFlashCards();
    }
}
