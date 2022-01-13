public class CoinFactory {

    public static Coin getCoinInstances(Coins coin){
        switch (coin){
            case ILS:
                return new ILS();

            case USD:
                return new USD();

            case EUR:
                return new EUR();
        }
        return null;
    }
}
