import java.util.ArrayList;
import java.util.List;

public class Main_end {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(25);
        list1.add(56);
        list1.add(78);

        List<String> list2 = new ArrayList<>();
        list2.add("ataraxia");
        list2.add("gnomon");
        list2.add("bibliophile");
        list2.add("aver");
        list2.add("yakka");


        System.out.println(getSum(list1));
//        System.out.println(getSum(list2));
//        System.out.println(getLongestWord(list1));
        System.out.println(getLongestWord(list2));

    }

    public static int getSum(List<Integer> listOfNums) {
        int sum = 0;
        for (int num: listOfNums) {
            sum += num;
        }
        return sum;
    }

    public static String getLongestWord(List<String> listOfWords) {
        String longestWord = null;
        for (String word: listOfWords) {
            if (longestWord == null || word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

}
