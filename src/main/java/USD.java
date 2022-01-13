public class USD extends Coin{
    final double value = 3.28;

    @Override
    public double getValue() {
        return value;
    }
    public double calculate(double input){
        getValue();
        return input*getValue();
    }
}
