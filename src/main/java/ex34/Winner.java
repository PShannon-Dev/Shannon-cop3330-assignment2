package ex34;

import java.util.Random;

public class Winner {
    static final Random rand = new Random();
    private String[] list = new String[]{};

    public void setList(String[] list) {
        this.list = list;
    }

    public String generateWinner(){
        int randomNumber = rand.nextInt(list.length);
        return list[randomNumber];
    }

}
