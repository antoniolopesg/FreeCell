package classes;

public class DefinitiveStack extends MiddleStack {
    private int suit;

    public int getSuit() {
        return suit;
    }

    public boolean canPush(Card selected){
        if(selected.getSuit() != this.getSuit() || isFull()) return false;

        if(this.top() != null){
            int selectedValue = Integer.parseInt(selected.getValue());
            int lastValue = Integer.parseInt(top().getValue());

            return lastValue + 1 == selectedValue;
        }

        return true;
    }

    public boolean isFull(){
        return this.stack.size() >= 13;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }
}
