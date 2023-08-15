//WAP to take input a string by the user and find the word with maximum letter
// WAP to take input a number by the user and calculate frequency of each digit in that number
import java.util.*;
public class string_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = new char[100];
        int j = 0;
        int max_length = 0;
        int n1 = 0;
        char[] ch = new char[100];
        String str = sc.nextLine();
        //noinspection ResultOfMethodCallIgnored
        str.toCharArray();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            ch[i] = str.charAt(i);
        }
        for (int i = 0; i <= n; i++) {
            if (ch[i] == ' ' || i == n ) {
                for (int k = j; k < i; k++) {
                    n1++;
                }
                if (n1 > max_length) {
                    max_length = n1;
                    for(int k = 0; k < n1; k++){
                        word[k] = ch[j];
                        j++;
                    }
                }
                j = i + 1;
            }
            n1 = 0;
        }
        System.out.print("The longest word in given string is ");
        for (int l = 0; l < max_length; l++) {
            System.out.print(word[l]);
        }
        System.out.print(" with length "+max_length);
    }
}