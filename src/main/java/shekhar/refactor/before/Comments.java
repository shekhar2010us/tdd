// TODO - Add proper comments to methods

package shekhar.refactor.before;

import java.util.HashMap;
import java.util.Map;

public class Comments {

    public int method1(int a, int b) {
        return (a+b);
    }

    public Map method2(String key, String value) {
        Map map = new HashMap<String, Integer>();
        map.put(key, value);
        return map;
    }

    public boolean method3(int a, int b) {
        if (method1(a,b) < 10)
            return true;
        return false;
    }

}
