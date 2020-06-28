package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {
    private PriceList priceList;
    private static double totalProfit;

    public IceCreamSalon(PriceList priceList) {
        totalProfit = 0;
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Flavor[] flavor) {
        totalProfit += priceList.getBallPrice(flavor);
        return new Cone(flavor);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        totalProfit += priceList.getMagnumPrice(magnumType);
        return new Magnum(magnumType);
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

}
