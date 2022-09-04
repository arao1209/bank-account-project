package module;

import java.util.List;

public class Bank {

    private String bankName;
    private List<User> usersList;

    public Bank(){

    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<User> getUsers() {
        return usersList;
    }

    public void setUsers(List<User> usersList) {
        this.usersList = usersList;
    }
}
