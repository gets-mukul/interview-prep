package entity;

import entity.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private Integer id ;
    private List<Card> hand = new ArrayList<Card>();

    public Player() {

    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
