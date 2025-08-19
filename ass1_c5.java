import java.util.*;

public class AlternateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Alternate characters: ");
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
