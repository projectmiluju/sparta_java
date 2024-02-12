package practice;

import java.util.HashMap;

public class Hash {

    // key, value 값이 쌍을 이루는 자료구조
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "c");
        map.put("D", "d");

        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));
        System.out.println(map.get("d"));
    }
}
