package entity;

import java.util.List;

public class Game {
    private GameType name;
    private Integer cardsPerPlayer;
    private List<Player> players;
    private Deck deck;

    public GameType getName() {
        return name;
    }

    public void setName(GameType name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Integer getCardsPerPlayer() {
        return cardsPerPlayer;
    }

    public void setCardsPerPlayer(Integer cardsPerPlayer) {
        this.cardsPerPlayer = cardsPerPlayer;
    }
}
