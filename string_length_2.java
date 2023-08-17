import java.util.*;
public class string_length_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = new char[100];
        int j = 0;
        int m;
        int max_length = 0;
        int n1 = 0;
        char[] ch = new char[100];
        String str = sc.nextLine();
        int flag = 0;
        int n2 = 1;
        int n4 = 0;
        int flag1 = 0;
        //noinspection ResultOfMethodCallIgnored
        str.toCharArray();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            ch[i] = str.charAt(i);
        }
        for (int i = 0; i <= n; i++) {
            if (ch[i] == ' ' || i == n) {
                for (int k = j; k < i; k++) {
                    n1++;
                }
                if (n1 > max_length) {
                    max_length = n1;
                    for (int k = 0; k < n1; k++) {
                        word[k] = ch[j];
                        j++;
                    }
                }
                else if (max_length == n1) {
                    m = j ;
                    for (int r = 0; r < n1; r++) {
                        if (word[r] == ch[m]) {
                            flag++;
                            n4++;
                        }
                    }
                    n2++;
                    if (flag == 0) {
                        word[n1] = ',';
                        int n3 = n1+1;
                        for (int q = n3; q <= i; q++) {
                            word[q] = ch[j];
                            j++;
                        }
                        flag1++;
                    }
                }
                j = i + 1;
            }
            n1 = 0;
        }
        if (flag == 0 && flag1 == 0) {
            System.out.print("The longest word in given string is ");
            for (int l = 0; l < max_length; l++) {
                System.out.print(word[l]);
            }
            System.out.print(" with length " + max_length);
        }
        else {
            System.out.print("There are more than one word in string having maximum length i.e. ");
            if (n4 > 0) {
                for (int i = 0; i < max_length * n4; i++) {
                    System.out.print(word[i]);
                }
            }
            else {
                for (int i = 0; i <= max_length * n2; i++) {
                    System.out.print(word[i]);
                }
            }
            System.out.print(" with length " + max_length);
        }
    }
}

