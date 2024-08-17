package org.training.Java.easy;

import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()) {
            int count = map.getOrDefault(ch, 0);
            map.put(ch, count + 1);
        }
        for(char ch : ransomNote.toCharArray()) {
            Integer count = map.getOrDefault(ch, 0);
            if (count == 0) {
                return false;
            }
            map.put(ch, count - 1);
        }
        return true;
    }
}
