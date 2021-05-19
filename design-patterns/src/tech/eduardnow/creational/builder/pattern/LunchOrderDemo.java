package tech.eduardnow.creational.builder.pattern;

import tech.eduardnow.creational.builder.pattern.LunchOrder.Builder;

public class LunchOrderDemo {

    public static void main(String[] args) {

        Builder lunchOrdenBuilder = new Builder();

        LunchOrder lunchOrder = lunchOrdenBuilder.bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mayo")
                .meat("Turkey")
                .build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

    }
}
