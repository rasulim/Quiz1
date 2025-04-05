package Tapsiriq5;
//1.En cox tekrarlanan elementi tap
import java.util.HashMap;

public class main1 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "apple"};
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String fruit : fruits) {
            if (countMap.containsKey(fruit)) {
                countMap.put(fruit, countMap.get(fruit) + 1);
            } else {
                countMap.put(fruit, 1);
            }
        }
        int maxCount = -1;
        String maxFruit = null;
        for (String fruit : countMap.keySet()) {
            if (countMap.get(fruit) > maxCount) {
                maxCount = countMap.get(fruit);
                maxFruit = fruit;
            }
        }
        System.out.println("Ən çox təkrarlanan: " +maxFruit+ " (" +maxCount  + " dəfə)");
    }
}