package main;

import classes.Card;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    /**
     * AnchorPane dos espaços de movimentação
     */
    public AnchorPane movementSpace1;
    public AnchorPane movementSpace2;
    public AnchorPane movementSpace3;
    public AnchorPane movementSpace4;

    /**
     * AnchorPane das pilhas definitivas
     */
    public AnchorPane definitiveStack1;
    public AnchorPane definitiveStack2;
    public AnchorPane definitiveStack3;
    public AnchorPane definitiveStack4;

    /**
     * AnchorPane das pilhas intermediárias
     */
    public AnchorPane stack1;
    public AnchorPane stack2;
    public AnchorPane stack3;
    public AnchorPane stack4;
    public AnchorPane stack5;
    public AnchorPane stack6;
    public AnchorPane stack7;
    public AnchorPane stack8;

    public ArrayList<Card> deck;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deck = Card.loadCards();
        shuffleCards();
    }

    public void shuffleCards(){
        Random generator = new Random();

        while(deck.size() > 0){
            AnchorPane next = null;

            int nextIndex = generator.nextInt(deck.size());
            Card nextCard = deck.remove(nextIndex);

            switch (generator.nextInt(8)){
                case 0:
                    next = stack1;
                    break;
                case 1:
                    next = stack2;
                    break;
                case 2:
                    next = stack3;
                    break;
                case 3:
                    next = stack4;
                    break;
                case 4:
                    next = stack5;
                    break;
                case 5:
                    next = stack6;
                    break;
                case 6:
                    next = stack7;
                    break;
                case 7:
                    next = stack8;
                    break;
            }

            next.getChildren().add(nextCard.getContainer());
        }
    }
}
