package shekhar.refactor.after;

import java.util.HashMap;
import java.util.Map;

public class Comments {

    /**
     * This method will calculate the sum if two input integers
     * @param a is an integer
     * @param b is an integer
     * @return the sum = (a+b)
     */
    public int method1(int a, int b) {
        return (a+b);
    }

    /**
     * Returns a hashmap with just one key, that being passed as the parameter
     * @param key is a String
     * @param value is a String
     * @return the map with Map<key,value>; key and value are passed as parameters
     */
    public Map method2(String key, String value) {
        Map map = new HashMap<String, Integer>();
        map.put(key, value);
        return map;
    }

    /**
     * This is a deprecated method, returns true or false depending on the sum of the passed parameters
     * @param a
     * @param b
     * @return true if the sum is less than 10, or false if otherwise
     */
    @Deprecated
    public boolean method3(int a, int b) {
        if (method1(a,b) < 10)
            return true;
        return false;
    }

}
