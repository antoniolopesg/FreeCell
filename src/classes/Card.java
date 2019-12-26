package classes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Card {
    public static final int CLUBS = 1;
    public static final int DIAMONDS = 2;
    public static final int HEARTS = 3;
    public static final int SPADES = 4;

    private int suit;
    private String value;
    private String imgPath;
    private ImageView container;

    public Card(int suit, String value){
        this.setSuit(suit);
        this.setValue(value);
        this.setImgPath(suit, value);
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
                path = "src/cards/clubs/" + this.getValue() + ".png";
                break;
            case DIAMONDS:
                path = "src/cards/diamonds/" + this.getValue() + ".png";
                break;
            case HEARTS:
                path = "src/cards/hearts/" + this.getValue() + ".png";
                break;
            default:
                path = "src/cards/spades/" + this.getValue() + ".png";
        }

        this.imgPath = path;
    }

    public static ArrayList <Card> loadSuit(int suit){
        ArrayList <Card> suitCards = new ArrayList <Card>();

        for(int i = 0; i < 13; i++){
            suitCards.add(new Card(suit, Integer.toString(i + 1)));
        }

        return suitCards;
    }
}
