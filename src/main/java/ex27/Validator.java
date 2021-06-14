package ex27;

public class Validator {
    private String firstName;
    private String lastName;
    private String id;
    private String zip;
    boolean errorFound = false;

    public Validator(String first, String last, String employeeid, String zipcode) {
        this.firstName = first;
        this.lastName = last;
        this.id = employeeid;
        this.zip = zipcode;
    }

    public boolean isErrorFound() {
        return errorFound;
    }

    public String validateFirstName(){
        boolean isFilled = false;
        boolean isGreaterThanTwo = false;

        if(firstName.length() > 0)
            isFilled = true;
        else {
            if (firstName.length() > 2) {
                isGreaterThanTwo = true;
            }
        }
        if(!isFilled){
            errorFound = true;
            return("The first name must be filled in.\n");
        }
        else if(!isGreaterThanTwo) {
            errorFound = true;
            return ("The first name must be at least 2 characters long.\n");
        }
        else
            return "";
    }

    public String validateLastName(){
        boolean isFilled = false;
        boolean isGreaterThanTwo = false;

        //verify its filled if has length
        if(lastName.length() > 0)
            isFilled = true;

        //verifies it has two or more chars
        else {
            if (lastName.length() > 2) {
                isGreaterThanTwo = true;
            }
        }
        if(!isFilled){
            errorFound = true;
            return("The last name must be filled in.\n");
        }
        else if(!isGreaterThanTwo){
            errorFound = true;
            return("The last name must be at least 2 characters long.\n");
        }

        else
            return "";
    }

    public String validateID(){
        int counter = 0;
        char[] arr = id.toCharArray();

        //verify that each part of the id matches the correct format through ascii
        for(int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                int ascii = arr[j];
                if (ascii >= 65 && ascii <= 90)
                    counter ++;
            }
            if ((int) arr[2] == '-')
                counter ++;
            for(int f = 3; f < 7; f ++){
                int ascii = arr[f];
                if(ascii <= 57 && ascii >= 48)
                    counter ++;
            }
        }
        if(counter != 7){
            errorFound = true;
            return "The employee ID must be in the format of AA-1234.\n";
        }
        else
            return "";
    }
    public String validateZIP(){
        int counter = 0;
        //validate each ascii is between 48 and 57 inclusive to verify each is a number
        char[] arr = zip.toCharArray();
        for(int i = 0; i < 5; i ++) {
            int ascii = arr[i];
            if (ascii <= 57 && ascii >= 48)
                counter++;
        }
        if(counter != 5) {
            errorFound = true;
            return "The zipcode must be a 5 digit number.\n";
        }
        else
            return "";
    }
}
