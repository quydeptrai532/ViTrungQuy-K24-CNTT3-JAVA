import java.util.Scanner;
public class Ex05 {
    static int deleteBook(int [] arr,int n,int bookId){
            int index=-1;
            for(int i=0;i<n;i++){
                if(bookId==arr[i]){
                    index=i;
                    break;
                }
            }
            if(index==-1){
            System.out.println("Khong tim thay ma sach can xoa");
            return n;
           }
            for(int i=index;i<n-1;i++){
                    arr[i]=arr[i+1];
                }
                System.out.println("Da xoa ma sach:" + bookId);
           return n-1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []book =new int[] {101,102,103,104,105};
        int bookIdDel;
        int size=5;
        while (true){
            System.out.println("Nhap ma sach can xoa (0 de thoat)");
            bookIdDel=sc.nextInt();
            if(bookIdDel==0){
                break;
            }
             size=deleteBook(book,size,bookIdDel);
            System.out.printf("Kho sach hien tai[%d cuon] %n",size);
            for (int i=0;i<size;i++){
                System.out.printf("%d ",book[i]);
            }
        }
        sc.close();
    }
}
