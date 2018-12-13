package shekhar.refactor.after;

import java.util.HashMap;
import java.util.Map;

public class ExtractMethod {

    public static void singleMethod() {
        readMap();
        doSum();
    }

    private static void doSum() {
        int a = 6, b = 10;
        int sum = a+b;
        System.out.println(sum);
    }

    private static void readMap() {
        Map map = new HashMap<String, Integer>();
        map.put("A","B");
        System.out.println(map.get("A"));
    }


    public static void main(String[] args) { singleMethod(); }

}
