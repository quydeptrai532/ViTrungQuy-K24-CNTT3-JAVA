import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bookName;
        String authorName;
        System.out.println("Moi ban nhap vao tem sach:");
        bookName=sc.nextLine();
        System.out.println("Moi ban nhap vao ten tac gia");
        authorName=sc.nextLine();
        String newbookName=bookName.trim().toUpperCase();
        authorName=authorName.trim().replaceAll("\\s+"," ");
        StringBuilder newAuthorName = new StringBuilder();
        for (String w : authorName.split(" ")) {
            newAuthorName.append(w.substring(0, 1).toUpperCase())
                    .append(w.substring(1).toLowerCase())
                    .append(" ");
        }
        System.out.printf("[%s]%n",newbookName);
        System.out.printf("Ten tac gia :%s",newAuthorName);
        sc.close();
    }
}
