package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) throws NoMoreIceCreamException {
        PriceList priceList = new PriceList(3.95, 4.95, 5.95);
        Stock stock = new Stock(2, 5, 5, 6);
        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock);

        IceRocket iceRocket1 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket2 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket3 = iceCreamCar.orderIceRocket();
        Cone cone1 = iceCreamCar.orderCone(new Flavor[] {Flavor.BANANA});
        Cone cone2 = iceCreamCar.orderCone(new Flavor[] {Flavor.BANANA, Flavor.CHOCOLATE, Flavor.BANANA, Flavor.STRAWBERRY});
        Magnum magnum = iceCreamCar.orderMagnum(MagnumType.BLACKCHOCOLATE);

        Eatable[] eatables = {iceRocket1, iceRocket2, iceRocket3, cone1, cone2, magnum};

        for (Eatable eatable: eatables) {
            eatable.eat();
        }

        System.out.println("Total profit: " + iceCreamCar.getProfit());
    }
}
