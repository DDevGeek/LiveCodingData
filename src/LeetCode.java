import java.util.ArrayList;
import java.util.List;

public class LeetCode {
    public static void main(String[] args) {
        String[] words = new String[]{"leet","code"};
        int[] nums = new int[]{1,2,3,1,1,3};
        System.out.println(findWordsContaining(words, 'e'));
        System.out.println(numIdenticalPairs(nums));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static int numIdenticalPairs(int[] nums) {
        int numOgGoodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j > i && nums[i] == nums[j]) {
                    numOgGoodPairs += 1;
                }
            }
        }

        return numOgGoodPairs;
    }
}


