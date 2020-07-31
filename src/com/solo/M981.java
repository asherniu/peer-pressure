package com.solo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class M981 {
    // This one is faster than my String -> list of ts+value map, and search with binary search
    // Also uses less memories.

    class TimeMap {
        Map<String, TreeMap<Integer, String>> M;

        public TimeMap() {
            M = new HashMap();
        }

        public void set(String key, String value, int timestamp) {
            if (!M.containsKey(key))
                M.put(key, new TreeMap());

            M.get(key).put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            if (!M.containsKey(key)) return "";

            TreeMap<Integer, String> tree = M.get(key);
            Integer t = tree.floorKey(timestamp);
            return t != null ? tree.get(t) : "";
        }
    }
}
