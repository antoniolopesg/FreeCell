package classes;

import java.util.ArrayList;

public class MiddleStack {
    protected ArrayList<Card> stack;
    protected int nPilha;

    public MiddleStack(){
        stack = new ArrayList<Card>();
    }

    public boolean canPush(Card selected){
        if(stack.size() == 0) return true;

        int selectedValue = Integer.parseInt(selected.getValue());
        int lastValue = Integer.parseInt(top().getValue());
        System.out.println(lastValue + " " + selectedValue);

        if(selectedValue + 1 == lastValue){
            return Card.diffColors(selected.getSuit(), top().getSuit());
        }

        return false;
    }

    public Card top(){
        if(stack.size() > 0){
            return stack.get(stack.size() - 1);
        } else {
            return null;
        }
    }

    public void push(Card card){
        stack.add(card);
    }

    public Card unStack(){
        if(stack.size() > 0){
            return stack.remove(stack.size() - 1);
        } else {
            return null;
        }
    }

    public int getnPilha() {
        return nPilha;
    }

    public void setnPilha(int nPilha) {
        this.nPilha = nPilha;
    }
}
