import java.util.*;
public class string_length_2 {
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        Scanner sc = new Scanner(System.in);
        char[] word = new char[200];
        int j = 0;
        int m;
        int max_length = 0;
        int n1 = 0;
        char[] ch = new char[200];
        String str = sc.nextLine();
        int flag = 0;
        int size;
        int n2 = 1;
        int n4 = 0;
        int n3 = 0;
        int flag1 = 0;
        int num = 0;
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
                    flag1 = 0;
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
                        if(n4 > 0) {
                            word[(j / 2) - 1] = ',';
                            n3 = j / 2;
                            num++;
                        }
                        else{
                            word[j-1] = ',';
                            n3 = j;
                        }
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
            flag = 0;
        }
        if (flag1 == 0) {
            System.out.print("The longest word in given string is ");
            for (int l = 0; l < max_length; l++) {
                System.out.print(word[l]);
            }
            System.out.print(" with length " + max_length);
        }
        else {
            if (n4 > 0) {
                System.out.print("The word having maximum length appears more than once i.e ");
                for (int i = 0; i < max_length; i++) {
                    System.out.print(word[i]);
                }
                System.out.println();
            }
            if(n2 > 0) {
                System.out.print("There are more than one word in string having maximum length i.e ");
                if (num > 0) {
                    size = (max_length * n2) + (n2 / 2) - n3;
                }
                else{
                    size = (max_length * n2) + (n2 / 2);
                }
                for (int i = 0; i <= size  ; i++) {
                    System.out.print(word[i]);
                }
            }
            System.out.print(" with length " + max_length);
        }
    }
}