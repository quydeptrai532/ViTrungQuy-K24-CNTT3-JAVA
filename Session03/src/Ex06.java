public class Ex06 {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void mergeBooks(int[] a, int[] b){
         int i=0,j=0;
         int [] temp=new int[a.length+b.length];
         int k=0;
         while(i<a.length && j<b.length){
             if(a[i]<b[j]){
                 if(k==0 || temp[k-1]!=a[i]){
                     temp[k++]=a[i];
                     i++;
                 }
             }
             else
                 if(a[i]>b[j]){
                 if(k==0 || temp[k-1]!=b[j]){
                     temp[k++]=b[j];
                     j++;
                 }


             } else  if(a[i]==b[j]){
                     temp[k++]=a[i];
                     i++;
                     j++;
                 }

         }
         while (i<a.length){
             temp[k++]=a[i];
             i++;
         }
         while (j<b.length){
             temp[k++]=b[j];
             j++;
         }
         int []arrayMerge=java.util.Arrays.copyOf(temp,k);  
         for (int e :arrayMerge){
             System.out.printf("[%d ]",e);
         }

    }
    public static void main(String[] args) {
        int[] arrayFirst=new int[] {3,1,9,7,5};
        int[] arraySecond=new int[] {10,2,7,1,8,6,4};
        bubbleSort(arrayFirst);
        bubbleSort(arraySecond);
        mergeBooks(arrayFirst,arraySecond);
    }
}
