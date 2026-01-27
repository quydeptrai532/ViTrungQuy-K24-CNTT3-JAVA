public class Ex04 {
    static void sortBooks(int [] arr){
          for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr.length-1;j++){
                  if(arr[j]>arr[j+1]){
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                  }
              }
          }
    }
    static void displayBooks(String text,int [] arr){
            System.out.printf("%s :",text);
            for (int i=0;i< arr.length;i++){
                System.out.printf("%d ",arr[i]);
            }
            System.out.println("");
    }
    public static void main(String[] args) {
        int []arr=new int[] {9,7,3,8,7,16,0,2};
        displayBooks("Truoc khi sap xep",arr);
        sortBooks(arr);
        displayBooks("Sau khi sap xep",arr);
    }
}
