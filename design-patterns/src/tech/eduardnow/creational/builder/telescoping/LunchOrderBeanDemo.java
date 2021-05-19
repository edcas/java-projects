package tech.eduardnow.creational.builder.telescoping;

public class LunchOrderBeanDemo {

    public static void main(String[] args) {

        LunchOrdenBean lunchOrdenBean = new LunchOrdenBean("Wheat","Lettuce", "Mustard", "Ham" );

        System.out.println(lunchOrdenBean.getBread());
        System.out.println(lunchOrdenBean.getCondiments());
        System.out.println(lunchOrdenBean.getDressing());
        System.out.println(lunchOrdenBean.getMeat());

    }
}
