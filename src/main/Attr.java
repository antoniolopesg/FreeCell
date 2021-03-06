package main;

import classes.Card;
import classes.DefinitiveStack;
import classes.MiddleStack;
import classes.MovementSpace;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public abstract class Attr implements Initializable {
    /**
     * AnchorPane dos espaços de movimentação
     */
    public AnchorPane movementSpaceA;
    public AnchorPane movementSpaceB;
    public AnchorPane movementSpaceC;
    public AnchorPane movementSpaceD;

    /**
     * Classes dos espaços de movimentação
     */

    public MovementSpace movementSpace1;
    public MovementSpace movementSpace2;
    public MovementSpace movementSpace3;
    public MovementSpace movementSpace4;

    /**
     * AnchorPane das pilhas definitivas
     */
    public AnchorPane definitiveStackA;
    public AnchorPane definitiveStackB;
    public AnchorPane definitiveStackC;
    public AnchorPane definitiveStackD;

    /**
     * Classes das pilhas definitivas
     */
    public DefinitiveStack definitiveStack1;
    public DefinitiveStack definitiveStack2;
    public DefinitiveStack definitiveStack3;
    public DefinitiveStack definitiveStack4;

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
