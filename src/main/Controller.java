package main;

import classes.Card;
import classes.MiddleStack;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
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
    public AnchorPane stackA;
    public AnchorPane stackB;
    public AnchorPane stackC;
    public AnchorPane stackD;
    public AnchorPane stackE;
    public AnchorPane stackF;
    public AnchorPane stackG;
    public AnchorPane stackH;

    public MiddleStack stack1;
    public MiddleStack stack2;
    public MiddleStack stack3;
    public MiddleStack stack4;
    public MiddleStack stack5;
    public MiddleStack stack6;
    public MiddleStack stack7;
    public MiddleStack stack8;

    public Card selectedCard;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectedCard = null;
        initializeMiddleStacks();
        fillStacks(Card.loadCards());
    }

    public void fillStacks(ArrayList<Card> deck){
        Random generator = new Random();

        while(deck.size() > 0){
            int nextIndex = generator.nextInt(deck.size());
            Card nextCard = deck.remove(nextIndex);

            switch (generator.nextInt(8)){
                case 0:
                    nextCard.setCurrentStack(1);
                    stack1.push(nextCard);
                    break;
                case 1:
                    nextCard.setCurrentStack(2);
                    stack2.push(nextCard);
                    break;
                case 2:
                    nextCard.setCurrentStack(3);
                    stack3.push(nextCard);
                    break;
                case 3:
                    nextCard.setCurrentStack(4);
                    stack4.push(nextCard);
                    break;
                case 4:
                    nextCard.setCurrentStack(5);
                    stack5.push(nextCard);
                    break;
                case 5:
                    nextCard.setCurrentStack(6);
                    stack6.push(nextCard);
                    break;
                case 6:
                    nextCard.setCurrentStack(7);
                    stack7.push(nextCard);
                    break;
                case 7:
                    nextCard.setCurrentStack(8);
                    stack8.push(nextCard);
                    break;
            }
        }
    }

    public void initializeMiddleStacks(){
        stack1 = new MiddleStack();
        stack2 = new MiddleStack();
        stack3 = new MiddleStack();
        stack4 = new MiddleStack();
        stack5 = new MiddleStack();
        stack6 = new MiddleStack();
        stack7 = new MiddleStack();
        stack8 = new MiddleStack();
    }
}
