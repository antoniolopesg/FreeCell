package classes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class Card {
    public static final int CLUBS = 1;
    public static final int DIAMONDS = -1;
    public static final int HEARTS = -2;
    public static final int SPADES = 2;

    private int suit;
    private String value;
    private String imgPath;
    private ImageView container;
    private int currentStack;

    public Card(int suit, String value){
        this.setSuit(suit);
        this.setValue(value);
        this.setImgPath(suit, value);
        this.setContainer();
        this.currentStack = 0;
    }

    public void setContainer() {
        this.container = new ImageView(new Image(this.imgPath));
    }

    public ImageView getContainer() {
        return container;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(int suit, String value) {
        String path = null;

        switch (suit){
            case CLUBS:
                path = "cards/clubs/" + this.getValue() + ".png";
                break;
            case DIAMONDS:
                path = "cards/diamonds/" + this.getValue() + ".png";
                break;
            case HEARTS:
                path = "cards/hearts/" + this.getValue() + ".png";
                break;
            default:
                path = "cards/spades/" + this.getValue() + ".png";
        }

        this.imgPath = path;
    }

    public int getCurrentStack() {
        return currentStack;
    }

    public void setCurrentStack(int currentStack) {
        this.currentStack = currentStack;
    }

    public static ArrayList <Card> loadSuit(int suit){
        ArrayList <Card> suitCards = new ArrayList <Card>();

        for(int i = 0; i < 13; i++){
            suitCards.add(new Card(suit, Integer.toString(i + 1)));
        }

        return suitCards;
    }

    public static ArrayList<Card> loadCards(){
        ArrayList<Card> deck = new ArrayList<>();

        deck.addAll(loadSuit(Card.CLUBS));
        deck.addAll(loadSuit(Card.DIAMONDS));
        deck.addAll(loadSuit(Card.HEARTS));
        deck.addAll(loadSuit(Card.SPADES));

        return deck;
    }

    public static boolean diffColors(int suit1, int suit2){
        return (suit1 > 0 && suit2 < 0) || (suit1 < 0 && suit2 > 0);
    }
}
