package shekhar.refactor.before;

import java.util.HashMap;
import java.util.Map;

public class ExtractMethod {

    /**
     * Refactor this method
     */
    public static void singleMethod() {
        Map map = new HashMap<String, Integer>();
        map.put("A","B");
        System.out.println(map.get("A"));

        int a = 6, b = 10;
        int sum = a+b;
        System.out.println(sum);

    }

    public static void main(String[] args) { singleMethod(); }

}
