package com.kodilla.good.patterns.food2Door;

public class Application {
    public static void main(String[] args) {
        Request request = new RequestRetiever().retrieve();
        Request request2 = new RequestRetiever().retrieve2();
        Request request3 = new RequestRetiever().retrieve3();
        Request request4 = new RequestRetiever().retrieve4();
        Request request5 = new RequestRetiever().retrieve5();

        ShopProccesor shopProccesor = new ShopProccesor(new LittleShopService(), new DeliveryStandardProcess());
        shopProccesor.process(request);
        shopProccesor.process(request2);
        shopProccesor.process(request3);
        shopProccesor.process(request4);
        shopProccesor.process(request5);
    }
}
