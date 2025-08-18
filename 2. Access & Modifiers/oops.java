public class oops {
    public static void main(String[] args) {

        BankAccount myAcc = new BankAccount();
        myAcc.username = "aditiDas";
        myAcc.setPassword("abcdefghi");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String Pwd) {
        password = Pwd;
    }
}

