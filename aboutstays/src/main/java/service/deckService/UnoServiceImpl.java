package service.deckService;

import entity.Card;
import entity.Game;
import entity.GameType;
import entity.Player;
import exceptions.CustomeException;

import java.util.List;

public class UnoServiceImpl implements GameService {

    public List<Card> getCardsForGame(GameType gameType) {
        return null;
    }

    public List<Card> getCardsForGame() throws CustomeException {
        return null;
    }

    public void dealCard(Game game) throws CustomeException {

    }

    public List<Player> findWinners(Game game) {
        return null;
    }

    public Float getValueForHand(List<Card> cards) {
        return null;
    }
}
