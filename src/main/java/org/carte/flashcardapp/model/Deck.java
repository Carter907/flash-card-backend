package org.carte.flashcardapp.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    @OneToMany(mappedBy = "deck")
    private Set<FlashCard> flashCardList;



    public Deck(Long id) {

    }
    public Deck() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
