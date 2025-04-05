package Tapsiriq5;

import java.util.*;

//2.Hər sözün neçə dəfə təkrarlandığını göstərin
public class main2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H");
        HashMap<String,Integer>countMap = new HashMap<>();

        for (String word : list) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (String word : countMap.keySet()) {
            System.out.println(word + " sayi: " + countMap.get(word));
        }
    }
}
