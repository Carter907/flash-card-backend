package org.carte.flashcardapp.model;

import jakarta.persistence.*;

import static java.lang.StringTemplate.STR;

@Entity
public class FlashCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String front;

    @Column(nullable = false, unique = true)
    private String back;

    @ManyToOne
    @JoinColumn(name = "deck_id", nullable = false)
    private Deck deck;

    public FlashCard() {

    }
    public FlashCard(Long id, String front, String back) {
        this.id = id;
        this.front = front;
        this.back = back;
    }
    public FlashCard(String front, String back) {
        this(0L, front, back);
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setFront(String front) {
        this.front = front;
    }
    public void setBack(String back) {
        this.back = back;
    }

    public long getId() {
        return this.id;
    }
    public String getFront() {
        return this.front;
    }
    public String getBack() {
        return this.back;
    }
    @Override
    public String toString() {
        return STR."""
                id: \{this.id},
                front: \{this.front},
                back: \{this.back}
                """;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FlashCard other) {
            if (this.id != other.id) {
                return false;
            }
            return true;
        }
        return false;
    }

}
