package ex33;

import java.util.Random;

public class MagicBall {
    private String[] responses = {"Yes.", "No.", "Maybe.", "Ask again later."};
    public final Random rand = new Random();

    public String randomResponse(){
        int RandomNumber = rand.nextInt(4);
        return generateOutput(RandomNumber);
    }
    public String generateOutput(int num){
        return responses[num];

    }
}
