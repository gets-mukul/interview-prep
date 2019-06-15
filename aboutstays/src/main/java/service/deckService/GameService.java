package service.deckService;

import entity.Card;
import entity.Game;
import entity.GameType;
import entity.Player;
import exceptions.CustomeException;

import java.util.List;

public interface GameService {

    List<Card> getCardsForGame() throws CustomeException;
    void dealCard(Game game) throws CustomeException;
    List<Player> findWinners(Game game);
    Float getValueForHand(List<Card> cards);
}
