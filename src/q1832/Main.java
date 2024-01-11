package q1832;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}

class Solution {
    public boolean checkIfPangram(String sentence) {
        for (char i = 'a'; i < 'z' + 1; i++) {
            if (!sentence.contains(String.valueOf(i))) {
                return false;
            }
        }
        return true;
    }
}