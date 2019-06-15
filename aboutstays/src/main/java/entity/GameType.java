package entity;

public enum GameType {
    UNO(1), ABOUT_STAYS_GAME(2), POKER(3), RUMMY(4), TEEN_PATTI(5);
    private Integer gameTypeValue;
    GameType(int value){
        this.gameTypeValue = value;
    }
}
