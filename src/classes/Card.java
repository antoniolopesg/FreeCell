package classes;

public class Card {
    private String suit;
    private String value;
    private String imgPath;

    public Card(String suit, String value, String imgPath){
        this.setSuit(suit);
        this.setValue(value);
        this.setImgPath(imgPath);
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
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

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
