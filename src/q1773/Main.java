package q1773;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.countMatches(
                List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"), List.of("phone", "gold", "iphone")),
                "color", "silver"));
    }
}

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c = 0;
        int i = 0;
        if (ruleKey.equals("color")) {
            i = 1;
        }
        if (ruleKey.equals("name")) {
            i = 2;
        }
        for (List<String> item : items) {
            if (item.get(i).equals(ruleValue)) {
                c++;
            }
        }
        return c;
    }
//    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int c = 0;
//        for (int i = 0; i < items.size(); i++) {
//            switch (ruleKey) {
//                case "type":
//                    if (Objects.equals(items.get(i).get(0), ruleValue)) {
//                        c++;
//                    }
//                    break;
//                case "color":
//                    if (Objects.equals(items.get(i).get(1), ruleValue)) {
//                        c++;
//                    }
//                    break;
//                case "name":
//                    if (Objects.equals(items.get(i).get(2), ruleValue)) {
//                        c++;
//                    }
//                    break;
//            }
//        }
//        return c;
//    }
}