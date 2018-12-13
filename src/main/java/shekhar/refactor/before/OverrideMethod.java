// TODO - The object of the class "OverrideMethod" is printing it's variables, can we override a method to do this better?

package shekhar.refactor.before;

public class OverrideMethod {

    public double price;
    public int subId;
    public String name;

    public OverrideMethod(double _price, int _subId, String _name) {
        this.price = _price;
        this.subId = _subId;
        this.name = _name;
    }
}


class UseAboveClass {
    public void useTheClass() {
        double price = 10.0;
        int subId = 10;
        String name = "TDD";
        OverrideMethod overrideMethod = new OverrideMethod(price, subId, name);

        System.out.println("Price [" + overrideMethod.price
                + "]\t subId [" + overrideMethod.subId
                + "]\t Name [" + overrideMethod.name + "]"
        );
    }
}
