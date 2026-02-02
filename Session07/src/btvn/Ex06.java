package btvn;

public class Ex06 {
    static class User{
        private final int userId;
        private String userName;
        private String passWord;

        public User(int userId, String userName, String passWord) {
            this.userId = userId;
            this.userName = userName;
            this.passWord = passWord;
        }
        void displayInfo(){
            System.out.println("id:" + this.userId +" ten:" + this.userName + "Password:*******");
        }
    }
    static class UserManager{
         static User[] users=new User[100];
         static int count=0;
         static void addUser(User u){
                if(count<users.length){
                    users[count]=u;
                    count++;
                }
         }
        static boolean checkLogin(String name, String pass) {
            for (int i = 0; i < count; i++) {
                User u = users[i];
                if (u.userName.equals(name) && u.passWord.equals(pass)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        User us1 = new User(1, "Quydz1", "ChimToLamEmHo");
        User us2 = new User(2, "Quydz2", "ChimBelamEmTe");
        User us3 = new User(3, "Quydz3", "ChimBuDungChongCu");
        UserManager.addUser(us1);
        UserManager.addUser(us2);
        UserManager.addUser(us3);
        System.out.println("Dang nhap dung:");
        System.out.println(
                UserManager.checkLogin("Quydz1", "ChimToLamEmHo")
        );
        System.out.println("Dang nhap sai mat khau:");
        System.out.println(
                UserManager.checkLogin("Quydz1", "saiMatKhau")
        );
        System.out.println("Dang nhap tai khoan khong ton tai:");
        System.out.println(
                UserManager.checkLogin("abc", "123")
        );

    }
}
