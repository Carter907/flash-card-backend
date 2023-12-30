package org.carte.flashcardapp.repository;


import org.carte.flashcardapp.model.FlashCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashCardRepository extends JpaRepository<FlashCard, Long> {

}
