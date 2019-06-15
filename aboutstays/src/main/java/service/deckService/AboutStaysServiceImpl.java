package service.deckService;

import entity.*;
import exceptions.CustomeException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AboutStaysServiceImpl implements GameService {

    public List<Card> getCardsForGame() throws CustomeException {
        String cardFilePath = "../aboutstays/src/main/java/database/cards.json";
        String cardJson = getcardsJsonFromPath(cardFilePath);
        JSONArray jsonObj = new JSONArray(cardJson);
        List<Card> cards = getCardsFromJson(jsonObj);
        return cards;
    }

    public void dealCard(Game game) throws CustomeException {
        if(game.getCardsPerPlayer()+game.getPlayers().size() > game.getDeck().getCards().size()){
            throw  new CustomeException("Not enough cards to play game",500);
        }
        Random r = new Random();
        List<Player> players = game.getPlayers();
        Deck deck = game.getDeck();
        List<Card> cards = deck.getCards();
        for(Player player : players){
            for(int i =0;i<game.getCardsPerPlayer();i++){
                int max = cards.size()-1;
                int min = 0;
                int cardIndex = r.nextInt((max - min) + 1)+min;
                Card card = cards.get(cardIndex);
                player.getHand().add(card);
                cards.remove(card);
            }
        }

        for(Player p: players){
            System.out.println("Player "+p.getId()+" has card "+p.getHand());
        }
    }

    public List<Player> findWinners(Game game) {
        List<Player> winners = new ArrayList<Player>();
        List<Player> players = game.getPlayers();
        Float maxScore= Float.MIN_VALUE;
        for(int i =0;i<players.size();i++){
            Player player = players.get(i);
            Float handValue = getValueForHand(player.getHand());
            if(handValue.floatValue()==maxScore.floatValue()){
                winners.add(player);
            }
            else if(handValue.floatValue()> maxScore.floatValue()){
                maxScore = handValue;
                winners = new ArrayList<Player>();
                winners.add(player);
            }
        }
        return winners;
    }

    public Float getValueForHand(List<Card> cards) {
        Float value = 0f;
        for(Card c: cards){
            value +=c.getValue();
        }
        return value;
    }


    private List<Card> getCardsFromJson(JSONArray jsonArray) {
        List<Card> cards = new ArrayList<Card>();
        for(int i=0;i< jsonArray.length();i++){
            JSONObject card = (JSONObject) jsonArray.get(i);
            String color = card.getString("color");
            String suite = card.getString("suite");
            String number = card.getString("number");
            Float value = card.getFloat("value");
            Card cardObject = new Card(color,suite,number,value);
            cards.add(cardObject);
        }
        return cards;
    }

    private String getcardsJsonFromPath(String cardFilePath) throws CustomeException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(cardFilePath);
            br = new BufferedReader(fr);

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                sb.append(line);
            }

        } catch (Exception e) {
        	e.printStackTrace();
            throw  new CustomeException(e.getMessage(),500);
        } finally {
            try {
                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();
            } catch (Exception ex) {
            	ex.printStackTrace();
                throw  new CustomeException(ex.getMessage(),500);
            }
        }
        return  sb.toString();
    }
}
