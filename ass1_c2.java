public class ReverseWords {
    public static void main(String[] args) {
        String[] words = {"Hello", "Java", "World"};

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.println(reversed);
        }
    }
}
import java.util.*;

