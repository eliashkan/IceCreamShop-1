package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.MagnumType;

public class PriceList {
    private double ballPrice;
    private double rocketStandardPrice;
    private double magnumStandardPrice;

    public PriceList() {

    }

    public PriceList(double ballPrice, double rocketStandardPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketStandardPrice = rocketStandardPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketStandardPrice) {
        this.rocketStandardPrice = rocketStandardPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice(Flavor[] flavors) {
        double totalBallPrice = 0;
        for (Flavor flavor : flavors) {
            switch (flavor) {
                case STRAWBERRY:
                    totalBallPrice += ballPrice * 1.1;
                    break;
                case BANANA:
                    totalBallPrice += ballPrice * 1.2;
                    break;
                case CHOCOLATE:
                    totalBallPrice += ballPrice * 1.3;
                    break;
                case VANILLA:
                    totalBallPrice += ballPrice * 1.4;
                    break;
                case LEMON:
                    totalBallPrice += ballPrice * 1.5;
                    break;
                case STRACIATELLA:
                    totalBallPrice += ballPrice * 1.6;
                    break;
                case MOKKA:
                    totalBallPrice += ballPrice * 1.7;
                    break;
                case PISTACHE:
                    totalBallPrice += ballPrice * 1.8;
                    break;
                default: return totalBallPrice += ballPrice;
            }
        }
        return totalBallPrice;
    }

    public double getRocketPrice() {
        return rocketStandardPrice;
    }

    public double getMagnumPrice(MagnumType magnumType) {
        switch (magnumType) {
            case MILKCHOCOLATE:
                return magnumStandardPrice * 1.1;
            case WHITECHOCOLATE:
                return magnumStandardPrice * 1.2;
            case BLACKCHOCOLATE:
                return magnumStandardPrice * 1.3;
            case ALPINENUTS:
                return magnumStandardPrice * 1.4;
            case ROMATICSTRAWBERRIES:
                return magnumStandardPrice * 1.5;
            default: return magnumStandardPrice;
        }
    }
}
