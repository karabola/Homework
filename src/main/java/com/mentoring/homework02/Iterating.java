package com.mentoring.homework02;

import java.util.HashMap;
import java.util.Map;

public class Iterating {

    public void iterationKeyValue(HashMap<String, String> map) {
        for (Map.Entry<String, String> mapEntry : map.entrySet()) {
            String key = mapEntry.getKey();
            String value = mapEntry.getValue();

            System.out.println(key + ": " + value);
        }
    }
}
