import java.util.*;

public class codeCamp1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the array: ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the sum required: ");
        int m = sc.nextInt();
        int flag = 0;


        for (int i = 0; i < N-1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == m) {
                    System.out.println("Sum of " + arr[i] + " and " + arr[j] + " is " + m);
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0) {
            System.out.println("-1");
        }

    }
}
