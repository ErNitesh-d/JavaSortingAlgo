import java.util.*;

public class sorting {
    public static void main(String[] args) {
        // SELECTIONSORT
        // Scanner sc=new Scanner(System.in);
        // int n=6;
        // int[] arr=new int[n];
        // for(int i=0;i<arr.length;i++){
        // System.out.println("Enter "+i+"th: ");
        // arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<n-1;i++){
        // int min=i;
        // for(int j=i+1;j<n;j++){
        // if(arr[j]<arr[min]){
        // min=j;
        // }
        // }
        // if(min!=0){
        // int temp=arr[i];
        // arr[i]=arr[min];
        // arr[min]=temp;
        // }
        // }
        // for(int i=0;i<=n-1;i++){
        // System.out.println(arr[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int n = 6;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + "ELEMENT "+(i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("enter Enter the position to find the k-th minimum and maximum elements (1-based index): : ");
        int find = sc.nextInt();
        System.out.println(find + "th" + "Minimum is :" + arr[find - 1]);
        System.out.println(find + "th Maximum is: " + arr[n - find]);
    }

}