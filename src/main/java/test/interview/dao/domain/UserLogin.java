package test.interview.dao.domain;

/**
 * Created by kasar on 3/16/2017.
 */
public class UserLogin {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    String userName ;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String password;
    @Override
    public String toString(){

        return "Username "+ userName;
    }
}
