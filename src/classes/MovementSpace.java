package classes;

public class MovementSpace {
    private Card reserve;
    private int nSpace;

    public MovementSpace(){
        this.setReserve(null);
    }

    public Card getReserve() {
        return reserve;
    }

    public void setReserve(Card reserve) {
        this.reserve = reserve;
    }

    public int getnSpace() {
        return nSpace;
    }

    public void setnSpace(int nSpace) {
        this.nSpace = nSpace;
    }
}
