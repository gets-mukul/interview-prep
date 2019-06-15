package service.deckService;

import entity.GameType;

public class GameServiceFactory {

    public static GameService getDeckService(GameType gameType){
        if(gameType == GameType.ABOUT_STAYS_GAME){
            return  new AboutStaysServiceImpl();
        }
        else if (gameType == GameType.UNO){
            return  new UnoServiceImpl();
        }
        return null;
    }
}