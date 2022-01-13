public class ILS extends Coin {
final double value= 0.28;

    @Override
    public double getValue() {
        return value;

    }
    public double calculate(double input){
        getValue();
        return input*getValue();
    }
}
