package org.carte.flashcardapp.repository;

import org.carte.flashcardapp.model.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckRepository extends JpaRepository<Deck, Long> {
}
