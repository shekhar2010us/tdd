package shekhar.refactor.after;

public class OverrideMethod {
    public double price;
    public int subId;
    public String name;

    public OverrideMethod(double _price, int _subId, String _name) {
        this.price = _price;
        this.subId = _subId;
        this.name = _name;
    }
    @Override
    public String toString() {
        return "Price [" + this.price
                + "]\t subId [" + this.subId
                + "]\t Name [" + this.name + "]";
    }
}


class UseAboveClass {

    public void useTheClass() {
        double price = 10.0;
        int subId = 10;
        String name = "TDD";
        OverrideMethod overrideMethod = new OverrideMethod(price, subId, name);

        System.out.println(overrideMethod.toString());
    }
}
