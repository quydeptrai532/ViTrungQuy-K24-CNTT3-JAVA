public class Ex06 {

    public static class User {
        private int id;
        private String username;
        private String password;
        private String email;

        public User(int id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            setPassword(password);
            setEmail(email);
        }

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public void setPassword(String password) {
            if (password == null || password.isEmpty()) {
                System.out.println("Password khong duoc rong!");
            } else {
                this.password = password;
            }
        }

        public void setEmail(String email) {
            if (email != null && email.contains("@")) {
                this.email = email;
            } else {
                System.out.println("Email khong hop le!");
            }
        }

        public void printInfo() {
            System.out.println("ID: " + id);
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        User u1 = new User(1, "quydz", "123456", "quydz@gmail.com");
        u1.printInfo();

        User u2 = new User(2, "user2", "abcdef", "user2gmail.com");
        u2.printInfo();

        User u3 = new User(3, "user3", "", "user3@gmail.com");
        u3.printInfo();
    }
}
