package ex25;

public class PasswordComplexity {
    private String password;
    private String flag;

    public PasswordComplexity(String password) {
        this.password = password;
        flag = passwordValidator(password);
    }

    public String getPassword() {
        return password;
    }

    public String getFlag() {
        return flag;
    }

    public String passwordValidator(String password){

        if(password.length() < 8){
            return  "very weak";
        }

        return "no flag";
    }

}
