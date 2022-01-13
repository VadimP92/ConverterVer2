public class EUR  extends  Coin{
    final double value = 4.23;


    @Override
    public double getValue() {
        return value;
    }
    public double calculate (double input){
        return input*getValue();
    }
}
