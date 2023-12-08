package q2942;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        final String[] words = new String[]{"abc", "bcd", "aaaa", "cbc"};
        final List<Integer> in = sn.findWordsContaining(words, 'b');
        System.out.println(in);
    }
}

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        final List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            final String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == x) {
                    indices.add(i);
                    break;
                }
            }
        }
        return indices;
    }

//    public List<Integer> findWordsContaining(String[] words, char x) {
//        final List<Integer> indices = new ArrayList<>();
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].indexOf(x) != -1) {
//                indices.add(i);
//            }
//        }
//        return indices;
//    }

//    public List<Integer> findWordsContaining(String[] words, char x) {
//        final List<Integer> indices = new ArrayList<>();
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].contains(String.valueOf(x))) {
//                indices.add(i);
//            }
//        }
//        return indices;
//    }
}
