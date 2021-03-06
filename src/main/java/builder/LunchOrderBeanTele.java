package builder;

public class LunchOrderBeanTele {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBeanTele(String bread, String condiments) {
        this.bread = bread;
        this.condiments = condiments;
    }

    public LunchOrderBeanTele(String bread, String condiments, String dressing) {
        this.bread = bread;
        this.condiments = condiments;
        this.dressing = dressing;
    }

    public LunchOrderBeanTele(String bread, String condiments, String dressing, String meat) {
        this.bread = bread;
        this.condiments = condiments;
        this.dressing = dressing;
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }


    public String getCondiments() {
        return condiments;
    }


    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

}
