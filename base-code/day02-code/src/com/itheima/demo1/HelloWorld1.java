package com.itheima.demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HelloWorld1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("标枪选手", "马超");
        map.put("人物挂件", "明世隐");
        map.put("御龙骑士", "尹志平");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
        }
        map.forEach((key, value) -> System.out.println(key + value));
    }
}
