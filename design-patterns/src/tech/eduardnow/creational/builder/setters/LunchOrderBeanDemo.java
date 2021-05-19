package tech.eduardnow.creational.builder.setters;

public class LunchOrderBeanDemo {

    public static void main(String[] args) {

        LunchOrdenBean lunchOrdenBean = new LunchOrdenBean();

        lunchOrdenBean.setBread("Wheat");
        lunchOrdenBean.setCondiments("Lettuce");
        lunchOrdenBean.setDressing("Mustard");
        lunchOrdenBean.setMeat("Ham");

        System.out.println(lunchOrdenBean.getBread());
        System.out.println(lunchOrdenBean.getCondiments());
        System.out.println(lunchOrdenBean.getDressing());
        System.out.println(lunchOrdenBean.getMeat());

    }
}
