package ex25;

public class PasswordComplexity {
    private String password;
    private int flag;

    public PasswordComplexity(String password) {
        this.password = password;
        flag = passwordValidator(password);
    }

    public String getPassword() {
        return password;
    }

    public int getFlag() {
        return flag;
    }

    public int passwordValidator(String password){
        //making string into array for comparing
        char[] arr = password.toCharArray();
        //has booleans to verify criteria
        boolean hasNumbers = false;
        boolean hasLetters = false;
        boolean hasSpecial = false;

        for(int i = 0; i < password.length(); i ++){
            int ascii = arr[i];
            if((ascii <= 122 && ascii >= 97) || (ascii <= 90 && ascii >= 65))
                hasLetters = true;
            else if((ascii <= 38 && ascii >= 33) || (ascii <= 64 && ascii >= 63))
                hasSpecial = true;
            else if(ascii <= 57 && ascii >= 48)
                hasNumbers = true;
        }

        if(password.length() >= 8 && hasNumbers && hasLetters && hasSpecial){
            return  4;
        }
        else if(password.length() >= 8 && hasNumbers && hasLetters){
            return  3;
        }
        else if(password.length() < 8 && hasLetters && !hasNumbers && !hasSpecial){
            return  2;
        }
        else if(password.length() < 8 && hasNumbers && !hasLetters && !hasSpecial)
            return 1;
        else
            return 0;
    }

}
