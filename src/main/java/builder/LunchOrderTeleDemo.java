package builder;

public class LunchOrderTeleDemo {
    public static void main(String[] args) {
        LunchOrderBeanTele lunchOrderBeanTele = new LunchOrderBeanTele("Wheat",
                "Lettuce", "Mustard", "Beef");

        System.out.println(lunchOrderBeanTele.getBread());
        System.out.println(lunchOrderBeanTele.getCondiments());
        System.out.println(lunchOrderBeanTele.getDressing());
        System.out.println(lunchOrderBeanTele.getMeat());
    }
}
