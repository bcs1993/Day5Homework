public class User {
    public static void main(String[] args) {
        User brian = new User("Brian", "Smith", "brianc123", "123456");
        User amber = new User("Amber", "Smith", "ambern123", "654321");

    }
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;

    public User(String firstName, String lastName, String userName, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = passWord;


    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public User() {
        this.firstName = "unknown";
        this.lastName = "unknown";
        this.userName = "unknown";
        this.passWord = "unknown";

    }


}
