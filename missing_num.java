import java.util.*;
public class missing_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
        int count = 0;
        int k = 0;
        int num = 1;
        int [] missing = new int [largest];
        for(int i = 0; i < largest; i++){
            for(int j = 0; j < n; j++) {
                if(num == arr[j]){
                    num++;
                    count = 0;
                }
                else{
                    count++;
                }
            }
            if(count > 0 && num < largest){
                missing[k] = num;
                k++;
            }
            num++;
            count = 0;
        }
        System.out.println("Missing numbers: ");
        for(int i = 0; i < k; i++){
            System.out.print(missing[i] + ",");
        }
    }
}