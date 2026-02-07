import java.util.Scanner;

class Heapify{

    void Method(int arr[],int n,int i){

          int largest = i;

          int l = 2*i + 1;
          int r = 2*i + 2;

          if(l<n &&  arr[largest] < arr[l]){
              largest = l;
          }

        if(r<n &&  arr[largest] < arr[r]){
            largest = r;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i]  = arr[largest];
            arr[largest] = temp;
            Method(arr,n,largest);
        }



    }


}

class Sort {


    void heapSort(int arr[], int n) {

        Heapify h = new Heapify();


        for (int i = n / 2 - 1; i >= 0; i--) {
            h.Method(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0]  = arr[i];
            arr[i] = temp;

            h.Method(arr,i,0);

        }
    }

}

    public class Main{

   public static void main(String[] args) {

        Sort Sort = new Sort();


        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of digit in array ");

        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.println("enter numbers");

        for (int i = 0;i<size;i++){
            arr[i] = s.nextInt();
        }

        Sort.heapSort(arr,size);

       for (int i = 0; i < size; i++) {
           System.out.print(arr[i] + " ");
       }



    }

}