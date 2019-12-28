package main;

import classes.Card;
import classes.MiddleStack;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

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
            AnchorPane next = null;

            int nextIndex = generator.nextInt(deck.size());
            Card nextCard = deck.remove(nextIndex);

            switch (generator.nextInt(8)){
                case 0:
                    next = stackA;
                    nextCard.setCurrentStack(1);
                    stack1.push(nextCard);
                    break;
                case 1:
                    next = stackB;
                    nextCard.setCurrentStack(2);
                    stack2.push(nextCard);
                    break;
                case 2:
                    next = stackC;
                    nextCard.setCurrentStack(3);
                    stack3.push(nextCard);
                    break;
                case 3:
                    next = stackD;
                    nextCard.setCurrentStack(4);
                    stack4.push(nextCard);
                    break;
                case 4:
                    next = stackE;
                    nextCard.setCurrentStack(5);
                    stack5.push(nextCard);
                    break;
                case 5:
                    next = stackF;
                    nextCard.setCurrentStack(6);
                    stack6.push(nextCard);
                    break;
                case 6:
                    next = stackG;
                    nextCard.setCurrentStack(7);
                    stack7.push(nextCard);
                    break;
                case 7:
                    next = stackH;
                    nextCard.setCurrentStack(8);
                    stack8.push(nextCard);
                    break;
            }

            ObservableList<Node> childrens = next.getChildren();
            ImageView cont = nextCard.getContainer();

            stylizeCard(cont);

            if(childrens.size() > 0) {
                int size = childrens.size();
                cont.setLayoutY(childrens.get(size - 1).getLayoutY() + 17);
            }
            childrens.add(cont);
        }

        setEvents();
    }

    public void stylizeCard(ImageView container){
        container.setCursor(Cursor.CLOSED_HAND);
        container.setOpacity(0.95);

        DropShadow shadow = new DropShadow();
        shadow.setRadius(3.0);
        shadow.setOffsetX(1.0);
        shadow.setOffsetY(1.0);
        shadow.setColor(Color.color(0, 0, 0, 0.8));
        container.setEffect(shadow);
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

    public void setEvents(){
        for (int i = 1; i <= 8; i++){
            MiddleStack stack = IntMiddleStack(i);
            stack.top().getContainer().setOnMouseClicked(mouseEvent -> {
                this.selectedCard = stack.top();
            });
        }
    }

    public MiddleStack IntMiddleStack(int stackInt){
        MiddleStack stack = null;
        switch (stackInt){
            case 1:
                stack = stack1;
                break;
            case 2:
                stack = stack2;
                break;
            case 3:
                stack = stack3;
                break;
            case 4:
                stack = stack4;
                break;
            case 5:
                stack = stack5;
                break;
            case 6:
                stack = stack6;
                break;
            case 7:
                stack = stack7;
                break;
            case 8:
                stack = stack8;
                break;
        }

        return stack;
    }
}
