import java.util.*;
public class number_frequency {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = num;
        int val = 0;
        int n = 1;
        int m = 0;
        while (num != 0) {
            num = num / 10;
            val++;
        }
        for (int i = val; i > 0; i--) {
            arr[i] = num2 % 10;
            num2 = num2 / 10;
        }
        for (int i = 1; i <= val; i++) {
            for (int j = i+1 ; j <= val; j++) {
                if (arr[i] == arr[j]) {
                    n++;
                }
            }
            for (int k = 1; k < i; k++) {
               if (arr[k] == arr[i]) {
                 m++;
               }
            }
            if (m == 0) {
                System.out.println("the number " + arr[i] + " appears: " + n);
            }
            else{
                m = 0;
            }
            n = 1;
        }
    }
}