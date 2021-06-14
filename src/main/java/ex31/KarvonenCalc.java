package ex31;

public class KarvonenCalc {
    private int pulse;
    private int age;

    public KarvonenCalc(int pulse, int age) {
        this.pulse = pulse;
        this.age = age;
    }

    public void printTable(){
        System.out.print("Intensity    | Rate\n-------------|--------\n");
        for (int i = 55; i <= 95; i+=5){
            System.out.printf("%d%%          | %d bpm\n",i, calcBPM(i));
        }
    }
    public int calcBPM(int i){
        return (int)(((((220-age)-pulse) * ((double)i/100)) + pulse));
    }
}
