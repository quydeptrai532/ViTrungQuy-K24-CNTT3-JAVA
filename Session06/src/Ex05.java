public class Ex05 {
    public static class Book {
        private String bookId;
        private String bookName;
        private String authorName;
        public Book(String bookId, String bookName, String authorName) {
            // this trỏ tới ĐỐI TƯỢNG HIỆN TẠI
            this.bookId = bookId;
            this.bookName = bookName;
            this.authorName = authorName;
        }
        public void printInfo() {
            System.out.println("Ma sach: " + this.bookId);
            System.out.println("Ten sach: " + this.bookName);
            System.out.println("Tac gia: " + this.authorName);
        }
    }
    public static void main(String[] args) {
        Book b1 = new Book("B01", "Lap trinh Java", "Nguyen Van A");
        b1.printInfo();
    }
}
