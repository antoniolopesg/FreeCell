package main;

import classes.Card;
import classes.MiddleStack;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller extends Attr {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectedCard = null;
        initializeMiddleStacks();
        fillStacks(Card.loadCards());
        setEventClickAnchors();
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

            stackCard(childrens, cont);
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
        stack1.setnPilha(1);
        stack2 = new MiddleStack();
        stack2.setnPilha(2);
        stack3 = new MiddleStack();
        stack3.setnPilha(3);
        stack4 = new MiddleStack();
        stack4.setnPilha(4);
        stack5 = new MiddleStack();
        stack5.setnPilha(5);
        stack6 = new MiddleStack();
        stack6.setnPilha(6);
        stack7 = new MiddleStack();
        stack7.setnPilha(7);
        stack8 = new MiddleStack();
        stack8.setnPilha(8);
    }

    public void setEvents(){
        for (int i = 1; i <= 8; i++){
            MiddleStack stack = intMiddleStack(i);
            stack.top().getContainer().setOnMouseClicked(mouseEvent -> {
                this.selectedCard = stack.top();
            });
        }
    }

    public MiddleStack intMiddleStack(int stackInt){
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

    public AnchorPane intMiddleToAnchor(int stackInt){
        AnchorPane stack = null;
        switch (stackInt){
            case 1:
                stack = stackA;
                break;
            case 2:
                stack = stackB;
                break;
            case 3:
                stack = stackC;
                break;
            case 4:
                stack = stackD;
                break;
            case 5:
                stack = stackE;
                break;
            case 6:
                stack = stackF;
                break;
            case 7:
                stack = stackG;
                break;
            case 8:
                stack = stackH;
                break;
        }

        return stack;
    }

    public void setEventClickAnchors(){
        stackA.setOnMouseClicked(mouseEvent -> {
            clickedAnchorPane(mouseEvent, stackA);
        });

        stackB.setOnMouseClicked(mouseEvent -> {
            clickedAnchorPane(mouseEvent, stackB);
        });

        stackC.setOnMouseClicked(mouseEvent -> {
            clickedAnchorPane(mouseEvent, stackC);
        });

        stackD.setOnMouseClicked(mouseEvent -> {
            clickedAnchorPane(mouseEvent, stackD);
        });

        stackE.setOnMouseClicked(mouseEvent -> {
            clickedAnchorPane(mouseEvent, stackE);
        });

        stackF.setOnMouseClicked(mouseEvent -> {
            clickedAnchorPane(mouseEvent, stackF);
        });

        stackG.setOnMouseClicked(mouseEvent -> {
            clickedAnchorPane(mouseEvent, stackG);
        });

        stackH.setOnMouseClicked(mouseEvent -> {
            clickedAnchorPane(mouseEvent, stackH);
        });
    }

    public MiddleStack AnchorMiddleStack(AnchorPane stack){
        MiddleStack stackM = null;

        if(stack.equals(stackA)){
            stackM = stack1;
        } else if(stack.equals(stackB)){
            stackM = stack2;
        } else if(stack.equals(stackC)){
            stackM = stack3;
        } else if(stack.equals(stackD)){
            stackM = stack4;
        } else if(stack.equals(stackE)){
            stackM = stack5;
        } else if(stack.equals(stackF)){
            stackM = stack6;
        } else if(stack.equals(stackG)){
            stackM = stack7;
        } else {
            stackM = stack8;
        }

        return stackM;
    }

    public void clickedAnchorPane(MouseEvent mouseEvent, AnchorPane stack){
        if(this.selectedCard != null){
            MiddleStack clickedStack = AnchorMiddleStack(stack);
            AnchorPane clickedAnchor = intMiddleToAnchor(this.selectedCard.getCurrentStack());

            if(clickedStack.canPush(this.selectedCard)){
                MiddleStack lastStack = intMiddleStack(this.selectedCard.getCurrentStack());
                resetEvents();

                clickedStack.push(lastStack.unStack());
                this.selectedCard.setCurrentStack(clickedStack.getnPilha());

                clickedAnchor.getChildren().remove(this.selectedCard.getContainer());

                if(stack.getChildren().size() > 0){
                    int size = stack.getChildren().size();
                    selectedCard.getContainer().setLayoutY(stack.getChildren().get(size - 1).getLayoutY() + 17);
                }
                stack.getChildren().add(this.selectedCard.getContainer());

                this.selectedCard = null;
                setEvents();
            }
        }
    }

    public void stackCard(ObservableList<Node> childrens, ImageView cardContainer){
        if(childrens.size() > 0) {
            int size = childrens.size();
            cardContainer.setLayoutY(childrens.get(size - 1).getLayoutY() + 17);
        }
        childrens.add(cardContainer);
    }

    public void resetEvents(){
        for (int i = 1; i <= 8; i++){
            MiddleStack stack = intMiddleStack(i);
            stack.top().getContainer().setOnMouseClicked(null);
        }
    }
}
