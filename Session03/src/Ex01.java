import java.util.Scanner;
public class Ex01 {
    static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] displayLibraries = new int[n];
        for (int i = 0; i < displayLibraries.length; i++) {
            System.out.println("Moi ban nhap vao ma cho sach so " + (i + 1) + ":");
            displayLibraries[i] = sc.nextInt();
        }
        return displayLibraries;
    }
    static void displayLibraries(int[] arr) {
        System.out.println("---- KET QUA ----");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so luong sach can quan ly:");
        int n = sc.nextInt();
        int[] books = addBookToLibraries(n);
        displayLibraries(books);
        sc.close();
    }
}
