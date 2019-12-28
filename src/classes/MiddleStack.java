package classes;

import java.util.ArrayList;

public class MiddleStack {
    public ArrayList<Card> stack;

    public MiddleStack(){
        stack = new ArrayList<Card>();
    }

    public boolean canPush(Card selected){
        if(stack.size() == 0) return true;

        int selectedValue = Integer.parseInt(selected.getValue());
        int lastValue = Integer.parseInt(top().getValue());

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
            return stack.get(stack.size() - 1);
        } else {
            return null;
        }
    }
}
