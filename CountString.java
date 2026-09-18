//public class CountString {
//   public static void main() {
//        String str = "aabbbcd";
//        int count = 1;
//
//        StringBuilder set = new StringBuilder();
//        for(int i = 1; i <= str.length(); i++) {
//            if(i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
//                count++;
//            }
//            else {
//                set.append(str.charAt(i - 1)).append(count);
//                count = 1;
//            }
//        }
//       System.out.println(set.toString());
//    }
//}









public class CountString {         ///   Without Extra Space
    public static void main() {
        String str = "aabbbcd";
        int count = 1;

        for(int i = 1; i <= str.length(); i++) {
            if(i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }
            else {
                System.out.print(str.charAt(i - 1));
                System.out.print(count);
                count = 1;
            }
        }
    }
}