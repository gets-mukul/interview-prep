import entity.*;
import exceptions.CustomeException;
import service.deckService.GameService;
import service.deckService.GameServiceFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        System.out.println("Starting game");
        Main main = new Main();
        main.playGame(GameType.ABOUT_STAYS_GAME,2,2);
    }
    public void playGame(GameType gameType, Integer playerCount, Integer perPlayerCard){
        GameService deckService = GameServiceFactory.getDeckService(gameType);
        try {
            List<Card> cards = deckService.getCardsForGame();
            Deck deck  = new Deck(cards);
            List<Player> players = new ArrayList<Player>();
            for(int i=0; i<playerCount;i++){
                Player player = new Player();
                player.setId(i+1);
                players.add(player);
            }
            Game game = new Game();
            game.setPlayers(players);
            game.setDeck(deck);
            game.setName(gameType);
            game.setCardsPerPlayer(perPlayerCard);
            deckService.dealCard(game);
            List<Player> winners = deckService.findWinners(game);
            if(winners.size() ==0 || winners.size() >1){
                System.err.println("0 - Either no one won the game or there was a tie.");
            }
            else{
                System.out.println("Winner is Player-"+winners.get(0).getId());;
            }
        } catch (CustomeException e) {
            System.err.println(" Error in playing game= "+e.getMessage());
        }

    }
}
