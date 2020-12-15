package org.itstep.blackjack.ui;

import org.itstep.blackjack.Card;
import org.itstep.blackjack.Rank;
import org.itstep.blackjack.Suite;

import java.util.*;

public class Deck {
    private final List<Card> cards;
    private final List<Card> taken;
    public Deck(List<Card> taken) {
        this.taken = taken;
        this.cards = new ArrayList<>(52);
        for(Suite suite: Suite.values()) {
            for(Rank rank: Rank.values()) {
                this.cards.add(new Card(rank,suite));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }

    public Card getOne(){
        Card card = cards.remove(0);
        taken.add(card);
        return card;
    }

    public void reset(){
        cards.addAll(taken);
        taken.clear();
    }

}
}