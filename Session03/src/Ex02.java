import java.util.Scanner;
public class Ex02 {
    static void searchBooks(String[] arr,String search){

        boolean found=false;
        for (int i=0;i< arr.length;i++){
            if(arr[i].equalsIgnoreCase(search)){
                System.out.println("Tim thay sach:" +arr[i]+ " Tai vi tri so:" +i);
                found=true;
            }

        }
        if (!found){
            System.out.println("Khong tin thay sach");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] Books =new String[]{"Quydz1","Doraemon","Xagent","CornTub","BigHamter"};
        String findBook;
        System.out.println("Moi ban nhap  vao ten sach can tim:");
        findBook=sc.nextLine();
        searchBooks(Books,findBook);
        sc.close();
    }
}
