package q1108;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.defangIPaddr("1.1.1.1"));
    }
}

class Solution {
//    public String defangIPaddr(String address) {
//        final StringBuilder u = new StringBuilder();
//        for (int i = 0; i < address.length(); i++) {
//            if (address.charAt(i) == '.') {
//                u.append('[').append(address.charAt(i)).append(']');
//            } else {
//                u.append(address.charAt(i));
//            }
//        }
//        return u.toString();
//    }

    public String defangIPaddr(String address) {
        final StringBuilder u = new StringBuilder();
        for (final char e : address.toCharArray()) {
            if (e == '.') {
                u.append('[').append(e).append(']');
            } else {
                u.append(e);
            }
        }
        return u.toString();
    }
//    public String defangIPaddr(String address) {
//        final char[] c = address.toCharArray();
//        final StringBuilder u = new StringBuilder();
//        for (final char e : c) {
//            if (e == '.') {
//                u.append("[.]");
//            } else {
//                u.append(e);
//            }
//        }
//        return u.toString();
//    }
//    public String defangIPaddr(String address) {
//        return address.replaceAll("\\.", "[.]");
//    }
}
