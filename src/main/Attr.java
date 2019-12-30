package main;

import classes.Card;
import classes.MiddleStack;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public abstract class Attr implements Initializable {
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

    /**
     * Estrutura de dados
     * das pilhas intermediárias
     */
    public MiddleStack stack1;
    public MiddleStack stack2;
    public MiddleStack stack3;
    public MiddleStack stack4;
    public MiddleStack stack5;
    public MiddleStack stack6;
    public MiddleStack stack7;
    public MiddleStack stack8;

    public Card selectedCard;
}
