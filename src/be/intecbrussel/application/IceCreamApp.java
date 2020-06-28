package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(3.95, 4.95, 5.95);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);

        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
        Cone cone = iceCreamSalon.orderCone(new Flavor[] {Flavor.BANANA});
        Magnum magnum = iceCreamSalon.orderMagnum(MagnumType.BLACKCHOCOLATE);

        Eatable[] eatables = {iceRocket, cone, magnum};

        for (Eatable eatable: eatables) {
            eatable.eat();
        }

        System.out.println("Total profit: " + iceCreamSalon.getProfit());
    }
}
